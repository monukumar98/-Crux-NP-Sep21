package Lec26;

public class Stack {
	protected int[] data;
	private int top = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
	}
	public Stack(int cap ) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
	}
	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isfull() {
		return this.top == this.data.length - 1;

	}

	public int size() {
		return this.top + 1;
	}

	public void push(int item) throws Exception {

		if (this.isfull()) {
			throw new Exception("pgl hai kya Stack full h");
		}

		top++;
		this.data[this.top] = item;

	}

	public int pop() throws Exception {

		if (isEmpty()) {
			throw new Exception("pgl hai kya Stack khaali h");
		}
		int item = this.data[this.top];
		top--;
		return item;

	}

	public int peek() throws Exception {

		if (isEmpty()) {
			throw new Exception("pgl hai kya Stack khaali h");
		}
		int item = this.data[this.top];

		return item;

	}

	public void display() {

		for (int i = 0; i <=this.top; i++) {
			System.out.print(this.data[i] + "-->");
		}
		System.out.println(".");
	}

}
