package Lec40;

import java.util.ArrayList;

public class Priority_Queue {

	private ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub

		int pi = (ci - 1) / 2;
		if (this.data.get(pi) > this.data.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		int ithvalue = this.data.get(i);
		int jthvalue = this.data.get(j);
		this.data.set(i, jthvalue);
		this.data.set(j, ithvalue);

	}

	public int delete() {
		int rv = this.data.get(0);
		swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;// minimum Idnex
		if (lci < this.data.size() && this.data.get(lci) < this.data.get(mini)) {
			mini = lci;
		}
		if (rci < this.data.size() && this.data.get(rci) < this.data.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}

	public int get() {
		return this.data.get(0);
	}

	public int size() {
		return this.data.size();
	}

	public void display() {
		System.out.println(data);
	}

}
