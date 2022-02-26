package Lec41;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		set.add("Ram");
		set.add("Rahul");
		set.add("Pooja");
		set.add("Shivam");
		set.add("Ankit");
		set.add("Pooja");
		System.out.println(set);
		TreeSet<String> set1 = new TreeSet<>();
		set1.add("Ram");
		set1.add("Rahul");
		set1.add("Pooja");
		set1.add("Shivam");
		set1.add("Ankit");
		set1.add("Pooja");
		System.out.println(set1);
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Ram");
		set2.add("Rahul");
		set2.add("Pooja");
		set2.add("Shivam");
		set2.add("Ankit");
		set2.add("Pooja");
		System.out.println(set2);
		

	}

}
