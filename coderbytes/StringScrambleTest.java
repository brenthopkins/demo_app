package coderbytes;

//	Have the function StringScramble(str1,str2) take both parameters being passed and return the string true 
//	if a portion of str1 characters can be rearranged to match str2, otherwise return the string false. 
//	For example: if str1 is "rkqodlw" and str2 is "world" the output should return true. 
//	Punctuation and symbols will not be entered with the parameters.
		
public class StringScrambleTest {
	public static boolean StringScramble(String str1, String str2) {   
		for(char a : str1.toCharArray()){
			str2 = str2.replaceFirst(String.valueOf(a),"");
		}		        
		return str2.isEmpty();		    
	} 
		  
	public static void main (String[] args) {  
		// keep this function call here     
		String s = "rkqodlw";
		String t = "world";
		System.out.println(StringScramble(s, t)); 
		String s1 = "cdore";
		String t1 = "coder";
		System.out.println(StringScramble(s1, t1)); 
		String s2 = "h3llko";
		String t2 = "hello";
		System.out.println(StringScramble(s2, t2)); 
//		Scanner s = new Scanner(System.in);
//		System.out.print(StringScramble(s.nextLine())); 
	}  
}
