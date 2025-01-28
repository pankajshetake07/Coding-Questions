package entities;
public class RemoveElement {
    static int removeElement(int[] nums, int val){
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(val != nums[i]){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    } 
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int idx = removeElement(nums, 2);
        for(int i=0; i<idx; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
