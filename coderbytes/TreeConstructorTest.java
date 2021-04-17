package coderbytes;

import java.util.*; 
import java.io.*;

//Have the function TreeConstructor(strArr) take the array of strings stored 
//in strArr, which will contain pairs of integers in the following format: (i1,i2), 
//where i1 represents a child node in a tree and the second integer i2 
//signifies that it is the parent of i1. 
//For example: if strArr is ["(1,2)", "(2,4)", "(7,2)"], then this forms 
//the following tree:
//
//which you can see forms a proper binary tree. 
//Your program should, in this case, return the string true because a 
//valid binary tree can be formed. If a proper binary tree cannot be 
//formed with the integer pairs, then return the string false. 
//All of the integers within the tree will be unique, which means there can 
//only be one node in the tree with the given integer value.
		
public class TreeConstructorTest {
	 public static String TreeConstructor(String[] strArr) {
	     Map<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<strArr.length;i++)
	    {
	        String str=strArr[i].substring(1,strArr[i].length()-1);
	        StringTokenizer stk=new StringTokenizer(str,",");
	        int child=Integer.parseInt(stk.nextToken());
	        int par=Integer.parseInt(stk.nextToken());
	        if(map.containsKey(par))
	        {
	            int count=map.get(par);
	            map.put(par,count+1);
	        }
	        else
	        {
	            map.put(par,1);
	        }
	    }
	    
	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
	    { 
	        //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
	        if(entry.getValue()>2)
	        {
	            return "false";
	        }
	    }
	    return "true";

	  }
	 
	  public static void main (String[] args) {  
		    // keep this function call here  
		  // true
		  String[] s = new String[] {"(1,2)", "(2,4)", "(7,2)"};
		  // true
		  String[] s1 = new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
		  // false
		  String[] s2 =  new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"};
		  
		  System.out.println(TreeConstructor(s));
		  System.out.println(TreeConstructor(s1));
//		    Scanner s = new Scanner(System.in);
//		    System.out.print(TreeConstructor(s.nextLine())); 
		  }

}
