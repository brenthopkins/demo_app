package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class KthLargest {
	
	public static int getKthLargest(int kth, int[] checkArray) {
		ArrayList<Integer> checkList = (ArrayList<Integer>) Arrays.stream(checkArray).boxed().collect(Collectors.toList());
		checkList.sort(null);
		int target = checkList.get(checkList.size() - kth);
	
		return target;
	}

	public static int getKthLargestSecond(int kth, int[] checkArray) {
		ArrayList<Integer> checkList = new ArrayList<Integer>();
		Arrays.stream(checkArray).forEach(checkList::add);
		checkList.sort(null);
		int target = checkList.get(checkList.size() - kth);
	
		return target;
	}

	public static void main(String[] args) {
		int[] s = {1,8,6,2,5,4,8,3,7};
		System.out.println(getKthLargest(4, s));	// 6
		int[] s1 = {1,2};
		System.out.println(getKthLargest(2, s1));	// 1
		int[] s2 = {4,3,2,1,7};
		System.out.println(getKthLargest(3, s2));	// 3
		int[] s3 = {1,2,8,9,11};
		System.out.println(getKthLargest(5, s3));	// 1
		System.out.println();
		int[] s4 = {1,8,6,2,5,4,8,3,7};
		System.out.println(getKthLargestSecond(4, s4));	// 6
		int[] s5 = {1,2};
		System.out.println(getKthLargestSecond(2, s5));	// 1
		int[] s6 = {4,3,2,1,7};
		System.out.println(getKthLargestSecond(3, s6));	// 3
		int[] s7 = {1,2,8,9,11};
		System.out.println(getKthLargestSecond(5, s7));	// 1
		
	}

}
