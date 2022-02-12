package Lec37;


public class Create_Tree_Using_Level_Order {
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

	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		LinkedList<Node> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Node nn = new Node(item);
		this.root = nn;
		list.add(nn);
		while (!list.isEmpty()) {

			Node rv = list.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node nw = new Node(c1);
				rv.left = nw;
				list.add(nw);
			}
			if (c2 != -1) {
				Node nw = new Node(c2);
				rv.right = nw;
				list.add(nw);
			}

		}

		return root;
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

	public class maxdeth {
		int d = -1;
	}

	public void RightView() {
		RightView(this.root, 0, new maxdeth());

	}

	private void RightView(Node root2, int currlevel, maxdeth md) {

		if (root2 == null) {
			return;
		}

		if (md.d < currlevel) {
			System.out.print(root2.data + " ");
			md.d = currlevel;
		}
		RightView(root2.right, currlevel + 1, md);
		RightView(root2.left, currlevel + 1, md);

	}

	public static void main(String[] args) {
		Create_Tree_Using_Level_Order clv = new Create_Tree_Using_Level_Order();
		clv.PostOrder();
		clv.RightView();

	}

}
