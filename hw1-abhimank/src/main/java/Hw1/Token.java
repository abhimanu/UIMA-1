

/* First created by JCasGen Wed Sep 11 20:17:51 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.TOP;


/** Token clas that stores the tokens present in the input data
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * XML source: /home/abhimank/git/hw1-abhimank/hw1-abhimank/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: stringText

  /** getter for stringText - gets This is the actual text of the token
   * @generated */
  public String getStringText() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_stringText == null)
      jcasType.jcas.throwFeatMissing("stringText", "Hw1.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_stringText);}
    
  /** setter for stringText - sets This is the actual text of the token 
   * @generated */
  public void setStringText(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_stringText == null)
      jcasType.jcas.throwFeatMissing("stringText", "Hw1.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_stringText, v);}    
   
    
  //*--------------*
  //* Feature: tokenId

  /** getter for tokenId - gets This is the unique id of the token
   * @generated */
  public int getTokenId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenId == null)
      jcasType.jcas.throwFeatMissing("tokenId", "Hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_tokenId);}
    
  /** setter for tokenId - sets This is the unique id of the token 
   * @generated */
  public void setTokenId(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tokenId == null)
      jcasType.jcas.throwFeatMissing("tokenId", "Hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_tokenId, v);}    
   
    
  //*--------------*
  //* Feature: isAscii

  /** getter for isAscii - gets Is the token ascii or not
   * @generated */
  public boolean getIsAscii() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isAscii == null)
      jcasType.jcas.throwFeatMissing("isAscii", "Hw1.Token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isAscii);}
    
  /** setter for isAscii - sets Is the token ascii or not 
   * @generated */
  public void setIsAscii(boolean v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isAscii == null)
      jcasType.jcas.throwFeatMissing("isAscii", "Hw1.Token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isAscii, v);}    
   
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets This is the part of speech tag for the token
   * @generated */
  public TOP getPartOfSpeech() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "Hw1.Token");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_partOfSpeech)));}
    
  /** setter for partOfSpeech - sets This is the part of speech tag for the token 
   * @generated */
  public void setPartOfSpeech(TOP v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "Hw1.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_partOfSpeech, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: lexicalFatureList

  /** getter for lexicalFatureList - gets This is the list of lexical features such as morphology etc. for the token
   * @generated */
  public FSList getLexicalFatureList() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_lexicalFatureList == null)
      jcasType.jcas.throwFeatMissing("lexicalFatureList", "Hw1.Token");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_lexicalFatureList)));}
    
  /** setter for lexicalFatureList - sets This is the list of lexical features such as morphology etc. for the token 
   * @generated */
  public void setLexicalFatureList(FSList v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_lexicalFatureList == null)
      jcasType.jcas.throwFeatMissing("lexicalFatureList", "Hw1.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_lexicalFatureList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    