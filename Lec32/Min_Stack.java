package Lec32;

import java.util.Stack;

public class Min_Stack {

	private Stack<Integer> s = new Stack<>();
	private int min;

	public void push(int item) {
		if (s.isEmpty()) {
			this.s.push(item);
			this.min = item;
		} else if (item >= this.min) {
			this.s.push(item);
		} else {
			int val = 2 * item - this.min;
			this.s.push(val);
			this.min = item;

		}
	}

	public int pop() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("pgl h??");
		}
		
		if(s.peek()>=this.min) {
			return s.pop();
		}
		else {
			int val = s.pop();
			int od_item = this.min;
			this.min=2*od_item-val;
			return od_item;
		}
	
	}

	
	
	public int peek() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("pgl h??");
		}
		
		if(s.peek()>=this.min) {
			return s.peek();
		}
		else {
			int od_item = this.min;
			return od_item;
		}
	
	}
	public int size() {
		return this.size();
	}

	public int min() {
		return this.min;
	}

}
