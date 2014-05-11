package keilholzkronowetter;



/**
 * Die ShiftCipher Klasse ist dafür da um durch eine Verschiebung im normalen Alphabet ein Geheimalphabet
 * zu generieren.
 *
 * @author Inga Keilholz
 * @version 2014-05-09
 */



public class ShiftCipher extends MonoAlphabeticCipher{

	/**
	 * Im Konstruktor in dem ein Wert übergeben wird um das Alphabet dementsprechend zu verschieben
	 *
	 * @param value Wert um den das nomale Alphabet verschoben wird
	 */


	public ShiftCipher(int value){

		super();
		this.setShiftAmount(value);

	}


	/**
	 * Die SetShiftAmount-Methode ändert das Geheimalphabet entsprechend dem Wert der Verschiebung um
	 *
	 * @param shiftvalue Wert um den das normale Alphabet verschoben wird
	 */


	public void setShiftAmount(int shiftvalue){
		
		
		//überprüfen ob der Wert von shiftvalue "ungültig" ist wenn ja wird standartgemäß 1 als value verwendet
		
		if(shiftvalue > 30 || shiftvalue <0){
			
			shiftvalue = 1;
			}
		
		//Alphabet, das verschoben werden soll
		String alphabet = super.getSecretAlphabet(); 
		
		//Geheimalphabet
		String geheimAlphabet="";
		
		//alphabet wird durchgegangen
		for(int i=0; i<alphabet.length(); i++){
			
			//Ist der Wert größer oder gleich wie die Länge des Alphabets 
			if((shiftvalue+i) >= alphabet.length()){
				
				//Das neue "verschobene" Alphabet wird erstellt
				geheimAlphabet += alphabet.charAt(shiftvalue+i-alphabet.length());
				
			}else{
				
				//Das neue "verschobene" Alphabet wird erstellt
				geheimAlphabet += alphabet.charAt(shiftvalue+i);
			}
		}
		
		//Das neue Geheimalalphabet in kleinbuchstaben casten
		geheimAlphabet = geheimAlphabet.toLowerCase();
		
		//In der Superklasse das neue Geheimalphabet setzten
		super.setSecretAlphabet(geheimAlphabet);
	}
}