package testmckesson;

import java.util.Arrays;

public class NewShift {

	public static void main(String[] args) {
		int[] startArray = new int[]{1,2,3,4,5};
		int[] expectedArray = new int[]{3,4,5,1,2};  // negative 2
		int[] expected1Array = new int[]{4,5,1,2,3}; // positive 2
		int[] expected2Array = new int[]{5,1,2,3,4};  // negative 4
		int[] expected3Array = new int[]{2,3,4,5,1}; // positive 4
		System.out.println("Test negative 2");	
		for (int i = 0; i < startArray.length; i++ )
		{
			System.out.println(shiftArray(startArray, -2)[i]);
		}
		if (Arrays.equals(expectedArray, shiftArray(startArray, -2)))
		{
			System.out.println("Green");	
		} else {
			System.out.println("Red");			
		}
		System.out.println("Test negative 4");
		for (int i = 0; i < startArray.length; i++ )
		{
			System.out.println(shiftArray(startArray, -4)[i]);
		}
		if (Arrays.equals(expected2Array, shiftArray(startArray, -4)))
		{
			System.out.println("Green");			
		} else {
			System.out.println("Red");			
		}
		System.out.println("Test positive 4");
		for (int i = 0; i < startArray.length; i++ )
		{
			System.out.println(shiftArray(startArray, 4)[i]);
		}
		if (Arrays.equals(expected3Array, shiftArray(startArray, 4)))
		{
			System.out.println("Green");			
		} else {
			System.out.println("Red");			
		}
		System.out.println("Test positive 2");
		for (int i = 0; i < startArray.length; i++ )
		{
			System.out.println(shiftArray(startArray, 2)[i]);
		}
		if (Arrays.equals(expected1Array, shiftArray(startArray, 2)))
		{
			System.out.println("Green");			
		} else {
			System.out.println("Red");			
		}
	}		
	
	public static int[] shiftArray(int[] testArray, int shift)
	{
		int checkShift = shift;
		if (checkShift < 0)
		{
			checkShift = shift + testArray.length;
		}
		int[] targetArray = new int[testArray.length];
		for (int i = 0; i < testArray.length; i++)
		{
			targetArray[((i + checkShift) % testArray.length)] = testArray[i];
		}
		return targetArray;
	}

}
