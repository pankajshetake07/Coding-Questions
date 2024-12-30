package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestSquareStreakInAnArray {
	 public static int longestSquareStreak(int[] nums) {
	        Arrays.sort(nums);
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(nums[0]);
	        for(int i=0; i<nums.length; i++){
	            int sq = nums[i] * nums[i];
	            for(int j=1; j<nums.length; j++) {
	            	if(list.contains(sq)) {
	            		list.add(sq);	
	            	}
	            }
	        }
	        return list.size();
	    }

	public static void main(String[] args) {
		int arr[] = {4,3,6,16,8,2};
		System.out.println(longestSquareStreak(arr));
	}

}
