package coderbytes;

public class TripleDoubleTest {

	public static int TripleDouble(long num1, long num2) { 
		char[] a = String.valueOf(num1).toCharArray();
		String s2 = String.valueOf(num2);
		    
		for (int i = 2; i < a.length; i++) {
			if (a[i] == a[i-1] && a[i] == a[i-2]) {
				StringBuffer sb = new StringBuffer();
				sb.append(a[i]).append(a[i]);
				if (s2.indexOf(sb.toString()) >= 0) {
					return 1;
				}
			}
		}		       
		return 0;		    
	} 
		  
	public static void main (String[] args) {  
		  System.out.println(TripleDouble(451999277, 41177722899l));	// 1
		  System.out.println(TripleDouble(465555, 5579));				// 1
		  System.out.println(TripleDouble(67844, 66237));				// 0

	}   

}
