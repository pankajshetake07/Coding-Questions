package entities;

import java.util.Arrays;

public class MoveAllZerosToEndOfTheArray {

	public static void main(String[] args) {
		int[] arr = {0,0,0,3,0,1,0,4,0};
		
//		int[] arr = {3,5,0,0,4};
		int insert=0;
//		int start=0;
//		int end = arr.length-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[insert++] = arr[i];
			}
		}
		while(insert < arr.length) {
			arr[insert++] = 0;
		}
		
        for(int k=0; k<arr.length; k++) {
        	System.out.print(arr[k]+" ");
        }
		
//		for(; start<arr.length && start != end;start++) {
//			if(arr[end]==0) {
//				end --;
//			}
//			else if(arr[start]==0 && arr[end]!=0) {
//				int temp = arr[start];
//				arr[start] = arr[end];
//				arr[end] = temp;
//				end -- ;
//			}
//		}
		
		System.out.println(Arrays.toString(arr));
	}

}
