package codilityTest;

import java.util.ArrayList;

public class NewList {

	public static void main(String[] args) {
		System.out.println(getListString());

	}
	static ArrayList<String> getListString() {
		ArrayList<String> returnList = new ArrayList<String>();
		
		returnList.add("Brent");
		returnList.add("Wade");
		returnList.add("Hopkins");
		returnList.add("Esquire");
		
		return returnList;
	}

}
