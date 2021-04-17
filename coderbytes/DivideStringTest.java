package coderbytes;

public class DivideStringTest {
	
	public static int divideString(String s, String t) {
		int result = -1;
		int count = 0;
		StringBuilder u = new StringBuilder(s);
		if (u.toString().contains(t) && t.length() > 0 && u.length() > 0) {
			while (u.length() > 0) {
				u.replace(0, t.length(), "");
				count += 1;
				if (t.length() > u.length()) {
					break;
				}
			}
		}
		if (u.length() == 0 && count > 0) {
			result = count;
		}		
		
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println(divideString("bcdbcdbcdbcd", "bcdbcd"));
		System.out.println(divideString("bcdbcdbcd", "bcdbcd"));
		System.out.println(divideString("bcdbcdbcdbcd", ""));
		System.out.println(divideString("", ""));
		System.out.println(divideString("", "bcdbcd"));

	}

}
