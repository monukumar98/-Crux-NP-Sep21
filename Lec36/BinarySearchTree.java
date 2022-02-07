package Lec36;

public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	private Node root;

	public BinarySearchTree(int[] in) {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(in, 0, in.length - 1);

	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}

		int mid = (si + ei) / 2;
		Node nn = new Node(in[mid]);
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);

		return nn;
	}

	public void PreOrder() {

		PreOrder(this.root);
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

}
