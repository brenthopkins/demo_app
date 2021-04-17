package coderbytes;

import java.util.List;
import java.util.Arrays;

public class WeightedAverage
{
    public static double mean(List<Integer> numbers, List<Integer> weights) throws IllegalArgumentException
    {
    	if (numbers == null || weights == null || numbers.size() == 0 || weights.size() == 0 || numbers.size() != weights.size()) {
    		throw new IllegalArgumentException("Arrays are not the same size");
    	}
    		
        double total = 0;
        double totalWeights = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
        	if (numbers.get(i) == null || numbers.get(i) < 0) {
        		throw new IllegalArgumentException("Illegal number: negative or null value");
        	}
        	if (weights.get(i) == null || weights.get(i) < 0) {
        		throw new IllegalArgumentException("Illegal weight: negative or null value");
        	}
            total += numbers.get(i) * weights.get(i);
            totalWeights += weights.get(i);
        }

        return total / totalWeights;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6, 9, 12 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2, 3, 6 });

        System.out.println(WeightedAverage.mean(a, b));
    }
}
