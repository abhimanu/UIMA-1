
/* First created by JCasGen Wed Sep 11 20:17:51 EDT 2013 */
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

/** Token clas that stores the tokens present in the input data
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Hw1.Token");
 
  /** @generated */
  final Feature casFeat_stringText;
  /** @generated */
  final int     casFeatCode_stringText;
  /** @generated */ 
  public String getStringText(int addr) {
        if (featOkTst && casFeat_stringText == null)
      jcas.throwFeatMissing("stringText", "Hw1.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_stringText);
  }
  /** @generated */    
  public void setStringText(int addr, String v) {
        if (featOkTst && casFeat_stringText == null)
      jcas.throwFeatMissing("stringText", "Hw1.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_stringText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenId;
  /** @generated */
  final int     casFeatCode_tokenId;
  /** @generated */ 
  public int getTokenId(int addr) {
        if (featOkTst && casFeat_tokenId == null)
      jcas.throwFeatMissing("tokenId", "Hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_tokenId);
  }
  /** @generated */    
  public void setTokenId(int addr, int v) {
        if (featOkTst && casFeat_tokenId == null)
      jcas.throwFeatMissing("tokenId", "Hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_tokenId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isAscii;
  /** @generated */
  final int     casFeatCode_isAscii;
  /** @generated */ 
  public boolean getIsAscii(int addr) {
        if (featOkTst && casFeat_isAscii == null)
      jcas.throwFeatMissing("isAscii", "Hw1.Token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isAscii);
  }
  /** @generated */    
  public void setIsAscii(int addr, boolean v) {
        if (featOkTst && casFeat_isAscii == null)
      jcas.throwFeatMissing("isAscii", "Hw1.Token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isAscii, v);}
    
  
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated */ 
  public int getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "Hw1.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated */    
  public void setPartOfSpeech(int addr, int v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "Hw1.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lexicalFatureList;
  /** @generated */
  final int     casFeatCode_lexicalFatureList;
  /** @generated */ 
  public int getLexicalFatureList(int addr) {
        if (featOkTst && casFeat_lexicalFatureList == null)
      jcas.throwFeatMissing("lexicalFatureList", "Hw1.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lexicalFatureList);
  }
  /** @generated */    
  public void setLexicalFatureList(int addr, int v) {
        if (featOkTst && casFeat_lexicalFatureList == null)
      jcas.throwFeatMissing("lexicalFatureList", "Hw1.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_lexicalFatureList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_stringText = jcas.getRequiredFeatureDE(casType, "stringText", "uima.cas.String", featOkTst);
    casFeatCode_stringText  = (null == casFeat_stringText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_stringText).getCode();

 
    casFeat_tokenId = jcas.getRequiredFeatureDE(casType, "tokenId", "uima.cas.Integer", featOkTst);
    casFeatCode_tokenId  = (null == casFeat_tokenId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenId).getCode();

 
    casFeat_isAscii = jcas.getRequiredFeatureDE(casType, "isAscii", "uima.cas.Boolean", featOkTst);
    casFeatCode_isAscii  = (null == casFeat_isAscii) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isAscii).getCode();

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.TOP", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_lexicalFatureList = jcas.getRequiredFeatureDE(casType, "lexicalFatureList", "uima.cas.FSList", featOkTst);
    casFeatCode_lexicalFatureList  = (null == casFeat_lexicalFatureList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lexicalFatureList).getCode();

  }
}



    