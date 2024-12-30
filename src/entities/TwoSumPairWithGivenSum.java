package entities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumPairWithGivenSum {
	
	public static int[] twoSumPair(int arr[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(target - arr[i])) {
				return new int[] {i, map.get(target - arr[i])};
			}
			else {
				map.put(arr[i], i);
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int arr[] = { 6, 4, 45, 1, 10, 8 };
		int target = 16;
		System.out.println(Arrays.toString(twoSumPair(arr, target)));
	}
}
