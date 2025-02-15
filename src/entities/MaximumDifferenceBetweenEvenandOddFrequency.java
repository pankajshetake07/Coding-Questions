package entities;

import java.util.HashMap;
import java.util.Map;

public class MaximumDifferenceBetweenEvenandOddFrequency {
	
	public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Character keys : map.keySet()) {
        	if(map.get(keys) % 2 == 0) {
        		if(minEven > map.get(keys)){
        			minEven = map.get(keys);
                }
        	} else {
        		maxOdd = Math.max(maxOdd, map.get(keys));
        	}
        }
       return maxOdd-minEven;
    }

	public static void main(String[] args) {
		System.out.println(maxDifference("mmsmsym"));

	}
}
