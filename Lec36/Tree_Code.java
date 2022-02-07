package Lec36;

import java.util.Scanner;

public class Tree_Code {
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

	public Tree_Code() {
		// TODO Auto-generated constructor stub
		this.root = Crate_Tree();
	}

	private Node Crate_Tree() {// rc is right child
		// TODO Auto-generated method stub

		int item = sc.nextInt();
		Node nn = new Node(item);
		boolean hlc = sc.nextBoolean();// has left child nn ka
		if (hlc) {
			nn.left = Crate_Tree();
		}
		boolean hrc = sc.nextBoolean();// has right child nn ka
		if (hrc) {
			nn.right = Crate_Tree();
		}
		return nn;

	}

	public void display() {
		display(this.root);
	}

	private void display(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		String str = "<--" + nn.data;
		if (nn.left != null) {
			str = nn.left.data + str;
		} else {
			str = "." + str;
		}
		str = str + "-->";
		if (nn.right != null) {
			str = str + nn.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		display(nn.left);
		display(nn.right);

	}

	public static void main(String[] args) {
		Tree_Code m = new Tree_Code();
		m.display();
	}

}