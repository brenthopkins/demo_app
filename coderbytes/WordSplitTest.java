package coderbytes;

public class WordSplitTest {

	public static String ArrayChallenge(String[] strArr) {
		String splitWord = strArr[0];
		String dictionary = strArr[1];
	    String target = "not possible";
	    String[] listDictionary = dictionary.split(",");
	    for (int i = 0; i < listDictionary.length; i++) {
	    	if (splitWord.contains(listDictionary[i]) && splitWord.startsWith(listDictionary[i])) {
	    		String firstTarget = listDictionary[i];
	    		String check = splitWord.replace(firstTarget, "");
	    	    for (int j = 0; j < listDictionary.length; j++) {
	    	    	if (check.contains(listDictionary[j])) {
	    	    		target = firstTarget + "," + check;
	    	    		break;
	    	    	}
	    	    }
	    	}
	    }
	    
	    
	    return target;
	  }

	  public static void main (String[] args) { 
		  String[] s = {"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"};
		  System.out.println(ArrayChallenge(s)); 
		  String[] s1 = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
		  System.out.println(ArrayChallenge(s1)); 
		  String[] s2 = {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
		  System.out.println(ArrayChallenge(s2)); 
	    // keep this function call here     
//	    Scanner s = new Scanner(System.in);
//	    System.out.print(ArrayChallenge(s.nextLine())); 
	  }

}
