package codilityTest;

public class Solution {
	public String solution(String S, String C) {
		StringBuffer results = new StringBuffer();
		String[] names = S.split(";");
		for (String name: names) {
			String newName = name.replace("-", "").trim();
			String[] splitName = newName.split(" ");
			StringBuffer addAddress = new StringBuffer();
			addAddress.append(splitName[0].toString().toLowerCase().trim());
			addAddress.append(".");
			if (splitName.length > 2)
			{
				addAddress.append(splitName[2].toString().toLowerCase().trim());
			}
			else
			{
				addAddress.append(splitName[1].toString().toLowerCase().trim());				
			}
			int i = results.lastIndexOf(addAddress.toString());
			if (i > -1)
			{
				System.out.println("For name = " + addAddress.toString() + "  check for suffix = " + results.toString().charAt(i + addAddress.toString().length()));
				if (results.toString().charAt(i + addAddress.toString().length())  == '@')
				{
					addAddress.append("2");
				}
				else 
				{
					Integer num = Integer.decode(Character.toString(results.toString().charAt(i + addAddress.toString().length()))) + 1;
					addAddress.append(num.toString().trim());
				}
			}
			addAddress.append("@" + C.toLowerCase() + ".com; ");
			results.append(addAddress.toString());
		}
				
		return results.toString();		
	}

}
