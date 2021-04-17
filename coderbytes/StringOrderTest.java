package coderbytes;

public class StringOrderTest {
	// Create a function that takes a string and returns true or false, 
	// depending on whether the characters are in order or not.
	// You don't have to handle empty strings.
	public static boolean isInOrder(String check) {
		boolean target = true;
		if (check == null || check.length() < 1) {
			target = false;			
		} else {
			char compare = check.charAt(0);
			for (int i = 1; i < check.length(); i++) {
				if (check.charAt(i) < compare) {
					target = false;
					break;
				} else {
					compare = check.charAt(i);
				}
			}
		}
		return target;
	}

	public static void main(String[] args) {
		System.out.println(isInOrder("abc")); 		// true
		System.out.println(isInOrder("edabit")); 	// false
		System.out.println(isInOrder("123")); 		// true
		System.out.println(isInOrder("xyzz")); 		// true

	}

}
