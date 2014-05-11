package keilholzkronowetter;

import java.util.HashMap;

public class MonoAlphabeticCipher implements Cipher{

	protected String secretAlphabet;
	
	/*
	 * Konstruktor
	 */
	public MonoAlphabeticCipher(){
		
	}
	
	/*
	 * Getter-Methode f�r das Geheimalphabet.
	 * @return das Geheimalphabet
	 * 
	 */
	public String getSecretAlphabet(){
		
		return secretAlphabet;	
	}
	
	/*
	 * Setter-Methode f�r das Geheimalphabet
	 */
	protected void setSecretAlphabet(String secretAlphabet){
		this.secretAlphabet=secretAlphabet;
		
	}
	
	/*
	 * Methode f�r die Verschl�sselung eines Textes der mittels Parametern �bergeben wird
	 * @ param der Text, der versschl�sselt werdern soll
	 */
	
	@Override
	public String encrypt(String text) {
		
		//HashMap mit jeweils einem Character Key und Character Value
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
		//Alphabet als String
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		//Verschl�sselungstext
		String vtext ="";
		
		//Text in Kleinbuchstaben umwandeln
		text=text.toLowerCase();
		
		//Alle Strings in char-Arrays umwandeln
		char[] abuchstabe = alpha.toCharArray();
		char[] geheimbuchstabe = secretAlphabet.toCharArray();
		char[] textbuchstabe = text.toCharArray();
				
		//for-Schleife zum bef�llen der HashMap
		for(int i=0; i<alpha.length(); i++){
			hm.put(abuchstabe[i], geheimbuchstabe[i]);
		}
		
		//for-Schleife zum verschl�sseln des "normalen" Textes
		for(int i=0; i<text.length(); i++){
			
			//wenn der Key zu diesem Value vorhanden ist wird er dem verschl�sselten Text hinzugef�gt
			if(hm.containsKey(textbuchstabe[i])){
				vtext+=hm.get(textbuchstabe[i]);
			
			//wenn nicht dann wird diese unbekannte Zeichen einfach dem verschl�sselten Text hinzugef�gt
			}else{
				vtext+=textbuchstabe[i];
			}
		}	
		
		return vtext;
	}

	/*
	 * Methode f�r die entschl�sselung eines verschl�sselten Textes
	 */
	
	@Override
	public String decrypt(String text) {
		
		//HashMap mit jeweils einem Character Key und Character Value
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
		//Alphabet als String
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		//entschl�sselter Text
		String etext ="";
		
		//Alle Strings in char-Arrays umwandeln
		char[] abuchstabe = alpha.toCharArray();
		char[] geheimbuchstabe = secretAlphabet.toCharArray();
		char[] textbuchstabe = text.toCharArray();
		
		//for-Schleife zum bef�llen der HashMap
		for(int i=0; i<alpha.length(); i++){
			hm.put(geheimbuchstabe[i], abuchstabe[i]);
		}
		
		//for-Schleife zum entschl�sseln des "normalen" Textes
		for(int i=0; i<text.length(); i++){
			
			//wenn der Key zu diesem Value vorhanden ist wird er dem entschl�sselten Text hinzugef�gt
			if(hm.containsKey(textbuchstabe[i])){
				
				etext+=""+hm.get(textbuchstabe[i]);
				
			//wenn nicht dann wird diese unbekannte Zeichen einfach dem entschl�sselten Text hinzugef�gt
			}else{
				
				etext+=""+textbuchstabe[i]; 
			}
		}	

		return etext;
	}

}
