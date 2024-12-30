package entities;

public class SortArraysWith0s1s2s {

	public static void main(String[] args) {		
		int nums[] = {2,0,2,1,1,0};
		int count0 = 0, count1 = 0, count2 = 0;
		int n = nums.length;
//		for(int i=0; i<n; i++) {
//			if(nums[i] == 0) count0++;
//			else if(nums[i] == 1) count1++;
//			else count2++;
//		}
//		int idx = 0;
//		for(int i=0; i<count0; i++) {
//			nums[idx++] = 0;
//		}
//		for(int i=0; i<count1; i++) {
//			nums[idx++] = 1;
//		}
//		for(int i=0; i<count2; i++) {
//			nums[idx++] = 2;
//		}
//		
//		for(int i=0; i<n; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		int low = 0, mid = 0, high = n-1;
		while(mid <= high) {
			if(nums[mid] == 0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				mid++; low++;
			}else if(nums[mid] == 1) {
				mid++;
			}else {
				int temp = nums[high];
				nums[high] = nums[mid];
				nums[mid] = temp;
				high--;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
