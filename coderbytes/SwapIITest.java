package coderbytes;

//	Have the function SwapII(str) take the str parameter and swap the case of each character. 
//	Then, if a letter is between two numbers (without separation), switch the places of the two numbers. 
//	For example: if str is "6Hello4 -8World, 7 yes3" the output should be 4hELLO6 -8wORLD, 7 YES3.
	
public class SwapIITest {
	public static String SwapII(String str) { 		  
		char[] arr = str.toCharArray();		    
		int numIndex = -1;
		boolean hasLetter = false;
		    
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) {
					arr[i] = Character.toLowerCase(c);
				} else {
					arr[i] = Character.toUpperCase(c);
				}
		            
				hasLetter = true;
			} else if (Character.isDigit(c)) {
				if (numIndex >= 0 && hasLetter){
					char t = arr[i];
					arr[i] = arr[numIndex];
					arr[numIndex] = t;
					hasLetter = false;
				}
				numIndex = i;
			} else {
				numIndex = -1;
				hasLetter = false;
			}
		}		       
		return String.valueOf(arr);		    
	} 

	public static void main(String[] args) {
	    System.out.println(SwapII("6Hello4 -8World, 7 yes3"));  //  4hELLO6 -8wORLD, 7 YES3
	    System.out.println(SwapII("Hello -5LOL6"));  //  hELLO -6lol5
	    System.out.println(SwapII("2S 6 du5d4e"));   //  2s 6 DU4D5E
	    System.out.println(SwapII("")); 
	}

}
