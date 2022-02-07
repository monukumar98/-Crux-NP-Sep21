package Lec36;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		BinarySearchTree bst = new BinarySearchTree(arr);
		bst.PreOrder();

	}

}
