package assignments;

public class StringCharacterCount {

	public static void main(String[] args) {
		
		String str = "Selenium";
		boolean[] arr = new boolean[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			if(arr[i]) {
				continue;
			}
			int count = 1;
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					arr[j] = true;
					count++;	
				}
			}
			System.out.println(str.charAt(i)+" - "+count);
			
		}

	}

}
