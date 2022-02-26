package Lec41;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Rahul", 89);
		map.put("Aniket", 79);
		map.put("Pooja", 59);
		map.put("Anku", 19);
		map.put("Anku", 89);
		System.out.println(map);
		
		// part -1;
		Set<String> set=map.keySet();
		System.out.println(set);
		for(String s:set) {
			System.out.println(s+" "+map.get(s));
		}
		System.out.println("......................");
		
		// part -2
		ArrayList<String > ll = new ArrayList<>(map.keySet());
		for (String s:ll) {
			System.out.println(s+" "+map.get(s));
		}
		
		// part-3
		System.out.println("..................");
		for(String s:map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
		
		// get 
		
//		System.out.println(map.get("aniket"));
//		System.out.println(map.get("Anku"));
//		
//		// Contains
//		System.out.println(map.containsKey("Ankit"));
//		System.out.println(map.containsKey("Anku"));
//		
		// remove
//		System.out.println(map.remove("Anku"));
//		System.out.println(map);
		
		
		
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Rahul", 89);
		map1.put("Aniket", 79);
		map1.put("Pooja", 59);
		map1.put("Anku", 19);
		map1.put("Anku", 89);
		//System.out.println(map1);
		
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Anku", 89);
		map2.put("Rahul", 89);
		map2.put("Aniket", 79);
		map2.put("Pooja", 59);
		map2.put("Anku", 19);
		
		//System.out.println(map2);
		
		
		
		
		
		

	}

}
