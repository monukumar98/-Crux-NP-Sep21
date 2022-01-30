package Lec34;

import java.util.LinkedList;

import java.util.Scanner;

public class Level_Order {

	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	private Node root;

	public Level_Order() {
		// TODO Auto-generated constructor stub
		this.root = Crate_Tree(null, true);
	}

	private Node Crate_Tree(Node parent, boolean rc) {// rc is right child
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("Enter root Node ");
		} else {
			if (rc == false) {
				System.out.println("Enter data of left chid " + parent.data);
			} else {
				System.out.println("Enter data of right chid " + parent.data);

			}
		}

		int item = sc.nextInt();
		Node nn = new Node(item);
		System.out.println("has left child " + nn.data);
		boolean hlc = sc.nextBoolean();// has left child nn ka
		if (hlc) {
			nn.left = Crate_Tree(nn, false);
		}
		System.out.println("has right child " + nn.data);
		boolean hrc = sc.nextBoolean();// has right child nn ka
		if (hrc) {
			nn.right = Crate_Tree(nn, true);
		}
		return nn;

	}

	public void Levelorder() {
		LinkedList<Node> q = new LinkedList<>();
		q.add(this.root);// 1k

		while (!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}
	}

	public void LevelorderLinewise() {
		LinkedList<Node> q = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		q.add(this.root);// 1k

		while (!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.data+" ");
			if (rv.left != null) {
				helper.add(rv.left);
			}
			if (rv.right != null) {
				helper.add(rv.right);
			}
			if (q.isEmpty()) {
				q = helper;
				helper = new LinkedList<>();
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		Level_Order lo = new Level_Order();
		//lo.Levelorder();
		lo.LevelorderLinewise();
	}
	// 10 true 2 true 7 false false true 18 false false true 50 true 90 false true 17 false false false

}
