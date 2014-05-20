package keilholzkronowetter;

 import static org.junit.Assert.*;
 import org.junit.Test;
 
 /**
  * JUnit Testklasse
  * 
  * @author Patricia Kronowetter
  * @version 2014-05-06
  *
  */
 
 public class KeywordCipherTest {
 
	 
	/**
	 * Methode die testet ob bei der Eingabe des Keywords "test",
	 * das richtige Geheimalphabet herauskommt 
	 */
	 
 	@Test
 	public void test1() {
 		
 		KeywordCipher kc1 = new KeywordCipher("test");
 		if(!kc1.getSecretAlphabet().equals("tesabcdfghijklmnopqruvwxyz")){
 			fail("SecretAlphabet stimmt nicht!");
 		}
 		
 	}
 	
 	/**
 	 * Methode die testet ob bei KEINER Eingabe eines Parameters für das Keyword,
 	 * das Standart-Keyword "keyword" übergeben wird.
 	 */
 	
 	@Test
 	public void test2(){
 		KeywordCipher kc2 = new KeywordCipher("");
 		if(!kc2.getSecretAlphabet().equals("keywordabcfghijlmnpqstuvxz")){
 			fail("SecretAlphabet stimmt nicht!");
 		}
 	}
 
 }