
/* First created by JCasGen Wed Sep 11 21:47:24 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** This is the class that models the answers of the questions and theior attributes
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * @generated */
public class Answer_Type extends ConfidenceEntity_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Hw1.Answer");
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "Hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "Hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_correct;
  /** @generated */
  final int     casFeatCode_correct;
  /** @generated */ 
  public boolean getCorrect(int addr) {
        if (featOkTst && casFeat_correct == null)
      jcas.throwFeatMissing("correct", "Hw1.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_correct);
  }
  /** @generated */    
  public void setCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_correct == null)
      jcas.throwFeatMissing("correct", "Hw1.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_correct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public float getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Hw1.Answer");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, float v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Hw1.Answer");
    ll_cas.ll_setFloatValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rank;
  /** @generated */
  final int     casFeatCode_rank;
  /** @generated */ 
  public int getRank(int addr) {
        if (featOkTst && casFeat_rank == null)
      jcas.throwFeatMissing("rank", "Hw1.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_rank);
  }
  /** @generated */    
  public void setRank(int addr, int v) {
        if (featOkTst && casFeat_rank == null)
      jcas.throwFeatMissing("rank", "Hw1.Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_rank, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerId;
  /** @generated */
  final int     casFeatCode_answerId;
  /** @generated */ 
  public int getAnswerId(int addr) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "Hw1.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerId);
  }
  /** @generated */    
  public void setAnswerId(int addr, int v) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "Hw1.Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_questionId;
  /** @generated */
  final int     casFeatCode_questionId;
  /** @generated */ 
  public int getQuestionId(int addr) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "Hw1.Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_questionId);
  }
  /** @generated */    
  public void setQuestionId(int addr, int v) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "Hw1.Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_questionId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "Hw1.Sentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

 
    casFeat_correct = jcas.getRequiredFeatureDE(casType, "correct", "uima.cas.Boolean", featOkTst);
    casFeatCode_correct  = (null == casFeat_correct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correct).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Float", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_rank = jcas.getRequiredFeatureDE(casType, "rank", "uima.cas.Integer", featOkTst);
    casFeatCode_rank  = (null == casFeat_rank) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rank).getCode();

 
    casFeat_answerId = jcas.getRequiredFeatureDE(casType, "answerId", "uima.cas.Integer", featOkTst);
    casFeatCode_answerId  = (null == casFeat_answerId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerId).getCode();

 
    casFeat_questionId = jcas.getRequiredFeatureDE(casType, "questionId", "uima.cas.Integer", featOkTst);
    casFeatCode_questionId  = (null == casFeat_questionId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionId).getCode();

  }
}



    