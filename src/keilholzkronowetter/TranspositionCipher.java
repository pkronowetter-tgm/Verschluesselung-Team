package keilholzkronowetter;

public class TranspositionCipher implements Cipher {
	
	private int level;
	
	public TranspositionCipher(int transpositionLevel){
		this.level = transpositionLevel;
	}
	
	public void setTranspositionLevel(int level){
		this.level = level;
	}

	@Override
	public String encrypt(String text) {
		
		// das neue
		char [] klartext = text.toCharArray();
		int length = (int) StrictMath.ceil((double)text.length()/level);
		
		char [][] vArray = new char [level][length];
		
		int textIndex = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < level; j++) {
					if (textIndex < klartext.length) {
						vArray[j][i] = klartext[textIndex];
						textIndex++;
					}
			}
		}
		
		String enc = "";
		for(int i = 0; i<vArray.length; i++){
			enc += new String(vArray[i]);
		}

		return enc;
	}

	@Override
	public String decrypt(String text) {
		char [] vText= text.toCharArray();
		int length = (int) StrictMath.ceil((double)text.length()/level);
		
		char [][] eArray = new char [level][length];
		
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
	public static void main(String[] args){// throws CipherException {
		Cipher c = new TranspositionCipher(3);
		String s = c.encrypt("Hallo das ist ein Test");
		System.out.println(s);
		s = c.decrypt(s);
		System.out.println(s);
	}
}
