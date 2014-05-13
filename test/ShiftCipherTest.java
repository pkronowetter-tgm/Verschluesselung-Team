package keilholzkronowetter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShiftCipherTest {

	@Test
	public void test1() {
		ShiftCipher sc1 = new ShiftCipher(2);
		if(!sc1.getSecretAlphabet().equals("cdefghijklmnopqrstuvwxyzab")){
		fail("Not yet implemented");
		}
	}
	
	@Test
	public void test2() {
		ShiftCipher sc2 = new ShiftCipher(-4);
		if(!sc2.getSecretAlphabet().equals("bcdefghijklmnopqrstuvwxyza")){
		fail("Not yet implemented");
		}
	}
	
	@Test
	public void test3() {
		ShiftCipher sc3 = new ShiftCipher(40);
		if(!sc3.getSecretAlphabet().equals("bcdefghijklmnopqrstuvwxyza")){
		fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void test4() {
		ShiftCipher sc4 = new ShiftCipher(0);
		if(!sc4.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyz")){
		fail("Not yet implemented");
		}
	}

	
}
