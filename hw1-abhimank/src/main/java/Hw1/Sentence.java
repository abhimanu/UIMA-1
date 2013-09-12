

/* First created by JCasGen Wed Sep 11 21:47:24 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.TOP;


/** This is the sentence class which for the sentences in the data.
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * XML source: /home/abhimank/git/hw1-abhimank/hw1-abhimank/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: language

  /** getter for language - gets This stores the labugae of the sentence
   * @generated */
  public String getLanguage() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "Hw1.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets This stores the labugae of the sentence 
   * @generated */
  public void setLanguage(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "Hw1.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: tokenList

  /** getter for tokenList - gets This is the list of the tokens in the sentence
   * @generated */
  public FSList getTokenList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Hw1.Sentence");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets This is the list of the tokens in the sentence 
   * @generated */
  public void setTokenList(FSList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets This is length of the sentence in terms of the tokens
   * @generated */
  public int getLength() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "Hw1.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_length);}
    
  /** setter for length - sets This is length of the sentence in terms of the tokens 
   * @generated */
  public void setLength(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "Hw1.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_length, v);}    
   
    
  //*--------------*
  //* Feature: nGramList

  /** getter for nGramList - gets This is the list of ngrams in the sentence
   * @generated */
  public FSList getNGramList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "Hw1.Sentence");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList)));}
    
  /** setter for nGramList - sets This is the list of ngrams in the sentence 
   * @generated */
  public void setNGramList(FSList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_nGramList == null)
      jcasType.jcas.throwFeatMissing("nGramList", "Hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_nGramList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: senctenceId

  /** getter for senctenceId - gets This is the unique id for the sentence in the dataset
   * @generated */
  public int getSenctenceId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_senctenceId == null)
      jcasType.jcas.throwFeatMissing("senctenceId", "Hw1.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_senctenceId);}
    
  /** setter for senctenceId - sets This is the unique id for the sentence in the dataset 
   * @generated */
  public void setSenctenceId(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_senctenceId == null)
      jcasType.jcas.throwFeatMissing("senctenceId", "Hw1.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_senctenceId, v);}    
   
    
  //*--------------*
  //* Feature: parseTree

  /** getter for parseTree - gets This is the semantic or syntactic parse tree of the sentence
   * @generated */
  public TOP getParseTree() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_parseTree == null)
      jcasType.jcas.throwFeatMissing("parseTree", "Hw1.Sentence");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_parseTree)));}
    
  /** setter for parseTree - sets This is the semantic or syntactic parse tree of the sentence 
   * @generated */
  public void setParseTree(TOP v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_parseTree == null)
      jcasType.jcas.throwFeatMissing("parseTree", "Hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_parseTree, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    