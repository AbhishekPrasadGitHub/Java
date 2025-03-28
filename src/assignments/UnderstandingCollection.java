package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class UnderstandingCollection {

	public static void main(String[] args) {
		

		//HashMap - Key value pair
		
//		int[] arr = new int[10];
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Abhi", 1);
		map.put("Swapnil", 2);
		map.put("Daya", 3);
		map.put("Deepak", 4);
		map.put("Santosh", 5);
		map.put("Dhiraj", 6);
		map.put("Pankaj", 7);
		
//		System.out.println(map);
		//Most commonly used functions
//		map.clear(); //removes all mapping
//	    int newValue =	map.compute("Daya", (key, value) -> value + 8);
//	    System.out.println(newValue);
//		System.out.println(map);
//		
//		int val = map.computeIfPresent("Daya", (key, value) -> value + 7);
//		System.out.println(val);
//		System.out.println(map);
		map.computeIfAbsent("Patil", key -> 8);
//		System.out.println(map);
//		System.out.println(map.containsKey("Swapnil"));
//		System.out.println(map.containsValue(9));
		System.out.println(map.get("Dhiraj"));
		
//		Set<Entry<String, Integer>> setEntries = map.entrySet();
//		
//		Iterator<Entry<String, Integer>> itrEntries = setEntries.iterator();
//		
//		
//		
//		System.out.println(setEntries);
		
		//Set
		
		
		//List
		

	}

}
