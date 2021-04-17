package codilityTest;

public class ShiftArray {
	public int[] solution(int[] arrayToShift, int shiftBy)
	{
		int targetIndex = arrayToShift.length;
		int[] targetArray = new int[targetIndex];
		
		for (int i = 0; i < targetIndex; i++)
		{
			int newIndex = (i + shiftBy) % targetIndex;
			targetArray[newIndex] = arrayToShift[i];
		}
		
		return targetArray;
	}
	
}
