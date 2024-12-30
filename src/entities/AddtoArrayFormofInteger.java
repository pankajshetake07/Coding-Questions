package entities;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int arr[] = {9,9,9,9,9,9,9,9};
		int k=1;
		int n = arr.length;
		for(int i=n-1; i>=0; i--) {
			k = k + arr[i];
			list.add(k % 10);
			k = k / 10;
		}
		while(k>0) {
			list.add(k % 10);
			k = k / 10;
		}
		Collections.reverse(list);
		System.out.println(list);
	}

}
