package entities;

public class Temp {

	public static void main(String[] args) {
		int nums[] = {10, 10, 10};
		int first = -1;
		int second = -1;
		for(int i=0; i<nums.length; i++){
			if(nums[i] > first){
				second = first;
				first = nums[i];
			}
		}
		System.out.println(second);
	}

}
