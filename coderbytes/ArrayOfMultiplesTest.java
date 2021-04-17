package coderbytes;

import java.util.Arrays;

public class ArrayOfMultiplesTest {
//	Create a function that takes two numbers as arguments (num, length) 
//	and returns an array of multiples of num until the array length reaches length.
	
	public static int[] arrayOfMultiples(int num, int length) {
		int[] target = new int[length];
		for (int i = 1; i <= length; i++) {
			target[i-1] = i*num;
		}					
		return target;
	}
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));		//  [7, 14, 21, 28, 35]
		System.out.println(Arrays.toString(arrayOfMultiples(12, 10))); 	//  [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
		System.out.println(Arrays.toString(arrayOfMultiples(17, 6))); 	//  [17, 34, 51, 68, 85, 102]
	}

}
