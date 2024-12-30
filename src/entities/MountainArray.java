package entities;

public class MountainArray {

	public static void main(String[] args) {
		int nums[] = {2,1,1,5,6,2,3,1};
		int start = 0;
        int end = nums.length-1;
        int mid = start + (end - start);
        int count=0;
        for(int i=0; i<mid; i++){
            if( (nums[i+1] > nums[i] || nums[i] == nums[i+1]) && nums[i] < nums[mid]){
                count++;
            }
        }

        for(int i=mid+1; i<end; i++){
            if( (nums[i] < nums[i+1] || nums[i] == nums[i+1]) && nums[mid] > nums[i]){
                count++;
            }
        } 
        System.out.println(count);
	}

}
