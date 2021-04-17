package coderbytes;

public class FIzzBuzzTest {
	public static void fizzBuzz(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0 ) {
				System.out.println("fizz");
			} else if (i % 5 == 0 ) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		fizzBuzz(2);
		System.out.println();
		fizzBuzz(8);
		System.out.println();
		fizzBuzz(11);
		System.out.println();
		fizzBuzz(16);
		System.out.println();
		fizzBuzz(35);
	}

}
