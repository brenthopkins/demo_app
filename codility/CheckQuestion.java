package codilityTest;

import java.util.*; 

public class CheckQuestion {

	  public static String QuestionsMarks(String str) 
	  {
		  // code goes here  
		  StringBuffer check = new StringBuffer();
		  StringBuffer newCheck = new StringBuffer();
		  check.append(str);
		  
		  for (int i = 0; i < check.length(); i++)
		  {
			  if (check.charAt(i) == '?' || Character.isDigit(check.charAt(i))) 
			  {
				  newCheck.append(check.charAt(i));
			  }
		  }
		  Boolean qMark = false;
		  int mark = newCheck.indexOf("???");
		  while (mark > 0)
		  {
			  try 
			  {
				  Character as = newCheck.charAt(mark - 1);
				  int a = Integer.parseInt(as.toString());
				  Character bs = newCheck.charAt(mark + 3);
				  int b = Integer.parseInt(bs.toString());
				  mark = newCheck.indexOf("???", (mark + 1));
				  if (a+b == 10 && mark > 0)
				  {
					  qMark = true;
				  }
				  else if (a+b != 10)
				  {
					  qMark = false;				  
				  }
			  }
			  catch (NumberFormatException e)
			  {
				  qMark = false;
				  break;
			  }
		  }
		  return qMark.toString().toString();
	  }

	public static void main(String[] args) {
	    // keep this function call here     
	    System.out.println(QuestionsMarks("arrb6???4xxbl5???eee5")); 
	    System.out.println(" ");
	    System.out.println(QuestionsMarks("???4xxbl5???eee5")); 
	    System.out.println(" ");
	    System.out.println(QuestionsMarks("arrb6???4xxbl5???eee4")); 
	    System.out.println(" ");
	    System.out.println(QuestionsMarks("acc?7??sss?3rr1??????5")); 
	}

}

