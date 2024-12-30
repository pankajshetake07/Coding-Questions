package entities;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static List<List<Integer>> permutations(int nums[]) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			int start = i;
			for (int j = 0; j < nums.length; j++) {
				List<Integer> temp = new ArrayList<Integer>();
				int end = j;
				for(int k = start; k<end; k++) {
					if (i != j) {
						temp.add(nums[k]);
					}
				}
			}
//			list.add(temp);
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		System.out.println(permutations(arr).toString());
	}

}
