package entities;


import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String s = "tree";
		Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }        
        
		
	}

}
