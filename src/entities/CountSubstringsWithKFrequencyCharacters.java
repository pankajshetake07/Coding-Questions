package entities;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringsWithKFrequencyCharacters {
	public static int countFreq(String s, int k) {
		int count = 0;
		for(int i=0; i<s.length();i++) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			boolean flag = false;
			for(int j=i; j<s.length(); j++) {
				char ch = s.charAt(j);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				if(map.get(ch) >= k && !flag) {
					count++;
					flag = true;
				}
				else if(flag) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "abcbe";
		System.out.println(countFreq(s, 1));
	}
}
