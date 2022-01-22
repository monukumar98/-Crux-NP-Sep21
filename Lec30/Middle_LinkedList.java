package Lec30;


public class Middle_LinkedList {

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
	
	
	public int mid() {
		
		Node Slow = this.head;
		Node Fast = this.head;
		
		
		while(Fast!=null && Fast.next!=null) {
			
			Fast = Fast.next.next;
			Slow=Slow.next;
		}
		return Slow.data;
		
		
	}
	
	public static void main(String[] args) {
		
		Middle_LinkedList ml = new Middle_LinkedList();
		ml.addLast(10);
		ml.addLast(20);
		ml.addLast(30);
		ml.addLast(40);
		ml.addLast(50);
		ml.addLast(60);
		
		System.out.println(ml.mid());
		
		
	}
	
	
	
}
