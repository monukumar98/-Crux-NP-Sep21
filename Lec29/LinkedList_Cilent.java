package Lec29;

import java.util.Scanner;

public class LinkedList_Cilent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			int item = sc.nextInt();
//			ll.addLast(item);
//		}
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.Dispaly();
		ll.addLast(4);
		ll.addLast(5);
		ll.Dispaly();
		ll.addFirst(6);
		ll.Dispaly();
		ll.addatindex(6, 90);
		ll.Dispaly();
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeLAst());
//		System.out.println(ll.removeLAst());
		System.out.println(ll.removeatindex(3));
		ll.Dispaly();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLAst());
//	  System.out.println(ll.getatindex(3));

	}

}
