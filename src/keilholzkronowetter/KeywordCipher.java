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
		

		String alphabet = super.getSecretAlphabet(); 
		
		String geheimalphabet = "";
		
		//speichern der Zahl der schon verwendeten Buchstaben in ein int Array 
		int[] vw = new int[keyword.length()]; 
		
		//druchgehen des Keywords
		for(int i = 0; i < keyword.length(); ++i){
			
			vw[i] = alphabet.indexOf(keyword.charAt(i));
			
			//Geheimalphabet wird erstellt
			geheimalphabet += "" + keyword.charAt(i);
			
		}
		
		//durchgehen der Länge des Alpahbets
		for(int i = 0; i < alphabet.length(); ++i){
			
			//Hilfsvariable um zu speichern um später zu sehen ob ein buchstabe schon verwendet wurde
			boolean hilfverwendet = false;
			
			for (int j = 0; j < vw.length; ++j){
				
				//wenn der Buchstabe verwendet wurde boolean Variable auf true setzen
				if(i == vw[j]){ 
					hilfverwendet = true;
				}
			}
			
			if(!hilfverwendet){
				
				////Geheimalphabet wird erstellt
				geheimalphabet += "" + alphabet.charAt(i); 
			}
		}
		
		//neues Geheimalphabet in der Superklasse setzen
		super.setSecretAlphabet(geheimalphabet); 
	}
}
