package coderbytes;

import java.util.*;

public class ConsecutiveTest {

	static int Consecutive(int[] arr) { 
		Arrays.sort(arr);
		System.out.println("arr.length - 1 = " + (arr.length - 1) + ", arr[arr.length - 1] = " + arr[arr.length - 1] + ", arr[0] = " + arr[0]);
	    return arr[arr.length - 1] - arr[0] - arr.length + 1;

//		int sum=0;
//		for (int i=0;i<arr.length-1;i++) {
//			sum+=arr[i+1]-arr[i]-1;
//			
//		}
//		return sum;	    
	}      

	public static void main(String[] args) {

		int[] arr = new int[] {-2,10,4};
		System.out.print(Consecutive(arr));
	}

}
