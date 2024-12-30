package entities;

public class FindThird {

	public static void main(String[] args) {
		int arr[] = {2,2,3,1};
		int first = 0;
		int second = 0;
		int third = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < second) {
				if(first > second)
					second = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > third) {
				if(second > third && third < first)
					third = arr[i];
			}
		}
		System.out.println(third);
	}

}
