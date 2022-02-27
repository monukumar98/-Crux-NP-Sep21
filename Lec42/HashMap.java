package Lec42;

import java.util.ArrayList;

public class HashMap<K, V> {

	private class Node {
		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	private ArrayList<Node> bucketarray;
	private int size = 0;

	public HashMap(int no_of_bucket) {
		// TODO Auto-generated constructor stub
		bucketarray = new ArrayList<>();
		for (int i = 0; i < no_of_bucket; i++) {
			this.bucketarray.add(null);

		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public int Hashfunction(K key) {
		int hv = key.hashCode() % this.bucketarray.size();
		if (hv < 0) {
			hv += this.bucketarray.size();
		}
		return hv;
	}

	public void put(K key, V value) {
		int bn = Hashfunction(key);// bucket number
		Node temp = this.bucketarray.get(bn);// 1st node ka address
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;

		}
		Node nn = new Node(key, value);
		temp = this.bucketarray.get(bn);
		nn.next = temp;
		this.bucketarray.set(bn, nn);
		this.size++;
		int thf = 2;
		double ldf = (this.size) / this.bucketarray.size();
		if (ldf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> oba = this.bucketarray;// old bucket Array
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * oba.size(); i++) {
			nba.add(null);

		}
		this.bucketarray = nba;
		this.size = 0;

		for (Node temp : oba) {

			while (temp != null) {
				put(temp.key, temp.value);
			}

		}

	}

	public V get(K key) {
		int bn = Hashfunction(key);// bucket number
		Node temp = this.bucketarray.get(bn);

		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;

			}
			temp = temp.next;

		}
		return null;

	}

	public boolean containsKey(K key) {
		int bn = Hashfunction(key);// bucket number
		Node temp = this.bucketarray.get(bn);

		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;

			}
			temp = temp.next;

		}
		return false;

	}

	public V remove(K key) {
		int bn = Hashfunction(key);// bucket number
		Node temp = this.bucketarray.get(bn);
		Node prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {
				break;

			}
			prev = temp;
			temp = temp.next;

		}

		if (temp == null) {
			return null;
		}

		// 1st node
		if (prev == null) {
			prev = temp;
			this.bucketarray.set(bn, temp.next);
			prev.next = null;
			this.size--;
			return prev.value;
		} else {
			prev.next = temp.next;
			this.size--;
			return temp.value;
		}

	}

	@Override
	public String toString() {
		String str = "{";
		for (Node temp : this.bucketarray) {

			while (temp != null) {
				str = str + temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}

		}
		str = str + "}";
		return str;

	}

	public int size() {
		return this.size;
	}

}
