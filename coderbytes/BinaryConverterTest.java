package coderbytes;

public class BinaryConverterTest {

	public static int BinaryConverter(String str) {	
		if (str == null || str.equals("")) {
			return 0;
		}
		return Integer.parseInt(str, 2);
	}
	
	public static void main(String[] args) {
		String s = "110";
		System.out.println(BinaryConverter(s)); // false
		String s1 = "";
		System.out.println(BinaryConverter(s1)); // false
		String s2 = "111";
		System.out.println(BinaryConverter(s2)); // false
		String s3 = "1000";
		System.out.println(BinaryConverter(s3)); // false

	}
	
}
