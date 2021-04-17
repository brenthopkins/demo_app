package coderbytes;

import java.util.*; 
import java.io.*;

class CodelandUserTest {

  public static String CodelandUsernameValidation(String str) {
     String result="false";
    
    if((str.length()>=4) && (str.length()<=25)) {
    	if(Character.isLetter(str.charAt(0))) {
    		if(!str.endsWith("_")) {
    			for(int i=0; i<str.length(); i++) {
    				if(Character.isDigit((str.charAt(i))) || Character.isLetter((str.charAt(i))) || str.charAt(i)=='_') {
    					result="true";
    				} else {
    					result="false";
    					break;
    				}
    			}
    		}
    	}
    }
   
    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
//    Scanner s = new Scanner(System.in);
//    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}