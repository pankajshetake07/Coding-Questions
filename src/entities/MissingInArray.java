package entities;

public class MissingInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		int n = 5;
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Missing element is : "+ ((n * (n+1) / 2) - sum));
	}

}
