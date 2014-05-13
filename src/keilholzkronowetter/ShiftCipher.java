package keilholzkronowetter;



/**
 * Die ShiftCipher Klasse ist daf�r da um durch eine Verschiebung im normalen Alphabet ein Geheimalphabet
 * zu generieren.
 *
 * @author Inga Keilholz
 * @version 2014-05-09
 */



public class ShiftCipher extends MonoAlphabeticCipher{

	/**
	 * Im Konstruktor in dem ein Wert �bergeben wird um das Alphabet dementsprechend zu verschieben
	 *
	 * @param value Wert um den das nomale Alphabet verschoben wird
	 */


	public ShiftCipher(int value){

		super();
		this.setShiftAmount(value);

	}


	/**
	 * Die SetShiftAmount-Methode �ndert das Geheimalphabet entsprechend dem Wert der Verschiebung um
	 *
	 * @param shiftvalue Wert um den das normale Alphabet verschoben wird
	 */


	public void setShiftAmount(int shiftvalue){
		
		
		//�berpr�fen ob der Wert von shiftvalue "ung�ltig" ist wenn ja wird standartgem�� 1 als value verwendet
		
		if(shiftvalue <0||shiftvalue>=27){
			shiftvalue = 1;
			}
		
		//Alphabet, das verschoben werden soll
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		//Geheimalphabet
		String geheimAlphabet="";
		

		for (int i = shiftvalue; i<alphabet.length();i++){
			geheimAlphabet+=alphabet.charAt(i);
		}
		for(int i = 0;i<shiftvalue;i++){
			geheimAlphabet+=alphabet.charAt(i);			
		}
		System.out.println(geheimAlphabet);
		
		//In der Superklasse das neue Geheimalphabet setzten
		super.setSecretAlphabet(geheimAlphabet);
	}
}