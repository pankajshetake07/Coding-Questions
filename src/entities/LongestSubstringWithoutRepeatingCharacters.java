package entities;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int longestSubstringWithoutRepeatingCharacters(String str) {
		int start = 0;
		int end = 0;
		int maxLen = 0;
		List<Character> list = new ArrayList<Character>();
		while(end < str.length()) {
			if(!list.contains(str.charAt(end))) { //if not contains then add to the list
				list.add(str.charAt(end));
				end++;							//increment the end counter 
				maxLen = Math.max(maxLen, list.size());  
			} else {
				list.remove(Character.valueOf(str.charAt(start))); //if present then remove character increment start counter
				start++;
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		
		String str = "abcabcbb";
		System.out.println("Max len : "+longestSubstringWithoutRepeatingCharacters(str));
	}

}
