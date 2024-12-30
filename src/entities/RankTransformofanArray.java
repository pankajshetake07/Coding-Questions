package entities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformofanArray {
	public static void main(String[] args) {
		int [] arr = {37,12,28,9,100,56,80,5,12};
		int[] dup = Arrays.copyOf(arr, arr.length);
        Arrays.sort(dup);
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(dup[0], 1);
        for (int i = 1; i < dup.length; i++) {
            if (dup[i] > dup[i - 1]) {
                mp.put(dup[i], mp.get(dup[i - 1]) + 1);
            } else {
                mp.put(dup[i], mp.get(dup[i - 1]));
            }
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = mp.get(arr[i]);
        }
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
