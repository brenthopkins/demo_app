package leetcode;

import java.util.Arrays;

public class FirstAndLastPositionTest {
	
	public static int[] firstAndLastPosition(int[] nums, int target) {
		int[] result = {-1, -1};
		if (nums.length > 0) {
			int i = 0;	
			if (nums[i] != target) {
				while (i < nums.length && nums[i] < target) {
					i++;
				}
				if (i < nums.length && nums[i] == target) {
					result[0] = i;
				}
				while (i < nums.length && nums[i] == target) {
					i++;
				}			
				if (i <= nums.length && i != 0 && nums[i - 1] == target) {
					result[1] = i - 1;
				} else if (i == nums.length && nums[i - 1] == target) {
					result[1] = i - 1;
				}
			} else if (nums[i] == target) {
				result[0] = i;
				while (i < nums.length && nums[i] == target) {
					i++;
				}
				if (i <= nums.length && i != 0 && nums[i - 1] == target) {
					result[1] = i - 1;
				} else {
					result[1] = i;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] s = new int[] {5,7,7,8,8,10};
		System.out.println(Arrays.toString(firstAndLastPosition(s, 8))); // {3, 4}
		int[] s1 = new int[] {5,7,7,8,8,10};
		System.out.println(Arrays.toString(firstAndLastPosition(s1, 6))); // {-1, -1}
		int[] s2 = new int[] {};
		System.out.println(Arrays.toString(firstAndLastPosition(s2, 0))); // {-1, -1}
		int[] s3 = new int[] {1};
		System.out.println(Arrays.toString(firstAndLastPosition(s3, 1))); // {0, 0}
		int[] s4 = new int[] {2, 2};
		System.out.println(Arrays.toString(firstAndLastPosition(s4, 3))); // {-1, -1}
		int[] s5 = new int[] {1, 4};
		System.out.println(Arrays.toString(firstAndLastPosition(s5, 4))); // {1, 1}
	}

}
