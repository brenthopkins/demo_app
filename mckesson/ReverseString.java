package testmckesson;

public class ReverseString {

	public static void main(String[] args) {
		String c = reverse("Brent");
		System.out.println(c);
		String d = reverse("The Quick brown fox jumped over the lazy dog");
		System.out.println(d);
	}
	
	static String reverse(String target)
	{
		StringBuffer result = new StringBuffer();
		int arrayLength = target.length() - 1;
		for (int i = arrayLength; i > -1; i--)
		{
			Character place = target.charAt(i);
			result.append(place.toString());
		}
		return result.toString();
	}

}
