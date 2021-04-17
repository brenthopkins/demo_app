package coderbytes;

public class ArithGeoTest {

//	Have the function ArithGeoII(arr) take the array of numbers stored in arr 
//	and return the string "Arithmetic" if the sequence follows an arithmetic pattern 
//	or return "Geometric" if it follows a geometric pattern. 
//	If the sequence doesn't follow either pattern return -1. 
//	
//	An arithmetic sequence is one where the difference between each of the numbers is consistent, 
//	whereas in a geometric sequence, each term after the first is multiplied by some constant or common ratio. 
//	Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. 
//	Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements.

	static String ArithGeoII(int[] arr) { 
		if(isArit(arr)){
			return "Arithmetic";
		}
		if(isGeo(arr)){
			return "Geometric";
		}
		return "-1";
	}

	private static boolean isArit(int[] arr){
		int diff = Math.abs(arr[1] - arr[0]);
		for (int i = 2; i < arr.length; i++) {
			int loopDiff = Math.abs(arr[i]) - Math.abs(arr[i - 1]);
			if (loopDiff != diff) {
				return false;
			}
		}
		return true;
	}

	private static boolean isGeo(int[] arr) {
		int ratio = arr[1]/arr[0];
		for (int i = 2; i < arr.length; i++) {
			int loopRatio = arr[i]/arr[i-1];
			if (ratio != loopRatio) {
				return false;
			}
		}
		return true;		
	}

	public static void main (String[] args) {  
		// keep this function call here     
//		Scanner  s = new Scanner(System.in);
//		Function c = new Function();
//		System.out.print(c.ArithGeoII(s.nextLine())); 
		int[] s = new int[] {2, 4, 6, 8};
		System.out.println(ArithGeoII(s)); 
		int[] s1 = new int[] {5, 10, 15};
		System.out.println(ArithGeoII(s1)); 
		int[] s2 = new int[] {2, 4, 16, 24};
		System.out.println(ArithGeoII(s2)); 
		int[] s3 = new int[] {2, 6, 18, 54};
		System.out.println(ArithGeoII(s3)); 
	}
}



