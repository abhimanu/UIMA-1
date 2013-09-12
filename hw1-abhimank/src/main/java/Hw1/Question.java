

/* First created by JCasGen Wed Sep 11 21:47:24 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This is the question class for modelling the questions that encapsulates the properties of the question
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * XML source: /home/abhimank/git/hw1-abhimank/hw1-abhimank/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: sentence

  /** getter for sentence - gets This is the actual body of the question which is encapsulated by the sentence class
   * @generated */
  public Sentence getSentence() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "Hw1.Question");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets This is the actual body of the question which is encapsulated by the sentence class 
   * @generated */
  public void setSentence(Sentence v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "Hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: questionId

  /** getter for questionId - gets This is the unique id of the question
   * @generated */
  public int getQuestionId() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "Hw1.Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_questionId);}
    
  /** setter for questionId - sets This is the unique id of the question 
   * @generated */
  public void setQuestionId(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "Hw1.Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_questionId, v);}    
  }

    