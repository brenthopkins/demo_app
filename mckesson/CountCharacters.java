package testmckesson;

import java.util.HashMap;

public class CountCharacters {
// Count differnt alphabetic characters in a string; ignore spaces
	public static void main(String[] args) {
		String c = countThis("Brent").toString();
		System.out.println(c);
		String d = countThis("The Quick brown fox jumped over the lazy dog").toString();
		System.out.println(d);
		String e = countThis("Brent Hopkins").toString();
		System.out.println(e);
	}

	private static HashMap<Character, Integer> countThis(String string) {
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		String targetString = string.replace(" ", "").toLowerCase().trim();
		
		for (int i = 0; i < targetString.length(); i++)
		{
			if (result.containsKey(targetString.charAt(i)))
			{
				int j = result.get(targetString.charAt(i));
				result.replace(targetString.charAt(i), j + 1);
			}
			else
			{
				result.put(targetString.charAt(i), 1);
			}
		}
		return result;
	}

}
