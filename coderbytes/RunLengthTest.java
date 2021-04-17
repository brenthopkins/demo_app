package coderbytes;

import java.util.*; 
import java.io.*;

public class RunLengthTest {
	public static String RunLength(String str) { 
		char[] chars = str.toCharArray();
		String result = "";
		int count = 0;
		int length = chars.length;
		int index = 0;
		for(char ch: chars){           
			if(index + 1 < length && chars[index+1] == ch){
				count++;
			} else {
				count++;
				result += count + "" +ch;
				count = 0;
			}           
			index++;
		}       
		return result;   
	} 
  
	public static void main (String[] args) {  
		System.out.println(RunLength("wwwggopp")); 		// 3w2g1o2p
		System.out.println(RunLength("helloP")); 		// 1h1e2l1o1P
		System.out.println(RunLength("hellohello"));	// 1h1e2l1o1h1e2l1o 
	}   
}