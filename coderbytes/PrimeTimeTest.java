package coderbytes;

import java.util.*; 
import java.io.*;

public class PrimeTimeTest {
  public static String primeTime(int num) { 
  	if(num==2) return "true";
    if(num%2==0) return "false";
    for(int i=3;i<=Math.sqrt(num);i+=2){
     	if(num%i==0) return "false"; 
    }
       
    return "true";
    
  } 
  
  public static void main (String[] args) {
	  for (int i=1; i<20; i++)
		  
	  System.out.println("i = " + i + ", prime = " + primeTime(i));
	  System.out.println(3);
	  System.out.println(4);
    // keep this function call here     
//    Scanner  s = new Scanner(System.in);
//    Function c = new Function();
//    System.out.print(c.PrimeTime(s.nextLine())); 
  }   
  
}