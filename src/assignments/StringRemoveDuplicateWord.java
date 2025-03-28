package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringRemoveDuplicateWord {

	 public static void main(String[] args) {
	        
	        String str = "Java is a robust language for UI test automation and vastly used but "
	        		+ "Pyhton has taken over Java in last few years as programming lanaguage for UI test automation. "
	        		+ "Java still a powerfull language";
	        
	        StringRemoveDuplicateWord duplicateWords = new StringRemoveDuplicateWord();
	        duplicateWords.findDuplicateString(str);
	        
	    //    System.out.println("Try programiz.pro");
	    }

	    public void findDuplicateString(String str){
	        //Split string and take each word in a string array
	        //logic to find duplicate word
	        //Find duplicate word repeated number of times
	        String[] listStrings = str.split(" ");
	        String word = "";
	        HashMap<String,Integer> allwords = new HashMap<String,Integer>();
	        
	        for(int i = 0; i < listStrings.length; i++){
	            
	            word = listStrings[i];
	            
	            if(allwords.containsKey(word)){
	                //increment occurance counter by 1
	                allwords.put(word, allwords.get(word)+1);
	            }
	            else{
	                allwords.put(word,1);
	            }
	        }
	        
	        this.printDuplicateWords(allwords);
	        
	    }
	    
	    public void printDuplicateWords(HashMap<String,Integer> allwords){
	    	
	    	for(Entry<String, Integer> entry : allwords.entrySet()) {
	    		
	    		if(entry.getValue()> 1) {
	    			System.out.println(entry.getKey()+ "-->"+entry.getValue());
	    		}
	    		
	    	}
	        
//	        Set<Map.Entry<String,Integer>> setEntries = allwords.entrySet();
//	        
//	        Iterator<Map.Entry<String,Integer>> itrEntries = setEntries.iterator();
//	        while(itrEntries.hasNext()){
//	            Map.Entry<String,Integer> entry = itrEntries.next();
//	            if(entry.getValue() > 1){
//	                System.out.println(entry.getKey()+ "--->"+entry.getValue());
//	            }
//	        }
	    }
}
