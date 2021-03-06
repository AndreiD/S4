/** Self-Service Semantic Suite (S4)
* Copyright (c) 2014, Ontotext AD, All rights reserved.
* 
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 3.0 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
* 
* You should have received a copy of the GNU Lesser General Public
* License along with this library.
*/
package com.ontotext.s4.TwitterVisualization.viz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TwitterReader {

	public static Logger logger=Logger.getLogger(TwitterReader.class);
	
	private static final String DEFAULT_IN_DATA_FOLDER = "data/processedTweets";
	private static final String DEFAULT_OUT_FOLDER = "html";
	
	private String[] timelineTerms;
	private String inDataPath;
	private String outPath;
	private List<Tweet> alltweets = new ArrayList<Tweet>();
	
	/**
	 * Initializes TwitterReader object
	 * @param timelineTerms Terms on what we want to create the timeline Visualization.
	 * @param inDataPath Processed tweets folder.
	 * @param outPath Output folder. This is the folder with *.htm files.
	 */
	public TwitterReader(String[] timelineTerms, String inDataPath,
			String outPath) {
		this.timelineTerms = timelineTerms;
		setInDataPath(inDataPath);
		setOutPath(outPath);
	}
	
	/**
	 * 
	 * @return Folder with processed tweets.
	 */
	public String getInDataPath() {
		return inDataPath;
	}

	/**
	 * This method sets processed tweets folder
	 * @param inDataPath Path to processed tweets folder.
	 */
	public void setInDataPath(String inDataPath) {
		if (inDataPath != null) {
			this.inDataPath = inDataPath;
		} else {
			this.inDataPath = DEFAULT_IN_DATA_FOLDER;
		}
	}

	/**
	 * @return Output folder.
	 */
	public String getOutPath() {
		return outPath;
	}

	/**
	 * This method sets the output directory
	 * @param outPath Path to the output directory
	 */
	public void setOutPath(String outPath) {
		if (outPath != null) {
			this.outPath = outPath;
		} else {
			this.outPath= DEFAULT_OUT_FOLDER;
		}
	}

	
	/**
	 * This method will create visualizations.
	 * It will take tweets from the processed tweets folder.
	 * It will save js files with visualizations data into output folder.
	 * @throws Exception
	 */
	public void startVisualisation() throws Exception {
		File inDir = new File(inDataPath);
		if (inDir.exists() == false) {
			System.out.println("Input directory not found: "
					+ inDir.getAbsolutePath());
			return;
		}
		File resultFile = new File(outPath);
		if (false == resultFile.exists()) {
			resultFile.mkdirs();
		}

		List<String> todoList = scanFolder(new LinkedList<String>(), inDir);
		if (todoList.size() == 0) {
			System.out.println("Nothing to process, terminating");
			return;
		}

		for (String inPath : todoList) {
			try {
				processSingleFile(inPath);
			} catch (Throwable err) {
				err.printStackTrace();
			}
		}
		String tableData = TableAggregator.process(alltweets);
		FileOutputStream tableFile = new FileOutputStream(new File(resultFile,
				"table.js"));
		tableFile.write(tableData.getBytes("UTF-8"));
		tableFile.close();

		String geoData = MapAggregator.process(alltweets);
		tableFile = new FileOutputStream(new File(resultFile, "mapdata.js"));
		tableFile.write(geoData.getBytes("UTF-8"));
		tableFile.close();

		String pieData = PieAggregator.process(alltweets);
		tableFile = new FileOutputStream(new File(resultFile, "piedata.js"));
		tableFile.write(pieData.getBytes("UTF-8"));
		tableFile.close();

		String termsData = TermsAggregator.process(alltweets);
		tableFile = new FileOutputStream(new File(resultFile, "terms.txt"));
		tableFile.write(termsData.getBytes("UTF-8"));
		tableFile.close();

		if (timelineTerms.length > 0) {
			String timelineData = TimelineAggregator.process(alltweets,
					timelineTerms);
			tableFile = new FileOutputStream(
					new File(resultFile, "timeline.js"));
			tableFile.write(timelineData.getBytes("UTF-8"));
			tableFile.close();
		}

		logger.info("Completed");
	}

	/**
	 * This method will read one processed file and load it into the List of tweets.
	 * @param inPath path to file.
	 * @throws Exception
	 */
	private void processSingleFile(String inPath) throws Exception {
		// System.out.println("Processing " + inPath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(inPath), "utf-8"));
		JsonParser parser = new JsonParser();
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.trim().length() == 0) {
				continue;
			}
			try {
				JsonElement twData = parser.parse(line);
				if (false == twData.isJsonObject()) {
					continue;
				}
				String text = twData.getAsJsonObject().get("text")
						.getAsString();
				Tweet tweet = new Tweet(text);
				tweet.date = parseDateToJson(twData.getAsJsonObject());

				if (twData.getAsJsonObject().has("entities")) {
					JsonObject entObject = twData.getAsJsonObject()
							.get("entities").getAsJsonObject();
					if (entObject.has("Location")) {
						JsonArray arrLocs = entObject.get("Location")
								.getAsJsonArray();
						for (int i = 0; i < arrLocs.size(); i++) {
							int startOffs = arrLocs.get(i).getAsJsonObject()
									.get("indices").getAsJsonArray().get(0)
									.getAsInt();
							int endOffs = arrLocs.get(i).getAsJsonObject()
									.get("indices").getAsJsonArray().get(1)
									.getAsInt();
							String token = text.substring(startOffs, endOffs);
							tweet.locs.add(token.replace('\n', ' '));
						}
					}
					if (entObject.has("Person")) {
						JsonArray arrLocs = entObject.get("Person")
								.getAsJsonArray();
						for (int i = 0; i < arrLocs.size(); i++) {
							int startOffs = arrLocs.get(i).getAsJsonObject()
									.get("indices").getAsJsonArray().get(0)
									.getAsInt();
							int endOffs = arrLocs.get(i).getAsJsonObject()
									.get("indices").getAsJsonArray().get(1)
									.getAsInt();
							String token = text.substring(startOffs, endOffs);
							tweet.people.add(token.replace('\n', ' '));
						}
					}
					if (entObject.has("Organization")) {
						JsonArray arrLocs = entObject.get("Organization")
								.getAsJsonArray();
						for (int i = 0; i < arrLocs.size(); i++) {
							int startOffs = arrLocs.get(i).getAsJsonObject()
									.get("indices").getAsJsonArray().get(0)
									.getAsInt();
							int endOffs = arrLocs.get(i).getAsJsonObject()
									.get("indices").getAsJsonArray().get(1)
									.getAsInt();
							String token = text.substring(startOffs, endOffs);
							tweet.orgs.add(token.replace('\n', ' '));
						}
					}
					if (entObject.has("Hashtag")) {
						JsonArray arrLocs = entObject.get("Hashtag")
								.getAsJsonArray();
						for (int i = 0; i < arrLocs.size(); i++) {
							String token = arrLocs.get(i).getAsJsonObject()
									.get("string").getAsString();
							tweet.htags.add(token.replace('\n', ' '));
						}
					}
				}
				this.alltweets.add(tweet);
			} catch (Throwable any) {
				any.printStackTrace();
			}
		}
		reader.close();

	}

	private static DateFormat formatter = new SimpleDateFormat(
			"EEE MMM d HH:mm:ss zzzz yyy",Locale.UK);

	/**
	 * This method parse "created_at" date from a tweet  
	 * @param twData One tweet loaded into JsonObject.
	 * @return String with date into format 'YYYY-MM-DD HH:mm'
	 * @throws Exception
	 */
	private static String parseDateToJson(JsonObject twData) throws Exception {
		if (twData.has("created_at")) {
			Date date = formatter.parse(twData.get("created_at").getAsString());
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(date);
			StringBuffer stringBuffer=new StringBuffer();
			stringBuffer.append(calendar.get(Calendar.YEAR)).append('-')
			.append(calendar.get(Calendar.MONTH)<10?"0"+calendar.get(Calendar.MONTH):calendar.get(Calendar.MONTH)).append('-')
			.append(calendar.get(Calendar.DATE)<10?"0"+calendar.get(Calendar.DATE):calendar.get(Calendar.DATE)).append(' ')
			.append(calendar.get(Calendar.HOUR)<10?"0"+calendar.get(Calendar.HOUR):calendar.get(Calendar.HOUR)).append(':')
			.append(calendar.get(Calendar.MINUTE)<10?"0"+calendar.get(Calendar.MINUTE):calendar.get(Calendar.MINUTE));
			return stringBuffer.toString();

		}
		return null;
	}

	/**
	 * This method will list all files into the folder.
	 * @param buffer List of files
	 * @param file Path to the folder
	 * @return List of files
	 */
	private static List<String> scanFolder(List<String> buffer, File file) {
		if (false == file.exists()) {
			return buffer;
		}
		if (file.isDirectory()) {
			for (File ff : file.listFiles()) {
				scanFolder(buffer, ff);
			}
			return buffer;
		}
		buffer.add(file.getAbsolutePath());
		return buffer;
	}

	

}
