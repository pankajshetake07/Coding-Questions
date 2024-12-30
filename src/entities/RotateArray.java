package entities;

public class RotateArray {
	
	public static void reverse(int arr[], int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,12,14,16,18,20};
		int pos = 3;
		int start = 0;
		int end = arr.length;
		pos = pos%end;
		reverse(arr, start, pos-1);
		reverse(arr, pos, end-1);
		reverse(arr, start, end-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
