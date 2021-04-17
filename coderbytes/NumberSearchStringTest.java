package coderbytes;

public class NumberSearchStringTest {

	public static int NumberSearch(String str) { 
		  
	       int sum = 0;
	       int letters = 0;
	       for(int i = 0; i < str.length(); i++){
	           if(Character.isDigit(str.charAt(i))){
	               sum += Integer.valueOf(String.valueOf(str.charAt(i)));
	           }
	           else if(Character.isAlphabetic(str.charAt(i))){
	               letters++;
	           }
	       }
	        double d = (double)sum/letters;
	        int result = (int)Math.round(d);
	        return result;
	    
	  } 
	  
	public static void main(String[] args ) {
		  String s = "Hello6 9World 2, Nic8e D7ay!"; 	// 2
		  System.out.println(NumberSearch(s));
		  String s1 = "H3ello9-9";						// 4
		  System.out.println(NumberSearch(s1));
		  String s2= "One Number*1*";					// 0
		  System.out.println(NumberSearch(s2));

	}
}
