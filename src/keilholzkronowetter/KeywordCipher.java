package keilholzkronowetter;


/*
 * Klasse in der ein Keyword übergeben wird um 
 * daraus ein Geheimalphabet zu generieren
 * 
 * @autor Inga Keilholz
 * @version 2014-05-06
 * 
 */

public class KeywordCipher extends MonoAlphabeticCipher{

	/**
	 * Im Konstrukor wird ein Keyword erzeugt
	 * 
	 * @param keyword Keyword
	 */
	
	public KeywordCipher(String keyword){
		
		super();
		this.setKeyword(keyword);
		
	}

	/*
	 * Methode in der ein geheimes Passwort erstellt wird
	 * 
	 * @param keyword Keyword
	 * 
	 */
	
	public void setKeyword(String keyword){
		
		//wird als Paramter nichts übergeben 
		if(keyword.equals("")){
			
			//wird als Standartpasswort "Keyword" übergeben
			keyword="keyword";
		}
		

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		String geheimalphabet = "";
		
		for(char c:keyword.toCharArray()){
			if(!geheimalphabet.contains(""+c)){
				geheimalphabet+= c;
			}
		}
		
		for(char c:alphabet.toCharArray()){
			if(!geheimalphabet.contains(""+c)){
				geheimalphabet+= c;
			}
		}
		
		System.out.println(""+geheimalphabet);
		//neues Geheimalphabet in der Superklasse setzen
		super.setSecretAlphabet(geheimalphabet); 
	}
}
