package codilityTest;

public class Intersection {

	  public static String FindIntersection(String[] strArr) {
		    // code goes here  
		    String[] firstArray = strArr[0].trim().split("\\s*,\\s*");
		    String[] secondArray = strArr[1].trim().split("\\s*,\\s*");
		    String[] thirdArray = new String[Math.max(firstArray.length, secondArray.length)];
		    int count = 0;
		    for (int i = 0; i < firstArray.length; i++)
		    {
			    for (int j = 0; j < secondArray.length; j++)
			    {
			    	if (firstArray[i].equals(secondArray[j]))
			    	{
			    		thirdArray[count] = firstArray[i];
			    		count++;
			    	}
			    }
		    }
		    StringBuffer answer = new StringBuffer();
		    for (int i = 0; i < thirdArray.length; i++)
		    {
		    	if (thirdArray[i] != null)
		    	{
			    	answer.append(thirdArray[i]);
			    	if (i < thirdArray.length-1 && thirdArray[i+1] != null)
			    	{
			    		answer.append(", ");
			    	}
		    	}
		    }
		    return answer.toString();
		  }

	public static void main(String[] args) {
		String[] strAr = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
		FindIntersection(strAr);
	}
}

