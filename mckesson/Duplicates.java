package testmckesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicates {
//	Given a .txt file with the following format: 
//		<int>, <int>, <int>, <int>, <int>, ..., <int>
//		<n>
//		Output the first integer that is duplicated <n> times
//		For example: 
//		1, 7, 7, 3, 4, 4, 5
//		2
//		Output: 7
//		How did you validate that your solution is robust, correct, performant, etc?
				
	public static void main(String[] args) throws FileNotFoundException {
		int[] testFile = {1, 7, 7, 3, 4, 4, 5};
		int iteration = 2;
		System.out.println(getDupe(testFile, iteration));
		int[] testFile1 = {1, 7, 7, 3, 4, 4, 4, 5};
		int iteration1 = 3;
		System.out.println(getDupe(testFile1, iteration1));
		File file = null;
		Scanner sc = null;
		try {
			file = new File("C:\\Users\\brent\\workspace\\testfile1\\testmckesson\\testfile.txt");
			sc = new Scanner(file);
			String newTestFile = sc.nextLine();
			String newIter = sc.nextLine();
			String[] ints = newTestFile.split(",");
			int[] fromtestFile = new int[ints.length];
			int fromIter = 0;
			for (int i = 0; i < ints.length; i++)
			{
				fromtestFile[i] = Integer.parseInt(ints[i].trim());
				fromIter = Integer.parseInt(newIter);
			}
			System.out.println(getDupe(fromtestFile, fromIter));
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(-1);
		}
		finally
		{
			if (sc != null)
			{
				sc.close();
			}
		}
	}

	public static int getDupe(int[] testFile, int iteration)
	{
		
		HashMap<Integer, Integer> target = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < testFile.length; i++)
		{
			if (target.containsKey(testFile[i]))
			{
				int occurence = target.get(testFile[i]);
				occurence++;
				if (occurence == iteration)
				{
					return testFile[i];
				}
				else
				{
					target.replace(testFile[i], occurence);
				}
			}
			else
			{
				target.put(testFile[i], 1);
			}
		}
		return -1;
	}
}
