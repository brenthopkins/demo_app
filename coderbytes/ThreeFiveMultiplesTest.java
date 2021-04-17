package coderbytes;

public class ThreeFiveMultiplesTest {

	public static int ThreeFiveMultiples(int num) { 		  
		int sum = 0;
		for(int i = 0; i < num; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	} 

	public static void main(String[] args) {
		System.out.println(ThreeFiveMultiples(10));		// 23
		System.out.println(ThreeFiveMultiples(6));		// 8
		System.out.println(ThreeFiveMultiples(1));		// 0
	}
}
