package assignments;

public class StringRemoveSpecialCharacter {

	public static void main(String[] args) {
		

		String str = "Gee*k;s..fo, r'Ge^eks?";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		
//		char[] s = str.toCharArray();
//		int j = 0;
//		
//		for(int i = 0; i < s.length; i++) {
//			
//			if((s[i] >= 'A' && s[i] >= 'Z') || (s[i] >= 'a' && s[i] <= 'z')) {
//				
//				s[j] = s[i]; 
//				j++;
//				
//			}
//			
//		}
//		System.out.println(String.valueOf(s).substring(0, j));

	}

}
