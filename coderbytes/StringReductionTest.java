package coderbytes;

public class StringReductionTest {

	public static int StringReduction(String str) { 
		boolean hasMore = true;
		int currentChar = 0;
		String strContains = "abc";
		while(hasMore){
			hasMore = false;
			for(int i=0; i < str.length()-1;i++) {
				String startChar = Character.toString(str.charAt(i));
				String nextChar = Character.toString(str.charAt(i+1));
				if (startChar.equals(nextChar)) {
					continue;
				} else {
					hasMore = true;
					String replaceChar = strContains.replace(startChar,"").replace(nextChar,"");
					str = str.replaceFirst(startChar+nextChar,replaceChar);
				}
			}
		}				       
		return str.length();		    
	} 

	public static void main(String[] args) {
		  System.out.println(StringReduction("abcabc"));	// 2
		  System.out.println(StringReduction("cccc"));		// 4
	}

}
