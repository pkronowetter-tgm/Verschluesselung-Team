package keilholzkronowetter;

//das Interface gibt vor wie die Klasse auszusehen hat
public interface Cipher{ 

	//Es muss Methoden beinhalten
	String encrypt(String text);
	String decrypt(String text);
}
