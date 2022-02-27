package Lec42;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ram", 90);
		map.put("Pooja", 190);
		map.put("Kunal",56);
		map.put("Pooja", 10);
		map.put("Anish", 9);
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.containsKey("Pooja"));
		System.out.println(map.get("Pooja"));
		System.out.println(map.remove("Ram"));
		System.out.println(map);
		System.out.println(map.size());
		

	}

}
