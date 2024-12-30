package entities;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindTheDifference {
	public static char findTheDifference(String s, String t) {
//		if(s.length() < t.length()){
//            return t.charAt(0);
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch, map.get(ch) + 1);
//            }else {
//                map.put(ch,1);
//            }
//        }
//        for(int i=0; i<t.length(); i++){
//            char ch = t.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch, map.get(ch) + 1);
//            }else {
//                map.put(ch,1);
//            }
//        }
//        char ans = '\0';
//        for(Character ch : map.keySet()){
//            if(map.get(ch) == 1){
//                ans = ch;
//            }
//        }
//        return ans;
//        Set<Entry<Character,Integer>> set = map.entrySet(); //converting map into set for iterating
//		//using advance for loop
//		for(Map.Entry<Character, Integer> me : set) {
//			System.out.println(me.getKey()+":"+me.getValue());
//		}
		char tempS[] = s.toCharArray();
		char tempT[] = t.toCharArray();
		Arrays.sort(tempS);
		Arrays.sort(tempT);
//		for(int i=0; i<tempT.length; i++) {
//			System.out.println(tempT[i]);
//		}
		//char ans = '\0';
		int i = 0, j = 0;
		while (i < tempS.length && j < tempT.length) {
			if (tempS[i] == tempT[j]) {
				i++;j++;
			} else {
				return tempT[j];
			}
		}
		return tempT[tempT.length-1];
	}

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
}
