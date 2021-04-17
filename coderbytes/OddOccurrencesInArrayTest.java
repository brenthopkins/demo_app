package coderbytes;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArrayTest {

//	A non-empty array A consisting of N integers is given. The array contains an odd
//	number of elements, and each element of the array can be paired with another element 
//	that has the same value, except for one element which is left unpaired.
//	For example, in array A such that:
//		A[0] = 9 A[1] = 3 A[2] = 9
//		A[3] = 3 A[4] = 9 A[5] = 7
//		A[6] = 9
//		
//	Element 5 which is 7, is unpaired
	
	public static int oddOccurrencesInArray(int[] pairs) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int target = 0;
		for( int i = 0 ; i < pairs.length; i++ ) {
			if ( map.containsKey(pairs[i]) ) {
				int val = map.get(pairs[i]);
				map.put(pairs[i], ++val);
			} else {
				map.put(pairs[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> mapItem : map.entrySet()) {
			if (mapItem.getValue() == 1) {
				target = mapItem.getKey();
				break;
			}
		}
		return target;
	}
	
	public static void main(String[] args) {
		int[] s =  {9,3,9,3,9,7,9};
		System.out.println(oddOccurrencesInArray(s));
	}

}
