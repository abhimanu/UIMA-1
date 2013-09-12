

/* First created by JCasGen Wed Sep 11 21:47:24 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.TOP;


/** This class captures the confidence and source of the annotation
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * XML source: /home/abhimank/git/hw1-abhimank/hw1-abhimank/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class ConfidenceEntity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ConfidenceEntity.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ConfidenceEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ConfidenceEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ConfidenceEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ConfidenceEntity(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets This is the source of the anotation/label
   * @generated */
  public TOP getSource() {
    if (ConfidenceEntity_Type.featOkTst && ((ConfidenceEntity_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "Hw1.ConfidenceEntity");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ConfidenceEntity_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets This is the source of the anotation/label 
   * @generated */
  public void setSource(TOP v) {
    if (ConfidenceEntity_Type.featOkTst && ((ConfidenceEntity_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "Hw1.ConfidenceEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((ConfidenceEntity_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets This is the confidence score of the annotation
   * @generated */
  public float getConfidence() {
    if (ConfidenceEntity_Type.featOkTst && ((ConfidenceEntity_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "Hw1.ConfidenceEntity");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((ConfidenceEntity_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets This is the confidence score of the annotation 
   * @generated */
  public void setConfidence(float v) {
    if (ConfidenceEntity_Type.featOkTst && ((ConfidenceEntity_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "Hw1.ConfidenceEntity");
    jcasType.ll_cas.ll_setFloatValue(addr, ((ConfidenceEntity_Type)jcasType).casFeatCode_confidence, v);}    
  }

    