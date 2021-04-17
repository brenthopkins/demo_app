package codilityTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
    	int n = arrival.size();
    	int presenters = 0;
    	int currentArrivalTime = 0;
    	int currentDuration = 0;
    	int i;
    	ArrayList<Integer> arrivalsort = new ArrayList<Integer>();;
    	for (i=0;i<n;i++)
    	{
    		arrivalsort.add(arrival.get(i));
    	}
    	Collections.sort(arrivalsort);
    	    	
		currentArrivalTime = arrivalsort.get(0);
    	
    	int val = arrival.indexOf(arrivalsort.get(0));
		int durationsort = duration.get(val);
		presenters++;
    	for (i=1;i<n;i++)
    	{
    		durationsort = duration.get(arrival.indexOf(arrivalsort.get(i)));
    		if (arrivalsort.get(i) <= currentArrivalTime)
    		{
        		continue;
    		}
    		currentArrivalTime = currentArrivalTime + durationsort;
    		currentDuration = durationsort;
    		presenters++;
    	}   	
    	
    	return presenters;    	
    }

}
