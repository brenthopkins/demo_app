package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ReturnAList {

	public static void main(String[] args) {
		System.out.println(getListString());
		
		Iterator<String> iterator = getListString().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}		
		System.out.println(getListInteger());
	}
	
	public static ArrayList<String> getListString() {
		ArrayList<String> returnList = new ArrayList<String>();
		
		returnList.add("Horse");
		returnList.add("Cat");
		returnList.add("Dog");
		returnList.add("Mouse");
		returnList.add("Ant");
		
		return returnList;		
	}
	
	public static ArrayList<Integer> getListInteger() {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		
		returnList.add(1);
		returnList.add(2);
		returnList.add(3);
		returnList.add(5);
		returnList.add(7);
		
		return returnList;		
	}	
}
