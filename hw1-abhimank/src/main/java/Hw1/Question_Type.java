
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This is the question class for modelling the questions that encapsulates the properties of the question
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * @generated */
public class Question_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Hw1.Question");
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "Hw1.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "Hw1.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_questionId;
  /** @generated */
  final int     casFeatCode_questionId;
  /** @generated */ 
  public int getQuestionId(int addr) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "Hw1.Question");
    return ll_cas.ll_getIntValue(addr, casFeatCode_questionId);
  }
  /** @generated */    
  public void setQuestionId(int addr, int v) {
        if (featOkTst && casFeat_questionId == null)
      jcas.throwFeatMissing("questionId", "Hw1.Question");
    ll_cas.ll_setIntValue(addr, casFeatCode_questionId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "Hw1.Sentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

 
    casFeat_questionId = jcas.getRequiredFeatureDE(casType, "questionId", "uima.cas.Integer", featOkTst);
    casFeatCode_questionId  = (null == casFeat_questionId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionId).getCode();

  }
}



    