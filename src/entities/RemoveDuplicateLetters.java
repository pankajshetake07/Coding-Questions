package entities;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
	public static String removeDuplicateLetters(String s) {
	       Set<Character> set = new HashSet<>();
	       StringBuilder sb = new StringBuilder();
	       for(int i=0; i<s.length(); i++){
	            set.add(s.charAt(i));
	       }
	       for(Character ch : set) {
	    	   sb.append(ch);
	       }
	       System.out.println(sb.toString());
	       return s;
	    }

	public static void main(String[] args) {
		String s = "bcabc";
		removeDuplicateLetters(s);

	}

}
