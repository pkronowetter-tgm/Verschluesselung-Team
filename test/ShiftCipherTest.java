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

public class ShiftCipherTest {
	/**
	 * Methode die testet ob bei, wenn bei einem Verschiebewert von 2, das richtige Alphabet herauskommt
	 */

	@Test
	public void test1() {
		ShiftCipher sc1 = new ShiftCipher(2);
		if(!sc1.getSecretAlphabet().equals("cdefghijklmnopqrstuvwxyzab")){
		fail("Not yet implemented");
		}
	}
	
	/**
	 * Methode die testet ob bei einem übergebenen Verschiebewert von -4,
	 * der Standartverschiebewert von 1 übergeben wird
	 */
	
	@Test
	public void test2() {
		ShiftCipher sc2 = new ShiftCipher(-4);
		if(!sc2.getSecretAlphabet().equals("bcdefghijklmnopqrstuvwxyza")){
		fail("Not yet implemented");
		}
	}
	
	/**
	 * Methode die testett ob bei enem übergebenen Verschiebewert von 40, 
	 * der Standartverschiebewert von 1 übergeben wird
	 */
	
	@Test
	public void test3() {
		ShiftCipher sc3 = new ShiftCipher(40);
		if(!sc3.getSecretAlphabet().equals("bcdefghijklmnopqrstuvwxyza")){
		fail("Not yet implemented");
		}
	}
	
	/**
	 * Methode die testet ob bei einem übergebenm Verschiebewert von 0,
	 * das Alphabet so erhalten bleibt wie es ist
	 */
	
	@Test
	public void test4() {
		ShiftCipher sc4 = new ShiftCipher(0);
		if(!sc4.getSecretAlphabet().equals("abcdefghijklmnopqrstuvwxyz")){
		fail("Not yet implemented");
		}
	}

	
}
