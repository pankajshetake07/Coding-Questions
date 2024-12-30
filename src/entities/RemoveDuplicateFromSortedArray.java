package entities;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(32);
		list.add(40);
		list.add(43);
		list.add(60);
		list.add(72);
		list.add(78);
		list.add(82);
		list.add(82);
		list.add(82);
		list.add(99);
		
		int index = 0;
		for(int i=1; i<list.size(); i++) {
			if(!(list.get(index)).equals(list.get(i))){
				index++;
				list.set(index, list.get(i));
			}
		}
		while(list.size() > index +1) {
			list.remove(list.size()-1);
		}
		
		System.out.println(list);
	}

}
