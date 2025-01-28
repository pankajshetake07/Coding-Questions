package entities;

public class RemoveDuplicate {
    static int removeDuplicates(int[] nums){
        int idx = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[idx++] = nums[i+1];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicates(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
