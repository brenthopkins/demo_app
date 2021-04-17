package coderbytes;

public class CaesarCipherTest {

	public static String CaesarCipher(String str, int shift) {
		String s = "";
		int lengthOfString = str.length();
		for (int i = 0; i < lengthOfString; i++) {
			if (Character.isLetter(str.charAt(i))) {
				int target = (str.charAt(i) + shift) ;
				if (target > 122 || (target > 90 && target < 97)) {
					target -= 26;
				}
				s += (char) target;
			} else {
				s += str.charAt(i);
			}
		}
		return s;
	}
	
	public static void main(String[] arr) {
		String s = "hoodlum";
		System.out.println(CaesarCipher(s, 6));
		String s1 = "Artichoke Hearts with breadcrumbs!";
		System.out.println(CaesarCipher(s1, 9));
		String s2 = "xylophones are neat";
		System.out.println(CaesarCipher(s2, 6));
		String s3 = "Turkeys in the Straw.";
		System.out.println(CaesarCipher(s3, 6));
		String s4 = "Woe is Me!!!";
		System.out.println(CaesarCipher(s4, 6));
	}
}
