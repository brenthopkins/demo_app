package coderbytes;

public class DashInsertIITest {

//	Have the function DashInsertII(str) insert dashes ('-') between each two odd numbers and insert asterisks ('*') 
//	between each two even numbers in str. 
//	For example: if str is 4546793 the output should be 454*67-9-3. Don't count zero as an odd or even number.
	
	public static String DashInsertII(String num) {
//		String num = String.valueOf(numTarget);
		StringBuilder target = new StringBuilder();
		int num1;
		int num2;
		for (int i  = 0; i < num.length()-1; i++) {
			num1 = Integer.parseInt(Character.toString(num.charAt(i)));
			num2 = Integer.parseInt(Character.toString(num.charAt(i+1)));
			target.append(num1);
			if (num1 == 0 || num2 == 0) {
				continue;
			}
			if (num1 % 2 == 0 && num2 % 2 == 0) {
				target.append("*");
			} else if (num1 % 2 == 1 && num2 % 2 == 1) {
				target.append("-");
			}
		}
		target.append(num.charAt(num.length()-1));
		return target.toString();
		
	}
//	public static String DashInsertII(String num) {
//		StringBuilder builder = new StringBuilder();
//		int n1;
//		int n2;
//		for(int i = 0; i < num.length()-1; i++){
//			n1 = Integer.parseInt(Character.toString(num.charAt(i)));
//			n2 = Integer.parseInt(Character.toString(num.charAt(i+1)));
//			builder.append(n1);
//			if(n1 == 0 || n2 == 0){
//				continue;
//			}
//			if(n1 % 2 == 0 && n2 % 2 == 0){
//				builder.append("*");
//			} else if(n1 % 2 == 1 && n2 % 2 == 1){
//				builder.append("-");
//			}
//		}
//		builder.append(num.charAt(num.length()-1));
//		return builder.toString();
//	}
	
	public static void main(String[] args) {
		String s = "4546793";	// 454*67-9-3
		System.out.println(DashInsertII(s));
		String s1 = "99946";	// 9-9-94*6
		System.out.println(DashInsertII(s1));
		String s2 = "56647304";	// 56*6*47-304
		System.out.println(DashInsertII(s2));
		String s3 = "667488958374553";
		System.out.println(DashInsertII(s3));
	}

}
