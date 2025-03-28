package assignments;

public class StringRemoveDuplicate {

	public static void main(String[] args) {
		
		String str = "Assignment";
		
		StringBuilder sb = new StringBuilder(str.length());
		
		boolean[] checked = new boolean[256];
		
		for (int i = 0; i < str.length(); i++) {
	
			char c = str.charAt(i);
			
			if(!checked[c]) {
				
				sb.append(c);
				checked[c] = true;
			}
			
		}
		System.out.println(sb.toString());

	}

}
