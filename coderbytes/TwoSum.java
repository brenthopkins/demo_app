package coderbytes;

import java.util.Arrays;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
    	int[] index1 = {-1, -1};
    	int listLength = list.length;
    	for (int i = 0; i < listLength; i++) {
        	for (int j = i + 1; j < listLength; j++) {
         		    if ((list[i] + list[j] == sum)) {
           			    index1[0] = i;
        			    index1[1] = j;
        			    break;
                    }
        	}    		
    	}
   	    if (index1[0] == -1 || index1[1] == -1)  {
   		    return null;
    	}
     	    	
    	return index1;
    }
    
    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
        int[] indices1 = findTwoSum(new int[] { 3, 1, 50, 7, 50, 9 }, 100);
        if(indices1 != null) {
            System.out.println(indices1[0] + " " + indices1[1]);
        }
        int[] indices2 = findTwoSum(new int[] { 3, 1, 5, 7, 50, 9 }, 100);
        if(indices2 != null) {
            System.out.println(indices2[0] + " " + indices2[1]);
        }
        
    }
}