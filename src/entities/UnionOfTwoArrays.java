package entities;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {85, 25, 1, 32, 54, 6};
		int arr2[] = {85,2};
		
		//Approach 1
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			set.add(arr2[i]);
		}
		System.out.println(set);
		System.out.println(set.size());
		
		
		//Approach 2
//		List<Integer> list = new ArrayList<Integer>();
//		int i=0, j=0;
//		int m = arr1.length;
//		int n = arr2.length;
//		while(i < m && j < n) {
//			if(arr1[i] < arr2[j]) {
//				list.add(arr1[i]);
//				i++;
//			}
//			else if(arr1[i] > arr2[j]) {
//				list.add(arr2[j]);
//				j++;
//			}
//			else {
//				list.add(arr1[i]);
//				i++;
//				j++;
//			}
//		}
//		
//		while(i < m) {
//			list.add(arr1[i]);
//			i++;
//		}
//		
//		while(j < n) {
//			list.add(arr2[j]);
//			j++;
//		}
//		
//		System.out.println(list);
		
	}

}
