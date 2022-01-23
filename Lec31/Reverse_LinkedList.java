package Lec31;

public class Reverse_LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}

	}

	public void addLast(int item) {

		if (this.size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	private Node getNode(int k) throws Exception {

		if (k < 0 || k == this.size) {
			throw new Exception("k outof rage ka hai ");
		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public void Dispaly() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void ReverseData_I() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {

			Node left_node = getNode(left);// arr[left]
			Node right_node = getNode(right);// arr[right]
			int temp = left_node.data;
			left_node.data = right_node.data;
			right_node.data = temp;

			left++;
			right--;

		}

	}

	public void reverseList_Pointer() {

		Node prev = null;
		Node curr = this.head;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;

		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

	}

	public void reverseList_Pointer_Recr() {
		reverseList_Pointer_Recr(this.head, null);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

	private void reverseList_Pointer_Recr(Node Curr, Node Prev) {
		if (Curr == null) {
			return;
		}
		reverseList_Pointer_Recr(Curr.next, Curr);
		Curr.next = Prev;

	}

	public void ReverseData_Recu() {

		HeapMover mover = new HeapMover(this.head);
		ReverseData_Recu(this.head, mover, 0);

	}

	public class HeapMover {
		Node left;

		public HeapMover(Node left) {
			// TODO Auto-generated constructor stub
			this.left = left;
		}

	}

	private void ReverseData_Recu(Node curr, HeapMover prev, int count) {
		if (curr == null) {
			return;
		}

		ReverseData_Recu(curr.next, prev, count + 1);
		if (count >= this.size / 2) {
			int t = curr.data;
			curr.data = prev.left.data;
			prev.left.data = t;
			prev.left = prev.left.next;
		}

	}

}
