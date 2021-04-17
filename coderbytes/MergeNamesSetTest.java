package coderbytes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeNamesSetTest {
	
	public static String[] mergeNames(String[] list1, String[] list2) {
//		Set<String> targetAdd = new HashSet<String>();
//		targetAdd.addAll(Arrays.asList(list1));
//		targetAdd.addAll(Arrays.asList(list2));
//		String[] target = targetAdd.toArray(String[] :: new);
//		Arrays.sort(target);
		
		List<String> targetAdd = new ArrayList<String>();
		for (int i = 0; i < list1.length; i++) {
			if (!targetAdd.contains(list1[i])) {
				targetAdd.add(list1[i]);
			}
		}
		for (int i = 0; i < list2.length; i++) {
			if (!targetAdd.contains(list2[i])) {
				targetAdd.add(list2[i]);
			}
		}				
		String[] target = targetAdd.toArray(String[] :: new);
		Arrays.sort(target);
				
		return target;	
	}

	public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia", "Brent"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Deb"};
        System.out.println(Arrays.toString(mergeNames(names1, names2)));
        // should print Ava, Brent, Deb, Emma, Olivia, Sophia
	}

}
