package coderbytes;

public class ReverseIntegerTest {
    public static int reverseInteger(int x) {
    	int target = 0;
    	int mult = 1;
    	Integer hold = x;
        StringBuilder checkInt = new StringBuilder();
        checkInt.append(hold.toString());
        if (checkInt.charAt(0) == '-') {
        	checkInt.replace(0, 1, "");
        	mult = -1;
        }
    	String reversed = checkInt.reverse().toString();
    	target = Integer.parseInt(reversed);
    	target *= mult;
    	return target;
    }
	
	public static void main(String[] args) {
		System.out.println(reverseInteger(123));	//	321

		System.out.println(reverseInteger(-123));	//	-321

		System.out.println(reverseInteger(120));	//	21

		System.out.println(reverseInteger(0));	//	0


	}

}
