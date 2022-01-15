package Lec28;

import Lec27.DynaicStack;

public class Queue_using_Stack {

	private DynaicStack primary;

	private DynaicStack helper;

	public Queue_using_Stack() {
		// TODO Auto-generated constructor stub
		this.primary = new DynaicStack();
		this.helper = new DynaicStack();
	}

	public void Enqueue(int item) throws Exception {
		while (!this.primary.isEmpty()) {
			int i = this.primary.pop();
			this.helper.push(i);
		}
		this.primary.push(item);

		while (!this.helper.isEmpty()) {
			int i = this.helper.pop();
			this.primary.push(i);
		}
	}

	public int dequeue() throws Exception {

		return this.primary.pop();

	}

	public int getfornt() throws Exception {
		return this.primary.peek();
	}

	public int size() {
		return this.primary.size();
	}

}
