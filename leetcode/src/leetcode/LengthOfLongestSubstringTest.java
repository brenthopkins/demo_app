package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringTest {
    public static int lengthOfLongestSubstring(String s) {
    	int i = 0;
		int j = 0;
		int result = 0;
		HashSet<Character> sequence = new HashSet<Character>();
		while(j < s.length()) {
		  if(!sequence.contains(s.charAt(j))) {
			  sequence.add(s.charAt(j));
			  j++;
			  result = Math.max(sequence.size(), result);
		  } else {
			  sequence.remove(s.charAt(i));
			  i++;
		  }
		}
		return result;
    }
    
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));	// 3
		System.out.println(lengthOfLongestSubstring("bbbbb"));		// 1
		System.out.println(lengthOfLongestSubstring("pwwkew"));		// 3
		System.out.println(lengthOfLongestSubstring(""));			// 0
		System.out.println(lengthOfLongestSubstring(" "));			// 1
		System.out.println(lengthOfLongestSubstring("au"));			// 2
		System.out.println(lengthOfLongestSubstring("dvdf"));		// 3
	}

}
