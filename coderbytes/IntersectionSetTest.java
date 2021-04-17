package coderbytes;

public class IntersectionSetTest {
	public static String ArrayChallenge(int[] arr) {
		int count = 0;
		for (int i = arr[0]; i <= arr[1]; i++) {
			for (int j = arr[2]; j <= arr[3]; j++) {
				if (i == j) {
					count++;
				}
			}			
		}
		if (count >= arr[4]) {
			return "true";
		}
		return "false";
	}
	 public static void main (String[] args) {  
		    // keep this function call here 
			int[] s = new int[] {4, 10, 2, 6, 3};
		    System.out.println(ArrayChallenge(s)); 
			int[] s1 = new int[] {5,11,1,5,1};
		    System.out.println(ArrayChallenge(s1)); 
			int[] s2 = new int[] {1,8,2,4,4};
		    System.out.println(ArrayChallenge(s2)); 
	 }   

}
