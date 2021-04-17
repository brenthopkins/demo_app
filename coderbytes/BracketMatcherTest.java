package coderbytes;

import java.util.*; 

class BracketMatcherTest {  
  public static String BracketMatcher(String str) { 
	  int count = 0;
	  for (char c : str.trim().toCharArray()) {
		  if (c == '(') {
			  count++;
		  } else if (c == ')') {
			  count--;
		  }
	  }
  
	  if (count != 0) {
		  return "0";
	  }else {
		  return "1";
	  }
//      Stack<Character> stack = new Stack<>();
//        for (char c : str.toCharArray()) {
//            if (c == '(') {
//                stack.push(c);
//            } else if (c == ')') {
//                if (stack.size() == 0) {
//                    return "0";
//                }
//                stack.pop();
//            }
//        }
//        return (stack.size() == 0 ? "1" : "0");
    }

  public static void main (String[] args) {  
    // keep this function call here 
	  String s = "(coder)(byte))";
    //Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s)); 
  }   
  
}
