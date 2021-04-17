package coderbytes;

import java.util.*; 
import java.io.*;

public class ArrayAdditionTest {
	static String ArrayAddition(int[] arr) {
		Arrays.sort(arr);
		int target = arr[arr.length - 1];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != target) {
				sum += arr[i];
			}
		}
		if (sum != target) {
			return "false";
		}
		return "true";
	}

	public static void main (String[] args) {  
		int[] s = new int[] {1,2,3,4,5};
		System.out.println(ArrayAddition(s)); // false
		int[] s1 = new int[] {4, 6, 23, 10, 1, 3};
		System.out.println(ArrayAddition(s1));// true
		int[] s2 = new int[] {5,7,16,1,2};
		System.out.println(ArrayAddition(s2));// false
		int[] s3 = new int[] {3,5,-1,8,12};
		System.out.println(ArrayAddition(s3));// true
	}

}
