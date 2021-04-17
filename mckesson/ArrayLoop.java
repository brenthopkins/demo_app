package testmckesson;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayLoop {
//	Write Java code that defines an array, loads it with some data, 
//	and then loops through the members of that array. 
//	Do the same for a HashMap.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doArray();
		doHashmap();
	}
	static void doArray()
	{
		ArrayList<String> someStrings = new ArrayList<String>();
		someStrings.add("one");
		someStrings.add("two");
		someStrings.add("three");
		someStrings.add("four");
		someStrings.add("five");
		for (int i = 0; i < someStrings.size(); i++)
		{
			System.out.println(someStrings.get(i));
		}			
	}
	static void doHashmap()
	{
		HashMap<Integer, String> someStrings = new HashMap<Integer, String>();
		someStrings.put(1, "one");
		someStrings.put(2, "two");
		someStrings.put(3, "three");
		someStrings.put(4, "four");
		someStrings.put(5, "five");
		
		for (int i = 1; i <= someStrings.size(); i++)
		{
			System.out.println(someStrings.get(i));
		}
	}

}
