package codilityTest;

import java.util.HashMap;
import java.util.Iterator;

public class MyClass1 {
    public static void main(String args[]) {
    	HashMap<Character, Integer> target = new HashMap<Character, Integer>();
    	
		char[] a = {'a', 'b', 'b', 'b', 'b', 'b', 'c', 'd', 'e', 'e', 'e', 'f', 'f', 'g', 'h', 'i', 'i', 'i', 'j', 'k', 'k', 'l'};
		for (int i = 0; i < a.length; i++)
		{
			if (target.containsKey(a[i])) 
			{
				int count = target.get(a[i]);
				target.put(a[i], ++count);
			}
			else
			{
				target.put(a[i], 1);
			}
		}
	    Iterator<HashMap.Entry<Character, Integer>> entrySet = target.entrySet().iterator();
	      		
	     while (entrySet.hasNext())
	     {
	    	 HashMap.Entry<Character, Integer> entry = entrySet.next();	            
	         System.out.println("Character: "+entry.getKey()+"   Count: "+entry.getValue());
		}
    }
}