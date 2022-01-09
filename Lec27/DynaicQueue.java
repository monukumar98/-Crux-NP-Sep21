package Lec27;

import Lec26.Queue;

public class DynaicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (this.isfull()) {
			int[] newarra = new int[2 * this.data.length];

			for (int i = 0; i < this.data.length; i++) {
				int idx = (this.front + i) % this.data.length;
				newarra[i] = data[idx];

			}

			this.data = newarra;
			this.front = 0;

		}
		super.Enqueue(item);

	}

}
