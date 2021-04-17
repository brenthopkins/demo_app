package coderbytes;

public class FunctionatorTest {
	
//	Create a function that takes a single word string and does the following:
//		Concatenates inator to the end if the word ends with a consonant otherwise, concatenate -inator instead.
//		Adds the word length of the original word to the end, supplied with '000'.
	
	public static String functionator(String begin) {
		StringBuilder target = new StringBuilder();
		target.append(begin);
		if (begin.length() > 0) {
			Character end = begin.trim().toLowerCase().charAt(begin.length()-1);
			if(end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u') {
				target.append("-inator ");
			} else {
				target.append("inator ");				
			}				
			target.append(begin.length());
			target.append("000");	
		}
		return target.toString();
	}

	public static void main(String[] args) {
		System.out.println(functionator("Shrink")); 		// "Shrinkinator 6000"
		System.out.println(functionator("Doom")); 			// "Doominator 4000"
		System.out.println(functionator("EvilClone")); 		// "EvilClone-inator 9000"
	}

}
