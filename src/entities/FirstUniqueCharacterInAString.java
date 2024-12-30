package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstUniqueCharacterInAString {
	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(int i=0; i<s.length(); i++) {
			int freq = map.get(s.charAt(i));
			if(freq >= 2) {
				return i;
			}
		}
		return -1;
    }

	public static void main(String[] args) {
		
		String s = "lvatcodet";
		
		System.out.println(firstUniqChar(s));

	}
}
