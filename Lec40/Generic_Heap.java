package Lec40;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub

		int pi = (ci - 1) / 2;
		if (islarger(this.data.get(ci), this.data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);

		}
//		if (this.data.get(pi) > this.data.get(ci)) {
//			swap(pi, ci);
//			upheapify(pi);
//		}

	}

	private void swap(int i, int j) {
		T ithvalue = this.data.get(i);
		T jthvalue = this.data.get(j);
		this.data.set(i, jthvalue);
		this.data.set(j, ithvalue);

	}

	public T delete() {
		T rv = this.data.get(0);
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
		if (lci < this.data.size() && islarger(this.data.get(lci), this.data.get(mini))>0) {
			mini = lci;
		}
		if (rci < this.data.size() && islarger(this.data.get(rci), this.data.get(mini))>0) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}

	public T get() {
		return this.data.get(0);
	}

	public int size() {
		return this.data.size();
	}

	public void display() {
		System.out.println(data);
	}

	public int islarger(T o1, T o2) {
		return o1.compareTo(o2);

	}

}
