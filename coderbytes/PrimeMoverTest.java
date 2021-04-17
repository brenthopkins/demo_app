package coderbytes;

import java.util.*; 
import java.io.*;

public class PrimeMoverTest {

//	Have the function PrimeMover(num) return the numth prime number. 
//	The range will be from 1 to 10^4. For example: if num is 16 
//	the output should be 53 as 53 is the 16th prime number.
	
	public static int PrimeMover(int num) {
		if (num < 1) {
			return 0;
		} else if (num == 1 ) {
			return 2;
		} else if (num == 2) {
			return 3;
		} else if (num == 3 ) {
			return 5;
		}
		
		int count = 2;
		int target = 0;
		
		for (int i = 4; i < 10000; i++) {
			if (getPrime(i)) {
				count++;
				if (count == num) {
					target = i;
					break;
				}
			}
		}
		
		return target;
	}
	public static Boolean getPrime(int num) { 
		if(num==2) return true;
		if(num%2==0) return false;
		for(int i=3;i<=Math.sqrt(num);i+=2){
			if(num%i==0) { 
				return false; 
			}
		}
		       
		return true;
		    
	} 

	
	public static void main (String[] args) {  
		// keep this function call here     
//		Scanner s = new Scanner(System.in);
//		System.out.print(PrimeMover(s.nextLine())); 
		System.out.println(PrimeMover(9)); 
		System.out.println(PrimeMover(16)); 
		System.out.println(PrimeMover(100)); 
	}   
	
}
