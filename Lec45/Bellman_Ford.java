package Lec45;

import java.util.ArrayList;
import java.util.HashMap;

public class Bellman_Ford {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Bellman_Ford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	private class EdgePair {
		int v1;
		int v2;
		int cost;

		public EdgePair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub

			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

	}

	public ArrayList<EdgePair> GetAllEges() {
		ArrayList<EdgePair> list = new ArrayList<>();
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				EdgePair ep = new EdgePair(v1, v2, map.get(v1).get(v2));

				list.add(ep);
			}
		}
		return list;

	}

	public void BellmanFordAlgo() {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 10000000;

		}
		ArrayList<EdgePair> edglist = GetAllEges();

		for (int i = 1; i <= v; i++) {
			for (EdgePair e : edglist) {
				int old = dis[e.v2];
				int ne = dis[e.v1] + e.cost;

				if (ne < old) {
					if (i < v) {
						dis[e.v2] = ne;
					} else {
						System.out.println("-ve wt ka cycle h");
						return;
					}
				}

			}
		}

		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + " --> " + dis[i]);

		}
	}

	public static void main(String[] args) {
		Bellman_Ford bf = new Bellman_Ford(5);
		bf.addEdge(1, 2, 8);
		bf.addEdge(1, 3, 4);
		bf.addEdge(1, 4, 5);
		bf.addEdge(2, 5, -1);
		bf.addEdge(5, 2, -2);
		bf.addEdge(3, 4, -3);
		bf.addEdge(4, 5, 4);
		bf.BellmanFordAlgo();
	}

}
