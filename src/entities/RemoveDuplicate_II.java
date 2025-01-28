package entities;

public class RemoveDuplicate_II {
    static  int removeDuplicates(int[] nums){
        if(nums.length < 2) return nums.length;
        int idx = 2;
        for(int i=2; i<nums.length; i++){
            if(i<2 || nums[i] != nums[idx-2]){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int idx = removeDuplicates(nums);
        for(int i=0; i<idx; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
