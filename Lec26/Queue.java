package Lec26;

public class Queue {
	protected int[] data;
	protected int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.size == 0;

	}

	public boolean isfull() {
		return this.size == this.data.length;
	}

	public int size() {
		return this.size;
	}

	public void Enqueue(int item) throws Exception {
		if (this.isfull()) {
			throw new Exception("suno  jb Queue full  hai to element kyu add kr rahe ho");
		}
		int i = (this.front + this.size) % this.data.length;
		this.data[i] = item;
		this.size++;

	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Kuch nhi milega");
		}
		int item = this.data[this.front];
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return item;

	}

	public int GetFront() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Kuch nhi milega");
		}
		int item = this.data[this.front];
		return item;

	}

	public void display() {

		for (int i = 0; i < this.size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");

		}
		System.out.println();
	}

}
