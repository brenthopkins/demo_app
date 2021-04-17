package coderbytes;

import java.util.*;

public class LetterCountTest {
	
	public static String LetterCount(String str) { 
		String[] words = str.split(",");
		String maxWord = null;
		int maxCount = 0;
		for (String word : words) {
			int count = getMaxCount(word);
			if (count > maxCount) {
				maxCount = count;
				maxWord = word;
			}
				
		}
		if (maxCount < 2 ) {
			return "-1";
		}
		return maxWord;
	}

	public static int getMaxCount(String word) {
		Map<Character, Integer> letterList = new HashMap<Character, Integer>();
		for (int i = 0; i < word.length(); i++) {
			Integer value = letterList.get(word.charAt(i));
			if (value == null) {
				letterList.put(word.charAt(i), 1);
				continue;
			}
			letterList.put(word.charAt(i), ++value);
		}
		
		return Collections.max(letterList.values());
	}
		
	public static void main (String[] args) {  
		    // keep this function call here     
//		    Scanner  s = new Scanner(System.in);
//		    System.out.print(LetterCount(s)); 
		String s = "cat,Housekeeper,magnolia,artichoke";
		System.out.println(LetterCount(s));
		  
	}   
}
