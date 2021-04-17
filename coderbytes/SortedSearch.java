package coderbytes;

import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int count = 0;
        int limit = sortedArray.length;
        int half = limit/2;
        if (sortedArray[half] < lessThan) {
        	count = half;
        	for (int i = half+1; i < limit; i++ ) {
	        	if (sortedArray[i] < lessThan) {
	        		count++;
	        	} else {
	        		break;
	        	}
        	}
    	} else {
        	for (int i = 0; i < half; i++ ) {
	        	if (sortedArray[i] < lessThan) {
	        		count++;
	        	} else {
	        		break;
	        	}
        	}
    	}
        for (int i = 0; i < limit; i++ ) {
        	if (sortedArray[i] < lessThan) {
        		count++;
        	} else {
        		break;
        	}
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}