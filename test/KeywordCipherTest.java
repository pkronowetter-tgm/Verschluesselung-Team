package keilholzkronowetter;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeywordCipherTest {

	@Test
	public void test1() {
		
		KeywordCipher kc1 = new KeywordCipher("test");
		if(!kc1.getSecretAlphabet().equals("tesabcdfghijklmnopqruvwxyz")){
			fail("SecretAlphabet stimmt nicht!");
		}
		
	}
	
	@Test
	public void test2(){
		KeywordCipher kc2 = new KeywordCipher("");
		if(!kc2.getSecretAlphabet().equals("keywordabcfghijlmnpqstuvxz")){
			fail("SecretAlphabet stimmt nicht!");
		}
	}

}
