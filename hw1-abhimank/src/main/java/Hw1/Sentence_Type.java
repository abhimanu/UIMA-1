
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

/** This is the sentence class which for the sentences in the data.
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Hw1.Sentence");
 
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "Hw1.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "Hw1.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenList;
  /** @generated */
  final int     casFeatCode_tokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "Hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "Hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_length;
  /** @generated */
  final int     casFeatCode_length;
  /** @generated */ 
  public int getLength(int addr) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "Hw1.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_length);
  }
  /** @generated */    
  public void setLength(int addr, int v) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "Hw1.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_length, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nGramList;
  /** @generated */
  final int     casFeatCode_nGramList;
  /** @generated */ 
  public int getNGramList(int addr) {
        if (featOkTst && casFeat_nGramList == null)
      jcas.throwFeatMissing("nGramList", "Hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nGramList);
  }
  /** @generated */    
  public void setNGramList(int addr, int v) {
        if (featOkTst && casFeat_nGramList == null)
      jcas.throwFeatMissing("nGramList", "Hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_nGramList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_senctenceId;
  /** @generated */
  final int     casFeatCode_senctenceId;
  /** @generated */ 
  public int getSenctenceId(int addr) {
        if (featOkTst && casFeat_senctenceId == null)
      jcas.throwFeatMissing("senctenceId", "Hw1.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_senctenceId);
  }
  /** @generated */    
  public void setSenctenceId(int addr, int v) {
        if (featOkTst && casFeat_senctenceId == null)
      jcas.throwFeatMissing("senctenceId", "Hw1.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_senctenceId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_parseTree;
  /** @generated */
  final int     casFeatCode_parseTree;
  /** @generated */ 
  public int getParseTree(int addr) {
        if (featOkTst && casFeat_parseTree == null)
      jcas.throwFeatMissing("parseTree", "Hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_parseTree);
  }
  /** @generated */    
  public void setParseTree(int addr, int v) {
        if (featOkTst && casFeat_parseTree == null)
      jcas.throwFeatMissing("parseTree", "Hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_parseTree, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_tokenList = jcas.getRequiredFeatureDE(casType, "tokenList", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenList  = (null == casFeat_tokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenList).getCode();

 
    casFeat_length = jcas.getRequiredFeatureDE(casType, "length", "uima.cas.Integer", featOkTst);
    casFeatCode_length  = (null == casFeat_length) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_length).getCode();

 
    casFeat_nGramList = jcas.getRequiredFeatureDE(casType, "nGramList", "uima.cas.FSList", featOkTst);
    casFeatCode_nGramList  = (null == casFeat_nGramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGramList).getCode();

 
    casFeat_senctenceId = jcas.getRequiredFeatureDE(casType, "senctenceId", "uima.cas.Integer", featOkTst);
    casFeatCode_senctenceId  = (null == casFeat_senctenceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_senctenceId).getCode();

 
    casFeat_parseTree = jcas.getRequiredFeatureDE(casType, "parseTree", "uima.cas.TOP", featOkTst);
    casFeatCode_parseTree  = (null == casFeat_parseTree) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parseTree).getCode();

  }
}



    