package leetcode;

public class DivideTwoIntegersTest {
	private static int HALF_INT_MIN = -1073741824;
	public static int divideTwoIntegers(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		int negative = 2;
		if (dividend > 0) {
			negative--;
			dividend = -dividend;
		}
		if (divisor > 0) {
			negative--;
			divisor = -divisor;
		}
		int result = 0;
		while (divisor >= dividend) {
			int doubleIt = -1;
			int value = divisor;
			while (value >= HALF_INT_MIN && value + value >= dividend) {
				value += value;
				doubleIt += doubleIt;
			}
			result += doubleIt;
			dividend -= value;
		}
		if (negative != 1) {
			return -result;
		}
		return result;
	}
	
	public static int divideTwoIntegers1(int dividend, int divisor) {
		int result = 0;
		boolean negative = false;
		System.out.println(Math.abs(dividend));
		if (Math.abs(dividend) < Math.abs(divisor)) {
			return result;
		}
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		} else if (dividend == Integer.MIN_VALUE && divisor == 1) {
			return Integer.MIN_VALUE;
		}

		if (dividend == Integer.MIN_VALUE) {
			if (divisor > 0) {
				while (dividend <= -divisor) {			
					dividend += divisor;
					result += 1;
				}		
				return -result;
			} else {
				while (dividend <= divisor) {			
					dividend -= divisor;
					result += 1;
				}		
				return result;
			}
		}
		if (dividend < 0) {
			negative = true;
			dividend *= -1;
		}
		if (divisor < 0) { 
			divisor *= -1;
			if (negative == false) {
				negative = true;			
			} else if (negative == true) {
				negative = false;			
			}
		}
		while (dividend >= divisor) {			
			dividend -= divisor;
			result += 1;
		}		

		if (negative) {
			result *= -1;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(divideTwoIntegers(10, 3));		// 3
		System.out.println(divideTwoIntegers(7, -3));		// -2
		System.out.println(divideTwoIntegers(0, 1));		// 0
		System.out.println(divideTwoIntegers(1, 1));		// 1
		System.out.println(divideTwoIntegers(-2147483648, -1));		// 2147483647
		System.out.println(divideTwoIntegers(-2147483648, 1));		// -2147483648
		System.out.println(divideTwoIntegers(-2147483648, 2));		// -1073741824
		System.out.println(divideTwoIntegers(-1010369383, -2147483648));		// 0
		
	}

}
