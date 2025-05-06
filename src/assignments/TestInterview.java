package assignments;

public class TestInterview {

	public static void main(String[] args) {

		String[] locators = { "loc3", "loc2", "loc5", "loc4", "loc2", "loc5", "loc1" };

		firstRepeatingString(locators);
	}

	public static void firstRepeatingString(String[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
				    System.out.println("First repeating string - "+arr[i]);
				    count++;
				    break;
				}
//				if(count!=0)
//				break;
			}
			if(count!=0)
			break;
		}

	}

}
