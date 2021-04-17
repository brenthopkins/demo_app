package codilityTest;

import java.util.Arrays;
import java.util.List;

class CheckSolution {
    public boolean solution(String[] A, String T) {
    	List<String> list = Arrays.asList(A);
    	boolean match = list.stream().anyMatch(T::contains);
		return match;
    }
}
	
	   
