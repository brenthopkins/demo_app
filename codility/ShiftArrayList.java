package codilityTest;

import java.util.ArrayList;
import java.util.List;

public class ShiftArrayList {
	static int count = 0;

	public static void main(String[] args) {
		List<Integer> returnList = new ArrayList<Integer>();
		
		returnList.add(1);
		returnList.add(2);
		returnList.add(3);
		returnList.add(5);
		returnList.add(7);
		System.out.println(returnList);

		System.out.println(shiftArray(returnList, 2));

	}
	static List<Integer> shiftArray(List<Integer> startList, int newList) {
		final int target;
		if (newList < 0) {
			target = startList.size() + newList;
		}
		else
		{
			target = newList;			
		}
		List<Integer> targetList = new ArrayList<Integer>();
		startList.forEach(start -> {
			if (count >= target) {
				targetList.add(start);
			}	
			count++;
		});
		
		count = 0;
		startList.forEach(start -> {
			if (count < target) {
				targetList.add(start);
			}	
			count++;
		});
		
		count = 0;
		return targetList;
	}

}
