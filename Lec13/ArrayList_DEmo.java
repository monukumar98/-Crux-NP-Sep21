package Lec13;
import java.util.*;
public class ArrayList_DEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		System.out.println(list);
		System.out.println(list.size());
		// add at index
		// Range 0 to Size()
		list.add(0, 30);
		System.out.println(list);
		list.add(1, 50);
		System.out.println(list);
		list.add(list.size(),90);
		System.out.println(list);
		
		// Set value uapdate
		
		// 0 to size()-1
		list.set(1, 80);
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		

	}

}
