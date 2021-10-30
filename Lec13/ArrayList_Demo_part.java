package Lec13;

import java.util.*;

public class ArrayList_Demo_part {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int item = sc.nextInt();
			//list.add(sc.nextInt());
			list.add(item);
		}
		System.out.println(list);
		
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		

	}

}
