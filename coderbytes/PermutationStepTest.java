package coderbytes;

import java.util.*; 
import java.io.*;

public class PermutationStepTest {

	public static int PermutationStep(int num) { 
		String modified = Integer.toString(num);
		for (int i = modified.length() - 1; i > 0; i--) {
			int leftDigit = Character.getNumericValue(modified.charAt(i - 1));
			int rightDigit = Character.getNumericValue(modified.charAt(i));
			if (leftDigit < rightDigit) {
				modified = modified.substring(0, i - 1) + Integer.toString(rightDigit) + Integer.toString(leftDigit) + modified.substring(i + 1);
				break;
			}
		}
		for (int j = 0; j < modified.length(); j++) {
			for (int i = modified.length() - 1; i > 0; i--) {
				int leftDigit = Character.getNumericValue(modified.charAt(i - 1));
				int rightDigit = Character.getNumericValue(modified.charAt(i));
				String temp = modified.substring(0, i - 1) + Integer.toString(rightDigit) + Integer.toString(leftDigit) + modified.substring(i + 1);
				if (Integer.parseInt(temp) > num && Integer.parseInt(temp) < Integer.parseInt(modified)) {
					modified = temp;
				}
			}
		}
		if (num == Integer.parseInt(modified))
			return -1;

		return Integer.parseInt(modified);
	}
	
	
	public static void main(String[] args) {
	    System.out.println(PermutationStep(123));	// 132 
	    System.out.println(PermutationStep(12453)); // 12534
	    System.out.println(PermutationStep(11121)); // 11211
	    System.out.println(PermutationStep(41352)); // 41523
	}

}
