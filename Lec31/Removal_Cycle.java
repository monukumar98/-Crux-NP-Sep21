package Lec31;

public class Removal_Cycle {

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

	public void Crete_Cycle() throws Exception {

		Node nn = getNode(2);
		this.tail.next = nn;

	}

	public Node MeetingNode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

// o(n^2)
	public void RemoveCycle1() {
		Node meet = MeetingNode();
		if (meet == null) {
			return;
		}

		Node start = this.head;
		while (start != null) {
			Node temp = meet;

			while (temp.next != meet) {

				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}

			start = start.next;
		}

	}

	public void RemoveCycle2() {
		Node meet = MeetingNode();
		if (meet == null) {
			return;
		}

		// No of Node in a Cycle
		Node temp = meet;
		int count = 1;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}

		// Fast ko N steps chala do
		Node fast = this.head;
		for (int i = 1; i <= count; i++) {

			fast = fast.next;
		}

		// fast n Steps Ahead from Slow
		Node slow = this.head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void FloyedCycleRemoval() {
		Node meet = MeetingNode();
		if (meet == null) {
			return;
		}

		Node slow = this.head;
		Node fast = meet;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void Dispaly() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) throws Exception {
		Removal_Cycle rc = new Removal_Cycle();
		rc.addLast(1);
		rc.addLast(2);
		rc.addLast(3);
		rc.addLast(4);
		rc.addLast(5);
		rc.addLast(6);
		rc.addLast(7);
		rc.addLast(8);
		rc.Crete_Cycle();
		//rc.RemoveCycle2();
		rc.FloyedCycleRemoval();
		rc.Dispaly();

	}

}
