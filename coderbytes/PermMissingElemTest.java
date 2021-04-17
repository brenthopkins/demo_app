package coderbytes;

import java.util.Arrays;

public class PermMissingElemTest {
	// Find missing element in an unsorted array and return
	
	public static int permMissingElem(int[] list) {
		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			if (list[i] != i + 1) {
				return i + 1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] list = {2,3,1,5};
		System.out.println(permMissingElem(list));
	}

}
