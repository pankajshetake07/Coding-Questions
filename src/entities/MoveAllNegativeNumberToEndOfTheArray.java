package entities;

public class MoveAllNegativeNumberToEndOfTheArray{
	public static void f1(int[] arr) {
		int idx = 0;
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) 
                temp[idx++] = arr[i];
        }
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) 
                temp[idx++] = arr[i];
        }
		for(int i=0; i<temp.length; i++) {
			arr[i] = temp[i];
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(arr[i]+" ");;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,-1,3,2,-7,-5,11,6};
		f1(arr);

	}

}
