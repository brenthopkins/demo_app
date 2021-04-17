package leetcode;

public class CheckWaterTest {

	public static int checkWater(int[] height) {
		int target = 0;
		int l = 0;
		int r = height.length - 1;
		while (l < r) {
			target = Math.max(target, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r]) {
		    	l++;
			} else {
				r--;
			}
		}
		return target;
	}
	
	public static void main(String[] args) {
		int[] s = {1,8,6,2,5,4,8,3,7};
		System.out.println(checkWater(s));	// 49
		int[] s1 = {1,1};
		System.out.println(checkWater(s1));	// 1
		int[] s2 = {4,3,2,1,4};
		System.out.println(checkWater(s2));	// 16
		int[] s3 = {1,2,1};
		System.out.println(checkWater(s3));	// 2
	}

}
