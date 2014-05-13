package keilholzkronowetter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TranspositonCipherTest {

	@Test
	public void test1() {
		
		TranspositionCipher tc = new TranspositionCipher(2);
		String erg = tc.encrypt("Test");
		if(!erg.equals("Tset")){
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void test2() {
		
		TranspositionCipher tc = new TranspositionCipher(3);
		String erg = tc.encrypt("Das ist ein Test");
		System.out.println(erg);
		if(!erg.equals("D tiTtai nesse s")){
			//Abstand am Ende zu viel
			fail("Not yet implemented");
		}
	}

}
