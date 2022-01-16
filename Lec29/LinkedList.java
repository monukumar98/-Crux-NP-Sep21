package Lec29;

public class LinkedList {

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

	public void addatindex(int k, int item) throws Exception {

		if (k < 0 || k > this.size) {
			throw new Exception("pgl hai sahi sa index dedo");

		}
		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th = getNode(k - 1);// 2k
			nn.next = k_1th.next;// 3k
			k_1th.next = nn;

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

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linkedlist is empty");
		}
		return this.head.data;
	}

	public int getLAst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linkedlist is empty");
		}
		return this.tail.data;
	}

	public int getatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("linkedlist is empty");
		}
		return this.getNode(k).data;
	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linkedlist is empty");
		}
		Node temp = this.head;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.head = this.head.next;
			temp.next = null;
			this.size--;
		}
		return temp.data;

	}

	public int removeLAst() throws Exception {
		if (this.size == 0) {
			throw new Exception("linkedlist is empty");
		}
		if (this.size == 1) {
			return removeFirst();
		} else {

			Node sl = getNode(this.size - 2);
			int item = sl.next.data;
			this.tail = sl;
			this.tail.next = null;
			this.size--;
			return item;

		}

	}

	public int removeatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("linkedlist is empty");
		}
		if (k == 0) {
			return removeFirst();

		} else if (k == this.size - 1) {
			return removeLAst();
		} else {
			Node k_1th = getNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;

		}

	}

	public void Dispaly() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}
