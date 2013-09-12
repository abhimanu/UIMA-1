

/* First created by JCasGen Wed Sep 11 21:47:24 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This is the class that models the answers of the questions and theior attributes
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * XML source: /home/abhimank/git/hw1-abhimank/hw1-abhimank/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Answer extends ConfidenceEntity {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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

  /** getter for sentence - gets This is the sentence body of the answer 
   * @generated */
  public Sentence getSentence() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "Hw1.Answer");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets This is the sentence body of the answer  
   * @generated */
  public void setSentence(Sentence v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "Hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: correct

  /** getter for correct - gets This feature says whether the answer is correct or otherwise
   * @generated */
  public boolean getCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "Hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correct);}
    
  /** setter for correct - sets This feature says whether the answer is correct or otherwise 
   * @generated */
  public void setCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "Hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correct, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets This is the score assigned to the sentence
   * @generated */
  public float getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Hw1.Answer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets This is the score assigned to the sentence 
   * @generated */
  public void setScore(float v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Hw1.Answer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets This is the rank of the sentence accroding to the score
   * @generated */
  public int getRank() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "Hw1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_rank);}
    
  /** setter for rank - sets This is the rank of the sentence accroding to the score 
   * @generated */
  public void setRank(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "Hw1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_rank, v);}    
   
    
  //*--------------*
  //* Feature: answerId

  /** getter for answerId - gets This is the unique id of the answer
   * @generated */
  public int getAnswerId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "Hw1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerId);}
    
  /** setter for answerId - sets This is the unique id of the answer 
   * @generated */
  public void setAnswerId(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "Hw1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_answerId, v);}    
   
    
  //*--------------*
  //* Feature: questionId

  /** getter for questionId - gets This is the unique questionId that the sentence is answer of.
   * @generated */
  public int getQuestionId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "Hw1.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_questionId);}
    
  /** setter for questionId - sets This is the unique questionId that the sentence is answer of. 
   * @generated */
  public void setQuestionId(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_questionId == null)
      jcasType.jcas.throwFeatMissing("questionId", "Hw1.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_questionId, v);}    
  }

    