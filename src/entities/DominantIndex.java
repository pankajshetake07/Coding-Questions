package entities;

public class DominantIndex {
    static int dominantIndex(int[] nums){
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i != maxIdx && (nums[i] * 2) > nums[maxIdx]){
                return -1;
            }
        }
        return maxIdx;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(dominantIndex(nums));
    }
}
