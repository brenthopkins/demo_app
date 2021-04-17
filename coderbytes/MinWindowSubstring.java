package coderbytes;

import java.util.*; 
import java.io.*;

class MinWindowSubstringTest {

  public static String MinWindowSubstring(String[] strArr) {

	    String N = strArr[0];
	    String K = strArr[1];
	    int min = Integer.MAX_VALUE;
	    String result = "";
	    for (int i = 0; i < N.length(); i++) {
	        StringBuilder match = new StringBuilder(K);
	       
	        for (int j=i; j < N.length(); j++) {
	            if (match.toString().contains(String.valueOf(N.charAt(j)))) {
	                int index = match.indexOf(String.valueOf(N.charAt(j)));
	                match.replace(index, index + 1, "");
	            }

	            if (match.length() == 0) {
	                if (j - i < min) {
	                    min = j - i;
	                    result = N.substring(i, j+1);
	                }
	                break;
	            }
	        }
	    }
    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
	  String[] s = new String[] {"aaabaaddae", "aed"};
	  String[] s1 = new String[] {"aabdccdbcacd", "aad"};
	  String[] s2 = new String[] {"ahffaksfajeeubsne", "jefaa"};
		System.out.println(MinWindowSubstring(s));
		System.out.println(MinWindowSubstring(s1));
		System.out.println(MinWindowSubstring(s2));
	    
//    Scanner s = new Scanner(System.in);
//    System.out.print(MinWindowSubstring(s.nextLine())); 
  }

}
