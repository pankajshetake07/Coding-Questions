package entities;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		int [] nums = {1,0};
//		int [] ans = new int[nums.length];	
//		
//		for(int i=0; i<nums.length; i++) {
//			int product = 1;
//			for(int j=0; j<nums.length; j++) {
//				if(i!=j) {
//					product = product * nums[j];
//				}
//			}
//			ans[i] = product;
//		}
		
		int ans[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
//        prefix[0] = 1;
//        suffix[0] = 1;
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
		
		
		for(int i=0; i<prefix.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
