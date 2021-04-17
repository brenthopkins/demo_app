package coderbytes;

import java.util.*; 
import java.io.*;

public class SimpleModeTest {
	public static int SimpleMode(int[] arr) { 
		  
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		int maxVal = -1;
		
		for( int i = 0 ; i < arr.length; i++ ) {
			if ( map.containsKey(arr[i]) ) {
				int val = map.get(arr[i]);
				map.put(arr[i], ++val);
				if( val > max ) {
					max = val;
					maxVal = arr[i];
				}
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map.toString());
		for (int i = 0; i < map.size(); i++) {
			
			if (map.containsKey(arr[i]) && map.get(arr[i]) == max) {
				maxVal = arr[i];
				break;
			}
		}

		return maxVal;
	}
	public static void main (String[] args) {  
		int[] s = {5,10,10,6,5};
		System.out.println(SimpleMode(s)); 
		int[] s1 = {5,5,2,2,1};
		System.out.println(SimpleMode(s1)); 
		int[] s2 = {3,4,1,6,10};
		System.out.println(SimpleMode(s2)); 
	}   
}
