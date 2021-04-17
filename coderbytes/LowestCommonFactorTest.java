package coderbytes;

import java.util.*; 
import java.io.*;

public class LowestCommonFactorTest {

	public static int Division(int num1, int num2) { 
		for (int i = Math.min(num1, num2); i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 0;
		    
	} 
		  
	public static void main (String[] args) { 
		
		System.out.println(Division(10, 20));
		System.out.println(Division(21, 49));
		System.out.println(Division(27, 63));

		    // keep this function call here     
//		Scanner s = new Scanner(System.in);
//		System.out.print(Division(s.nextLine())); 
	}   
	
}
