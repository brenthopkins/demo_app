package testmckesson;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {

	public static void main(String[] args) {
		String[] testSet = new String[7];
		{
		testSet[0] = "Brent".toLowerCase();
		testSet[1] = "Kyle".toLowerCase();
		testSet[2] = "Natasha".toLowerCase();
		testSet[3] = "artichoke".toLowerCase();
		testSet[4] = "hashbrowns".toLowerCase();
		testSet[5] = "eggs and bacon".toLowerCase();
		testSet[6] = "Lexie".toLowerCase();
		}

		for (int i = 0; i < testSet.length; i++)
		{
			StringBuffer sampleString = new StringBuffer();
			StringBuffer targetString = new StringBuffer();
			
			sampleString.append(testSet[i]);
			ArrayList<Character> sortString = new ArrayList<Character>();
			for (int j = 0; j < sampleString.length(); j++)
			{
				sortString.add(sampleString.charAt(j));
			}
			Collections.sort(sortString);
			System.out.println(sortString);
			for (int j = 0; j < sortString.size(); j++)
			{
				targetString.append(sortString.get(j));
			}
			System.out.println(targetString.toString());

		}
			
	}

}
