package coderbytes;

import java.util.*; 
import java.io.*;

//Bracket Combinations
//Have the function BracketCombinations(num) read num 
//which will be an integer greater than or equal to zero, 
//and return the number of valid combinations that can be formed 
//with num pairs of parentheses. For example, if the input is 3, 
//then the possible combinations of 3 pairs of parenthesis, 
//namely: ()()(), are ()()(), ()(()), (())(), ((())), and (()()). 
//There are 5 total combinations when the input is 3, 
//so your program should return 5.
		
public class BracketCombinationsTest {
	
	public static long factorialCalc(int n) {
	    long fact = 1;
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	
	public static int BracketCombinations(int num) {
		int result = 0;
		if (num < 1) {
			return result;
		}
		
		long check = factorialCalc(num*2)/(factorialCalc(num)*factorialCalc(num+1));
		result = (int)check;
		return result;		
	}
	
//	  static int count;
//	  public static int BracketCombinations(int num) {
//		    // code goes here 
//		  System.out.println("num = " + num);
//		    count = 0;
//		    helper(num, num);
//		    return count;
//		  }
//
//	  public static void helper(int lp, int rp){
////		  System.out.println("Inside helper, lp = " + lp + ", rp = " + rp);
//		    if(lp>rp) return;
//		    if(lp == 0 && rp == 0) {
//		      count++;
//		      return;
//		    }
//		    //(
//		    if(lp>0){
//		      helper(lp-1, rp);
//		    }
//		    if(rp>0){
//		      helper(lp, rp-1);
//		    }
////		    System.out.println("lp = " + lp + ", rp = " + rp + ", count = " + count);
//	  }

		  public static void main (String[] args) {  
		    // keep this function call here     
			  System.out.println(BracketCombinations(1));
			  System.out.println(BracketCombinations(2));
			  System.out.println(BracketCombinations(3));
			  System.out.println(BracketCombinations(4));
			  System.out.println(BracketCombinations(5));
			  System.out.println(BracketCombinations(6));
//		    Scanner s = new Scanner(System.in);
//		    System.out.print(BracketCombinations(s.nextLine())); 
		  }

}
