package keilholzkronowetter;

/**
 * 
 * @author Patricia Kronowetter
 * @version 2014-05-06
 *
 */

public class TranspositionCipher implements Cipher {
	
	private int level;
	
	
	
	public TranspositionCipher(int transpositionLevel){
		this.level = transpositionLevel;
	}
	
	public void setTranspositionLevel(int level){
		this.level = level;
	}
	
	/**
	 * Die Methode encrypt dient dazu den eingebenen Text zu Verschl�sselt. Hierbei kann das Wort sowie das Level ver�ndert werden.
	 * 
	 * @param text   Man �bergibt den eingebenen text
	 * 
	 */

	@Override
	public String encrypt(String text) {
		
		// Das Wort wird gesplittet und in ein Array abgespeichert
		char [] klartext = text.toCharArray();
		
		// Die L�nge des Wortes wird durch das Level herausgefunden ---> wieviele Buchstaben in due Arrays m�ssen.
		int length = (int) StrictMath.ceil((double)text.length()/level);
		
		char [][] vArray = new char [level][length];
		
		// Index f�r das Wort, wird bei jeden Durchgang um 1 erh�ht, (hilft damit man weiss an welchen Index man sich gerade befindet)
		int textIndex = 0;
		

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < level; j++) {
					if (textIndex < klartext.length) {
						vArray[j][i] = klartext[textIndex];
						textIndex++;
					}
			}
		}
		/**
		 * Da wird das was jetzt in vArray ist in enc, reingespeichert.
		 */
		String enc = "";
		for(int i = 0; i<vArray.length; i++){
			enc += new String(vArray[i]);
		}

		return enc;
	}
	/**
	 * Die Methode decrypt dient dazu den vorhin eingegeben Text zu entschl�sseln.
	 * Dies habe ich genau so wie die Methode encrypt Programmiert, mit ein Paar kleinen Ver�nderungen.
	 * 
	 * @param text   Man �bergibt den eingebenen text
	 * 
	 */

	@Override
	public String decrypt(String text) {
		
		// Das verschl�sselteWort wird gesplittet und in ein Array abgespeichert
		char [] vText= text.toCharArray();
		
		// Die L�nge des Wortes wird durch das Level herausgefunden ---> wieviele Buchstaben in due Arrays m�ssen.
		int length = (int) StrictMath.ceil((double)text.length()/level);
		
		char [][] eArray = new char [level][length];
		
		// Index f�r das Wort, wird bei jeden Durchgang um 1 erh�ht, (hilft damit man weiss an welchen Index man sich gerade befindet)
		int textIndex = 0;
		

		for (int i = 0; i <eArray.length; i++) {
			for (int j = 0; j <eArray[i].length; j++) {
					eArray[i][j] = vText[textIndex];
					textIndex++;
			}
		}
		String enc = "";
		for(int i = 0; i<length; i++){
			for(int j = 0; j<level; j++){
				enc +=eArray[j][i];
			}
		}
		return enc;
	}
}
