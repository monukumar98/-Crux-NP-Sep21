package Lec33;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		bt.display();
		System.out.println(bt.find(90));
		System.out.println(bt.min());
		System.out.println(bt.size());
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.PostOrder();
		bt.InOrder();

	}
// 10 true 2 true 7 false false true 18 false false true 50 true 90 false true 17 false false false

}
