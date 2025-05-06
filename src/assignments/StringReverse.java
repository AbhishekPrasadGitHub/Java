package assignments;

public class StringReverse {

	public static void main(String[] args) {
		
		String letter = "Javaselenium";
		
		removeDuplicateCharacter(letter);
		
		String result = "";
		
//		StringBuffer sb = new StringBuffer();
		
		for(int i = letter.length() - 1; i >= 0 ; i--) {
			
//			sb.append(letter.charAt(i));
			
			result = result + letter.charAt(i);
			
		}
		
		System.out.println("Reverse of the string "+result);
		
//		

	}
	
	public static void removeDuplicateCharacter(String str) {
		
		StringBuilder sb = new StringBuilder(str.length());
		
		boolean[] checked = new boolean[256];
		
		for(int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if(!checked[c]) {
				
				sb.append(c);
				checked[c] = true;
				
			}
			
		}
		
		System.out.println("String after duplicate character removal " + sb.toString());
		
	}

}
