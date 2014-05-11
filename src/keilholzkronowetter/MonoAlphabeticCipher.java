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
	 * Getter-Methode für das Geheimalphabet.
	 * @return das Geheimalphabet
	 * 
	 */
	public String getSecretAlphabet(){
		
		return secretAlphabet;	
	}
	
	/*
	 * Setter-Methode für das Geheimalphabet
	 */
	protected void setSecretAlphabet(String secretAlphabet){
		this.secretAlphabet=secretAlphabet;
		
	}
	
	/*
	 * Methode für die Verschlüsselung eines Textes der mittels Parametern übergeben wird
	 * @ param der Text, der versschlüsselt werdern soll
	 */
	
	@Override
	public String encrypt(String text) {
		
		//HashMap mit jeweils einem Character Key und Character Value
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
		//Alphabet als String
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		//Verschlüsselungstext
		String vtext ="";
		
		//Text in Kleinbuchstaben umwandeln
		text=text.toLowerCase();
		
		//Alle Strings in char-Arrays umwandeln
		char[] abuchstabe = alpha.toCharArray();
		char[] geheimbuchstabe = secretAlphabet.toCharArray();
		char[] textbuchstabe = text.toCharArray();
				
		//for-Schleife zum befüllen der HashMap
		for(int i=0; i<alpha.length(); i++){
			hm.put(abuchstabe[i], geheimbuchstabe[i]);
		}
		
		//for-Schleife zum verschlüsseln des "normalen" Textes
		for(int i=0; i<text.length(); i++){
			
			//wenn der Key zu diesem Value vorhanden ist wird er dem verschlüsselten Text hinzugefügt
			if(hm.containsKey(textbuchstabe[i])){
				vtext+=hm.get(textbuchstabe[i]);
			
			//wenn nicht dann wird diese unbekannte Zeichen einfach dem verschlüsselten Text hinzugefügt
			}else{
				vtext+=textbuchstabe[i];
			}
		}	
		
		return vtext;
	}

	/*
	 * Methode für die entschlüsselung eines verschlüsselten Textes
	 */
	
	@Override
	public String decrypt(String text) {
		
		//HashMap mit jeweils einem Character Key und Character Value
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		
		//Alphabet als String
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		//entschlüsselter Text
		String etext ="";
		
		//Alle Strings in char-Arrays umwandeln
		char[] abuchstabe = alpha.toCharArray();
		char[] geheimbuchstabe = secretAlphabet.toCharArray();
		char[] textbuchstabe = text.toCharArray();
		
		//for-Schleife zum befüllen der HashMap
		for(int i=0; i<alpha.length(); i++){
			hm.put(geheimbuchstabe[i], abuchstabe[i]);
		}
		
		//for-Schleife zum entschlüsseln des "normalen" Textes
		for(int i=0; i<text.length(); i++){
			
			//wenn der Key zu diesem Value vorhanden ist wird er dem entschlüsselten Text hinzugefügt
			if(hm.containsKey(textbuchstabe[i])){
				
				etext+=""+hm.get(textbuchstabe[i]);
				
			//wenn nicht dann wird diese unbekannte Zeichen einfach dem entschlüsselten Text hinzugefügt
			}else{
				
				etext+=""+textbuchstabe[i]; 
			}
		}	

		return etext;
	}

}
