package coderbytes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {
//	Take two String arrays and merge the names into one array (remove duplicates)
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	Set<String> addTo = new HashSet<String>();
    	addTo.addAll(Arrays.asList(names1));
    	addTo.addAll(Arrays.asList(names2));
    	String[] target = addTo.toArray(String[]::new);
		return target;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); 
        // should print Ava, Emma, Olivia, Sophia
    }

}
