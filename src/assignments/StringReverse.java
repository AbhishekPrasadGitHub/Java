package assignments;

public class StringReverse {

	public static void main(String[] args) {
		
		String letter = "Javaselenium";
		
		String result = "";
		
//		StringBuffer sb = new StringBuffer();
		
		for(int i = letter.length() - 1; i >= 0 ; i--) {
			
//			sb.append(letter.charAt(i));
			
			result = result + letter.charAt(i);
			
		}
		
		System.out.println(result);
		
//		

	}

}
