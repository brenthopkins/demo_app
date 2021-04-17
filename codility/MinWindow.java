package codilityTest;

public class MinWindow {

	  public static String MinWindowSubstring(String[] strArr) 
	  {
		  if (strArr[0].length() < 1 || strArr[1].length() < 1)
		  {
			  return "";
		  }
		  String baseArray = strArr[0];
		  String targetArray = strArr[1];
		  int minLength = baseArray.length() + 1;
		  StringBuffer result = new StringBuffer();
		  for (int i = 0; i < baseArray.length(); i++)
		  {
			  StringBuilder check = new StringBuilder(targetArray);
			  for (int j = i; j < baseArray.length(); j++)
			  {
				  if (check.toString().contains(String.valueOf(baseArray.charAt(j))))
				  {
					  check.replace(check.indexOf(String.valueOf(baseArray.charAt(j))), 
							  check.indexOf(String.valueOf(baseArray.charAt(j))) + 1, "");
				  }
				  if (check.length() == 0)
				  {
					  if (j-i < minLength)
					  {
						  minLength = j - i;
						  result.setLength(0);
						  result.append(baseArray.substring(i, j + 1));
					  }
					  break;
				  }				  
			  }
		  }
		  return result.toString();
	  }
	  
	public static void main(String[] args) {
		boolean answer = false;
		  System.out.println("1");
			String[] strAr = new String[] {"ahffaksfajeeubsne", "jefaa"};
			System.out.println(MinWindowSubstring(strAr));
			if (MinWindowSubstring(strAr).equals("aksfaje"))
			{
				answer = true;
			}
			else
			{
				answer = false;
			}
			System.out.println(answer);
			  System.out.println("2");
			String[] strAr1 = new String[] {"aaabaaddae", "dae"};
			System.out.println(MinWindowSubstring(strAr1));
			if (MinWindowSubstring(strAr1).equals("dae"))
			{
				answer = true;
			}
			else
			{
				answer = false;
			}
			System.out.println(answer);
			
			  System.out.println("3");
			String[] strAr2 = new String[] {"aaffhkksemckelloe", "fhea"};
			System.out.println(MinWindowSubstring(strAr2));
			if (MinWindowSubstring(strAr2).equals("affhkkse"))
			{
				answer = true;
			}
			else
			{
				answer = false;
			}
			System.out.println(answer);

	}

}
