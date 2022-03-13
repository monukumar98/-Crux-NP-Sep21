package Lec45;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstraalgo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstraalgo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	private class DijkstraPair {
		int vtx;
		String Acqrpath;
		int cost;

		public DijkstraPair(int vtx, String path, int cost) {
			// TODO Auto-generated constructor stub
			this.Acqrpath = path;
			this.cost = cost;
			this.vtx = vtx;
		}

		@Override
		public String toString() {
			return this.vtx + " vai " + this.Acqrpath + " @ " + this.cost;
		}

	}

	public void Dijkstra() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});

		DijkstraPair dp = new DijkstraPair(1, "1", 0);
		pq.add(dp);
		while (!pq.isEmpty()) {
			DijkstraPair rp = pq.remove();

			if (visited.contains(rp.vtx)) {
				continue;
			}

			visited.add(rp.vtx);

			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					DijkstraPair np = new DijkstraPair(nbrs, rp.Acqrpath + nbrs, 
							rp.cost + map.get(rp.vtx).get(nbrs));
				pq.add(np);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Dijkstraalgo pa = new Dijkstraalgo(7);
		pa.addEdge(1, 2, 2);
		pa.addEdge(2, 3, 3);
		pa.addEdge(1, 4, 10);
		pa.addEdge(4, 5, 8);
		pa.addEdge(3, 4, 1);
		pa.addEdge(5, 6, 5);
		pa.addEdge(5, 7, 6);
		pa.addEdge(6, 7, 4);
		pa.Dijkstra();
	}

}
