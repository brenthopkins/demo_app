package coderbytes;

import java.util.Arrays;

public class TwoSumTest {
	public static int[] twoSum(int[] list, int check) {
		int target[] = {-1, -1};
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] + list[j] == check) {
					target[0] = i;
					target[1] = j;
					break;
				}
			}
		}
			
		return target;		
	}

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));

	}

}
