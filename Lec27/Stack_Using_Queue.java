package Lec27;

public class Stack_Using_Queue {
	private DynaicQueue primary;
	private	DynaicQueue Helper;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		this.Helper = new DynaicQueue();
		this.primary = new DynaicQueue();

	}

	public boolean isEmpty() {
		return this.primary.size() == 0;

	}

	public int size() {
		return this.primary.size();

	}

	public void push(int item) throws Exception {
		this.primary.Enqueue(item);
	}

	public int pop() throws Exception {

		while (this.primary.size() > 1) {

			this.Helper.Enqueue(this.primary.dequeue());
		}
		int rv = this.primary.dequeue();

		while (this.Helper.size() > 0) {

			this.primary.Enqueue(this.Helper.dequeue());
		}
		return rv;
	}

	public int Peek() throws Exception {

		while (this.primary.size() > 1) {

			this.Helper.Enqueue(this.primary.dequeue());
			
		}
		int rv = this.primary.dequeue();

		while (this.Helper.size() > 0) {

			this.primary.Enqueue(this.Helper.dequeue());
		}
		this.primary.Enqueue(rv);
		return rv;
	}
}
