

/* First created by JCasGen Wed Sep 11 21:47:24 EDT 2013 */
package Hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** This is the ngrams created using the tokens in the sentence
 * Updated by JCasGen Wed Sep 11 21:47:24 EDT 2013
 * XML source: /home/abhimank/git/hw1-abhimank/hw1-abhimank/src/main/resources/TypeSystemDescriptor.xml
 * @generated */
public class Ngram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
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
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ngram(JCas jcas, int begin, int end) {
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
  //* Feature: tokenList

  /** getter for tokenList - gets This is the list of the tokens that comprise the ngram
   * @generated */
  public FSList getTokenList() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Hw1.Ngram");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets This is the list of the tokens that comprise the ngram 
   * @generated */
  public void setTokenList(FSList v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "Hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngramId

  /** getter for ngramId - gets THis is the unique id of the ngram 
   * @generated */
  public int getNgramId() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_ngramId == null)
      jcasType.jcas.throwFeatMissing("ngramId", "Hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_ngramId);}
    
  /** setter for ngramId - sets THis is the unique id of the ngram  
   * @generated */
  public void setNgramId(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_ngramId == null)
      jcasType.jcas.throwFeatMissing("ngramId", "Hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_ngramId, v);}    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets This is the length of the ngram e.g bigram, trigram etc.
   * @generated */
  public int getLength() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "Hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_length);}
    
  /** setter for length - sets This is the length of the ngram e.g bigram, trigram etc. 
   * @generated */
  public void setLength(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "Hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_length, v);}    
   
    
  //*--------------*
  //* Feature: semanticFeatureList

  /** getter for semanticFeatureList - gets This is the list of semantic features of the ngram e.g. semantic roles etc.
   * @generated */
  public FSList getSemanticFeatureList() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_semanticFeatureList == null)
      jcasType.jcas.throwFeatMissing("semanticFeatureList", "Hw1.Ngram");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_semanticFeatureList)));}
    
  /** setter for semanticFeatureList - sets This is the list of semantic features of the ngram e.g. semantic roles etc. 
   * @generated */
  public void setSemanticFeatureList(FSList v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_semanticFeatureList == null)
      jcasType.jcas.throwFeatMissing("semanticFeatureList", "Hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_semanticFeatureList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    