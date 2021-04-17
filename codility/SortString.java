/**
 * 
 */
package codilityTest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author brent
 *
 */
public class SortString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int j = 0;j < args.length; j++)
		{
			StringBuffer sampleString = new StringBuffer();
			StringBuffer targetString = new StringBuffer();
			
			sampleString.append(args[j]);
			
			ArrayList<Character> sortString = new ArrayList<Character>();
			for (int i = 0;i < sampleString.length(); i++)
			{
				sortString.add(sampleString.charAt(i));
			}
			System.out.println("1. " + sortString);
			Collections.sort(sortString);
			for (int i = 0;i < sortString.size(); i++)
			{
				targetString.append(sortString.get(i));
			}
	
			System.out.println("2. " + sortString);
			System.out.println(targetString.toString());
		}
	}

}
