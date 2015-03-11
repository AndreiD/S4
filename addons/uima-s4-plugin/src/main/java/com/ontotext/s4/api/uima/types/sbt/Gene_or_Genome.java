

/* First created by JCasGen Tue Mar 10 17:57:37 EET 2015 */
package com.ontotext.s4.api.uima.types.sbt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Automatically generated type for Gene_or_Genome
 * Updated by JCasGen Tue Mar 10 17:57:37 EET 2015
 * XML source: desc/sbt_typesystem.xml
 * @generated */
public class Gene_or_Genome extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene_or_Genome.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Gene_or_Genome() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Gene_or_Genome(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Gene_or_Genome(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Gene_or_Genome(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: string

  /** getter for string - gets Feature <string> for type <Gene_or_Genome>
   * @generated
   * @return value of the feature 
   */
  public String getString() {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_string);}
    
  /** setter for string - sets Feature <string> for type <Gene_or_Genome> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setString(String v) {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_string, v);}    
   
    
  //*--------------*
  //* Feature: class_feature

  /** getter for class_feature - gets Feature <class_feature> for type <Gene_or_Genome>
   * @generated
   * @return value of the feature 
   */
  public String getClass_feature() {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_class_feature == null)
      jcasType.jcas.throwFeatMissing("class_feature", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_class_feature);}
    
  /** setter for class_feature - sets Feature <class_feature> for type <Gene_or_Genome> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass_feature(String v) {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_class_feature == null)
      jcasType.jcas.throwFeatMissing("class_feature", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_class_feature, v);}    
   
    
  //*--------------*
  //* Feature: inst

  /** getter for inst - gets Feature <inst> for type <Gene_or_Genome>
   * @generated
   * @return value of the feature 
   */
  public String getInst() {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_inst == null)
      jcasType.jcas.throwFeatMissing("inst", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_inst);}
    
  /** setter for inst - sets Feature <inst> for type <Gene_or_Genome> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInst(String v) {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_inst == null)
      jcasType.jcas.throwFeatMissing("inst", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_inst, v);}    
   
    
  //*--------------*
  //* Feature: type_feature

  /** getter for type_feature - gets Feature <type_feature> for type <Gene_or_Genome>
   * @generated
   * @return value of the feature 
   */
  public String getType_feature() {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_type_feature == null)
      jcasType.jcas.throwFeatMissing("type_feature", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_type_feature);}
    
  /** setter for type_feature - sets Feature <type_feature> for type <Gene_or_Genome> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setType_feature(String v) {
    if (Gene_or_Genome_Type.featOkTst && ((Gene_or_Genome_Type)jcasType).casFeat_type_feature == null)
      jcasType.jcas.throwFeatMissing("type_feature", "com.ontotext.s4.api.uima.types.sbt.Gene_or_Genome");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_or_Genome_Type)jcasType).casFeatCode_type_feature, v);}    
  }

    