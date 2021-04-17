package coderbytes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckStringPattern {  
    public static String QuestionsMarks(String str) {
        String numMarks = str.replaceAll("[^0-9?]", "");
        String check = str.replaceAll("[^0-9?]", "");
        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(check);
        boolean matched = false;
        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if (a + b == 10) {
                if (match.length() != 5) {
                    return "false";
                } else {
                    matched = true;
                }
            }
        }
        return matched ? "true" : "false";
    }
  
  public static void main (String[] args) {  
    // keep this function call here    
	  String s = "aa6?9";
	  System.out.println(QuestionsMarks(s));
	  String s1 = "acc?7??sss?3rr1??????5";
	  System.out.println(QuestionsMarks(s1));
//    Scanner s = new Scanner(System.in);
//    System.out.print(QuestionsMarks(s.nextLine())); 
  }   
  
}