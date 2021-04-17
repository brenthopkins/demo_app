package coderbytes;

import java.util.ArrayList;
import java.util.List;

public class NumerologyTest {
	
	public static int[] getNumerology(int month, int day, int year, String firstName, String middleName, String lastName) {
		int[] target = new int[5];
		int monthNum = parseNumber(month);
		int dayNum = parseNumber(day);
		int yearNum = parseNumber(year);
		int lifePath = monthNum + dayNum + yearNum;
		lifePath = reduce(lifePath);
		lifePath = reduce(lifePath);
		target[0] = lifePath;
		char[] first = firstName.toLowerCase().toCharArray();
		char[] mid = middleName.toLowerCase().toCharArray();
		char[] last = lastName.toLowerCase().toCharArray();
		int firstNum = parseName(first);
		int middleNum = parseName(mid);
		int lastNum = parseName(last);
		int destiny = firstNum + middleNum + lastNum;
		destiny = reduce(destiny);
		destiny = reduce(destiny);
		target[1] = destiny;
		target[2] = getSoulUrge(first, mid, last);
		target[3] = getPersonality(first, mid, last);
		monthNum = parseNumber(month);
		dayNum = parseNumber(day);
		int birthday = monthNum + dayNum;
		birthday = reduce(birthday);
		target[4] = birthday;
		
		return target;		
	}
	private static int getSoulUrge(char[] first, char[] mid, char[] last) {
		StringBuilder check = new StringBuilder();

		for (int i = 0; i < first.length; i++) {
			if (first[i] == 'a' || first[i] == 'e' || first[i] == 'i' || first[i] == 'o' || first[i] == 'u' || first[i] == 'y') {
				check.append(first[i]);
			}			
		}
		for (int i = 0; i < mid.length; i++) {
			if (mid[i] == 'a' || mid[i] == 'e' || mid[i] == 'i' || mid[i] == 'o' || mid[i] == 'u' || mid[i] == 'y') {
				check.append(mid[i]);
			}			
		}
		for (int i = 0; i < last.length; i++) {
			if (last[i] == 'a' || last[i] == 'e' || last[i] == 'i' || last[i] == 'o' || last[i] == 'u' || last[i] == 'y') {
				check.append(last[i]);
			}			
		}
		int target = parseName(check.toString().toCharArray());		
		return target;		
	}

	private static int getPersonality(char[] first, char[] mid, char[] last) {
		StringBuilder check = new StringBuilder();

		for (int i = 0; i < first.length; i++) {
			if (!(first[i] == 'a' || first[i] == 'e' || first[i] == 'i' || first[i] == 'o' || first[i] == 'u' || first[i] == 'y')) {
				check.append(first[i]);
			}			
		}
		for (int i = 0; i < mid.length; i++) {
			if (!(mid[i] == 'a' || mid[i] == 'e' || mid[i] == 'i' || mid[i] == 'o' || mid[i] == 'u' || mid[i] == 'y')) {
				check.append(mid[i]);
			}			
		}
		for (int i = 0; i < last.length; i++) {
			if (!(last[i] == 'a' || last[i] == 'e' || last[i] == 'i' || last[i] == 'o' || last[i] == 'u' || last[i] == 'y')) {
				check.append(last[i]);
			}			
		}
		int target = parseName(check.toString().toCharArray());		
		return target;		
	}

	private static int parseName(char[] target) {
		
		int result = 0;
		int charIt = 0;
		for (int i = 0; i < target.length; i++) {
			charIt = target[i] - 97;
			charIt = (charIt % 9) + 1;
			result += charIt;
		}
		result = reduce(result);
		result = reduce(result);
		if (result == 11) {
			result = 2;
		} else if (result == 22) {
			result = 4;
		}
		return result;		
	}

	private static int reduce(int target) {
		if (target > 9 && target != 11 && target != 22) {
			int n1 = target/10;
			int n2 = target-(n1*10);
			target = n1 + n2;
		}		
		return target;		
	}
	
	private static int parseNumber(int target) {
		int result = 0;
		if (target > 99) {
			int n1 = target/1000;
			int n2 = (target-(n1*1000))/100;
			int n3 = (target-(n1*1000)-(n2*100))/10;
			int n4 = target-(n1*1000)-(n2*100)-(n3*10);
			result = n1 + n2 + n3 + n4;
			result = reduce(result);
			result = reduce(result);
		} else {
			int n1 = target/10;
			int n2 = target-(n1*10);
			result = n1 + n2;
			result = reduce(result);
			result = reduce(result);
		}		
		return result;		
	}

	public static void main(String[] args) {
		int[] target = getNumerology(8, 1, 1953, "Brent", "Wade", "Hopkins");
		System.out.println("Numerological reading for Brent Hopkins");
		System.out.println("Life Path number = " + target[0]);		// Life Path number uses your birth date
		System.out.println("Expression number = " + target[1]);		// Expression number uses the letters in your name
		System.out.println("Soul Urge number = " + target[2]);		// Soul Urge number uses the vowels in your name
		System.out.println("Personality number = " + target[3]);	// Personality number uses the consonants in your name
		System.out.println("Birthday number = " + target[4]);		// Birthday number is month and day added together
		System.out.println();		
		
		int[] target1 = getNumerology(5, 3, 1959, "Debora", "Butler", "Hopkins");
		System.out.println("Numerological reading for Deb Hopkins");
		System.out.println("Life Path number = " + target1[0]);		// Life Path number uses your birth date
		System.out.println("Expression number = " + target1[1]);	// Expression number uses the letters in your name
		System.out.println("Soul Urge number = " + target1[2]);		// Soul Urge number uses the vowels in your name
		System.out.println("Personality number = " + target1[3]);	// Personality number uses the consonants in your name
		System.out.println("Birthday number = " + target1[4]);		// Birthday number is month and day added together
		System.out.println();		
		
		int[] target2 = getNumerology(12, 18, 1987, "Natasha", "JudithElizabeth", "HopkinsKrut");
		System.out.println("Numerological reading for Natasha Krut");
		System.out.println("Life Path number = " + target2[0]);		// Life Path number uses your birth date
		System.out.println("Expression number = " + target2[1]);	// Expression number uses the letters in your name
		System.out.println("Soul Urge number = " + target2[2]);		// Soul Urge number uses the vowels in your name
		System.out.println("Personality number = " + target2[3]);	// Personality number uses the consonants in your name
		System.out.println("Birthday number = " + target2[4]);		// Birthday number is month and day added together
		System.out.println();		
		
		int[] target3 = getNumerology(2, 7, 1985, "Ashley", "Victoria", "Halligan");
		System.out.println("Numerological reading for Ashley Halligan");
		System.out.println("Life Path number = " + target3[0]);		// Life Path number uses your birth date
		System.out.println("Expression number = " + target3[1]);	// Expression number uses the letters in your name
		System.out.println("Soul Urge number = " + target3[2]);		// Soul Urge number uses the vowels in your name
		System.out.println("Personality number = " + target3[3]);	// Personality number uses the consonants in your name
		System.out.println("Birthday number = " + target3[4]);		// Birthday number is month and day added together
		System.out.println();		
		
	}

}
