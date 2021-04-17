package codilityTest;

public class MatrixChains {

    static int MatrixChain(int[] arr)
    {
      return MatrixChainsNum(arr, 1, arr.length - 1);

    }

		  static int MatrixChainsNum(int[] target, int i, int j) 
		  { 
		      if (i == j)
		      {
		          return 0; 
		      }

		      int minNum = Integer.MAX_VALUE; 

		      for (int k = i; k < j; k++)  
		      { 
		          int count = MatrixChainsNum(target, i, k) 
		                      + MatrixChainsNum(target, k + 1, j) 
		                      + target[i - 1] * target[k] * target[j]; 

		          if (count < minNum)
		          {
		        	  minNum = count; 
		          }
		      } 
		      return minNum; 
		  } 

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4};
		System.out.println(MatrixChain(arr));
		
		int[] arr1 = new int[] {10, 20, 100, 5, 4, 6, 9, 1, 2, 3, 5, 10, 9, 71};
		System.out.println(MatrixChain(arr1));

	}

}

