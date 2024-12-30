package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
	
	public static int majorityElement(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Integer keys : map.keySet()) {
			if(map.get(keys) > 1) {
				return keys;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {3, 1, 3, 3, 2};
		System.out.println(majorityElement(arr));
		String s ="      lkasjdf     ksjkd     lksdf  sjdk lsdj";
		String[] strs = s.trim().split("\\s+");
		int count=1;
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
		System.out.println(count);
	}

}
