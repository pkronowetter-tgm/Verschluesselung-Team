package keilholzkronowetter;

/*
 * 
 * 
 */
public class SubstitutionCipher extends MonoAlphabeticCipher {

	public SubstitutionCipher(String secretAlphabe){
		secretAlphabet=secretAlphabe;
	}
	

	public void setSecretAlphabet(String secretAlphabe){
		secretAlphabet=secretAlphabe;
		
	}

}
