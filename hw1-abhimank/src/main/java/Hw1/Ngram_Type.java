
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

/** This is the ngrams created using the tokens in the sentence
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * @generated */
public class Ngram_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ngram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ngram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ngram(addr, Ngram_Type.this);
  			   Ngram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ngram(addr, Ngram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ngram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Hw1.Ngram");
 
  /** @generated */
  final Feature casFeat_tokenList;
  /** @generated */
  final int     casFeatCode_tokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "Hw1.Ngram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "Hw1.Ngram");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngramId;
  /** @generated */
  final int     casFeatCode_ngramId;
  /** @generated */ 
  public int getNgramId(int addr) {
        if (featOkTst && casFeat_ngramId == null)
      jcas.throwFeatMissing("ngramId", "Hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ngramId);
  }
  /** @generated */    
  public void setNgramId(int addr, int v) {
        if (featOkTst && casFeat_ngramId == null)
      jcas.throwFeatMissing("ngramId", "Hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_ngramId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_length;
  /** @generated */
  final int     casFeatCode_length;
  /** @generated */ 
  public int getLength(int addr) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "Hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_length);
  }
  /** @generated */    
  public void setLength(int addr, int v) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "Hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_length, v);}
    
  
 
  /** @generated */
  final Feature casFeat_semanticFeatureList;
  /** @generated */
  final int     casFeatCode_semanticFeatureList;
  /** @generated */ 
  public int getSemanticFeatureList(int addr) {
        if (featOkTst && casFeat_semanticFeatureList == null)
      jcas.throwFeatMissing("semanticFeatureList", "Hw1.Ngram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_semanticFeatureList);
  }
  /** @generated */    
  public void setSemanticFeatureList(int addr, int v) {
        if (featOkTst && casFeat_semanticFeatureList == null)
      jcas.throwFeatMissing("semanticFeatureList", "Hw1.Ngram");
    ll_cas.ll_setRefValue(addr, casFeatCode_semanticFeatureList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Ngram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenList = jcas.getRequiredFeatureDE(casType, "tokenList", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenList  = (null == casFeat_tokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenList).getCode();

 
    casFeat_ngramId = jcas.getRequiredFeatureDE(casType, "ngramId", "uima.cas.Integer", featOkTst);
    casFeatCode_ngramId  = (null == casFeat_ngramId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngramId).getCode();

 
    casFeat_length = jcas.getRequiredFeatureDE(casType, "length", "uima.cas.Integer", featOkTst);
    casFeatCode_length  = (null == casFeat_length) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_length).getCode();

 
    casFeat_semanticFeatureList = jcas.getRequiredFeatureDE(casType, "semanticFeatureList", "uima.cas.FSList", featOkTst);
    casFeatCode_semanticFeatureList  = (null == casFeat_semanticFeatureList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_semanticFeatureList).getCode();

  }
}



    