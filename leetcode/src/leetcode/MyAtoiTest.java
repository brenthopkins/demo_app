package leetcode;

public class MyAtoiTest {
	
	public static int myAtoi(String s) {
		int target = 0;
		int mult = 1;
		StringBuilder checkStr = new StringBuilder();
		checkStr.append(s.trim());
		if (checkStr.length() > 0) {
			if (checkStr.charAt(0) == '-' || checkStr.charAt(0) == '+') {
				if (checkStr.charAt(0) == '-') {
					mult *= -1;
				}
				checkStr.replace(0, 1, "");
			}
			StringBuilder newStr = new StringBuilder();
			while (checkStr.length() > 0 && Character.isDigit(checkStr.charAt(0))) {
				newStr.append(checkStr.charAt(0));
				checkStr.replace(0, 1, "");
			}
			if (newStr != null && newStr.length() > 0) {
				try {
					target = Integer.parseInt(newStr.toString()) * mult;
				} catch(Exception e) {
					if (mult == -1) {
						target = -2147483648;
					} else {
						target = 2147483647;
					}
				}
			}
		}
		return target;
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("42"));				// 42
		System.out.println(myAtoi("   -42"));			// -42
		System.out.println(myAtoi("4193 with words"));	// 4193
		System.out.println(myAtoi("words and 987"));	// 0
		System.out.println(myAtoi("-91283472332"));		// -2147483648
		System.out.println(myAtoi(""));					// 0

		System.out.println(myAtoi("21474836460"));		// 2147483647
	}

}
