

/* First created by JCasGen Tue Mar 10 17:39:00 EET 2015 */
package com.ontotext.s4.api.types.news;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Automatically generated type for RelationPersonHasPositionWithinLocation
 * Updated by JCasGen Tue Mar 10 17:39:00 EET 2015
 * XML source: desc/news_typesystem.xml
 * @generated */
public class RelationPersonHasPositionWithinLocation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationPersonHasPositionWithinLocation.class);
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
  protected RelationPersonHasPositionWithinLocation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationPersonHasPositionWithinLocation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationPersonHasPositionWithinLocation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RelationPersonHasPositionWithinLocation(JCas jcas, int begin, int end) {
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
  //* Feature: organization1Str

  /** getter for organization1Str - gets Feature <organization1Str> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getOrganization1Str() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organization1Str == null)
      jcasType.jcas.throwFeatMissing("organization1Str", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organization1Str);}
    
  /** setter for organization1Str - sets Feature <organization1Str> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrganization1Str(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organization1Str == null)
      jcasType.jcas.throwFeatMissing("organization1Str", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organization1Str, v);}    
   
    
  //*--------------*
  //* Feature: organizationUri

  /** getter for organizationUri - gets Feature <organizationUri> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getOrganizationUri() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organizationUri == null)
      jcasType.jcas.throwFeatMissing("organizationUri", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organizationUri);}
    
  /** setter for organizationUri - sets Feature <organizationUri> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrganizationUri(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organizationUri == null)
      jcasType.jcas.throwFeatMissing("organizationUri", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organizationUri, v);}    
   
    
  //*--------------*
  //* Feature: organization1Uri

  /** getter for organization1Uri - gets Feature <organization1Uri> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getOrganization1Uri() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organization1Uri == null)
      jcasType.jcas.throwFeatMissing("organization1Uri", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organization1Uri);}
    
  /** setter for organization1Uri - sets Feature <organization1Uri> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrganization1Uri(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organization1Uri == null)
      jcasType.jcas.throwFeatMissing("organization1Uri", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organization1Uri, v);}    
   
    
  //*--------------*
  //* Feature: relType

  /** getter for relType - gets Feature <relType> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getRelType() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_relType == null)
      jcasType.jcas.throwFeatMissing("relType", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_relType);}
    
  /** setter for relType - sets Feature <relType> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelType(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_relType == null)
      jcasType.jcas.throwFeatMissing("relType", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_relType, v);}    
   
    
  //*--------------*
  //* Feature: rule

  /** getter for rule - gets Feature <rule> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getRule() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_rule == null)
      jcasType.jcas.throwFeatMissing("rule", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_rule);}
    
  /** setter for rule - sets Feature <rule> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRule(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_rule == null)
      jcasType.jcas.throwFeatMissing("rule", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_rule, v);}    
   
    
  //*--------------*
  //* Feature: string

  /** getter for string - gets Feature <string> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getString() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_string);}
    
  /** setter for string - sets Feature <string> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setString(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_string == null)
      jcasType.jcas.throwFeatMissing("string", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_string, v);}    
   
    
  //*--------------*
  //* Feature: class_feature

  /** getter for class_feature - gets Feature <class_feature> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getClass_feature() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_class_feature == null)
      jcasType.jcas.throwFeatMissing("class_feature", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_class_feature);}
    
  /** setter for class_feature - sets Feature <class_feature> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClass_feature(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_class_feature == null)
      jcasType.jcas.throwFeatMissing("class_feature", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_class_feature, v);}    
   
    
  //*--------------*
  //* Feature: inst

  /** getter for inst - gets Feature <inst> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getInst() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_inst == null)
      jcasType.jcas.throwFeatMissing("inst", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_inst);}
    
  /** setter for inst - sets Feature <inst> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInst(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_inst == null)
      jcasType.jcas.throwFeatMissing("inst", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_inst, v);}    
   
    
  //*--------------*
  //* Feature: type_feature

  /** getter for type_feature - gets Feature <type_feature> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getType_feature() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_type_feature == null)
      jcasType.jcas.throwFeatMissing("type_feature", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_type_feature);}
    
  /** setter for type_feature - sets Feature <type_feature> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setType_feature(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_type_feature == null)
      jcasType.jcas.throwFeatMissing("type_feature", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_type_feature, v);}    
   
    
  //*--------------*
  //* Feature: organizationStr

  /** getter for organizationStr - gets Feature <organizationStr> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getOrganizationStr() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organizationStr == null)
      jcasType.jcas.throwFeatMissing("organizationStr", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organizationStr);}
    
  /** setter for organizationStr - sets Feature <organizationStr> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrganizationStr(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_organizationStr == null)
      jcasType.jcas.throwFeatMissing("organizationStr", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_organizationStr, v);}    
   
    
  //*--------------*
  //* Feature: quotationStr

  /** getter for quotationStr - gets Feature <quotationStr> for type <RelationPersonHasPositionWithinLocation>
   * @generated
   * @return value of the feature 
   */
  public String getQuotationStr() {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_quotationStr == null)
      jcasType.jcas.throwFeatMissing("quotationStr", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_quotationStr);}
    
  /** setter for quotationStr - sets Feature <quotationStr> for type <RelationPersonHasPositionWithinLocation> 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuotationStr(String v) {
    if (RelationPersonHasPositionWithinLocation_Type.featOkTst && ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeat_quotationStr == null)
      jcasType.jcas.throwFeatMissing("quotationStr", "com.ontotext.s4.api.types.news.RelationPersonHasPositionWithinLocation");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationPersonHasPositionWithinLocation_Type)jcasType).casFeatCode_quotationStr, v);}    
  }

    