package keilholzkronowetter;

import static org.junit.Assert.*;
import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Test1 {
	String testalphabet = "zyxwvutsrqponmlkjihgfedcba";
	SubstitutionCipher sub = new SubstitutionCipher(testalphabet);
	String vtext="";
	String etext="";
	
	@Before
	public void testEncrypt() {
		
		String text = "Hallo, das ist ein Test!";
		vtext = sub.encrypt(text);
		System.out.println(vtext);
	}
	
	@Test
	public void testDecrypt() {
		
		etext=sub.decrypt(vtext);
		System.out.println(etext);
	}
}