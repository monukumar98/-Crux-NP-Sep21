package Lec33;

import java.util.Scanner;

public class Binary_Tree {
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

	public Binary_Tree() {
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

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lb = find(node.left, item);
		boolean rb = find(node.right, item);
		return lb || rb;

	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int smin = node.data;
		int leftmin = min(node.left);
		int rightmin = min(node.right);
		return Math.min(leftmin, Math.min(smin, rightmin));

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");

		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);

	}

}
