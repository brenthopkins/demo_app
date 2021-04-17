package codilityTest;

import java.util.*; 
import java.io.*;

class MinWin {

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
	  System.out.println("1");
		String[] strAr = new String[] {"ahffaksfajeeubsne", "jefaa"};
		System.out.println(MinWindowSubstring(strAr));
		  System.out.println("2");
		String[] strAr1 = new String[] {"aaabaaddae", "dae"};
		System.out.println(MinWindowSubstring(strAr1));
		  System.out.println("3");
		String[] strAr2 = new String[] {"aaffhkksemckelloe", "fhea"};
		System.out.println(MinWindowSubstring(strAr2));
		
//    System.out.print(MinWindowSubstring(s.nextLine())); 
  }
}
