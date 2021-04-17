package codilityTest;

import java.util.ArrayList;

public class BinaryGap {
	public int solution(int valueToCheck) 
	{
		// convert integer to binary string
		String checkString = Integer.toBinaryString(valueToCheck);
		
		int zeroGap = 0;
		ArrayList<Integer> checkOnes = new ArrayList<Integer>();
		
		for (int i = 0; i < checkString.length(); i++)
		{
			if (checkString.charAt(i) == '0')
			{
				continue;
			}
			checkOnes.add(i);
		}
		
		for (int i = 0; i < checkOnes.size() - 1; i++)
		{
			int checkdiff = checkOnes.get(i + 1) - checkOnes.get(i) - 1;
			zeroGap = Math.max(zeroGap, checkdiff);
		}
		System.out.println("Value to check = " + valueToCheck + ";  Result = " + zeroGap);
		return zeroGap;
	}
	
}
