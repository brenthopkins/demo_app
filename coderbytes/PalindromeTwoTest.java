package coderbytes;

public class PalindromeTwoTest {
//	Have the function PalindromeTwo(str) take the str parameter being passed and 
//	return the string true if the parameter is a palindrome, 
//	(the string is the same forward as it is backward) 
//	otherwise return the string false. The parameter entered may have punctuation 
//	and symbols but they should not affect whether the string is in fact a palindrome. 
//	For example: "Anne, I vote more cars race Rome-to-Vienna" should return true.
	
	static String PalindromeTwo(String str) {
		
	    String lower = str.replaceAll("\\s",""); 
	    String target = lower.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		char[] listOfChars = target.toCharArray();
		int count = listOfChars.length/2;
		System.out.println(count);
		for (int i = 0; i < listOfChars.length/2; i++ ) {
			if (listOfChars[i] != listOfChars[listOfChars.length - i - 1]) {
				return "false";				
			}		
		}
			
		return "true";
		
	}
	public static void main (String[] args) {  
		    // keep this function call here     
//		    Scanner  s = new Scanner(System.in);
//		    Function c = new Function();
		    System.out.print(PalindromeTwo("Anne, I vote more cars race Rome-to-Vienna")); 
	}   
		  
}

