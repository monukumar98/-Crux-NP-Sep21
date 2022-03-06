package Lec44;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph_Bipartite {
	public boolean isBipartite(int[][] graph) {
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		for (int i = 0; i < graph.length; i++) {
			map.put(i, new HashMap<>());

		}
		for (int i = 0; i < graph.length; i++) {

			for (int j = 0; j < graph[i].length; j++) {
				map.get(i).put(graph[i][j], 10);

			}
		}
		return isBipartite(map);

	}

	public boolean isBipartite(HashMap<Integer, HashMap<Integer, Integer>> map) {
		HashMap<Integer, BipartitePair> visited = new HashMap<>();
		LinkedList<BipartitePair> queue = new LinkedList<>();
		
		for (int src : map.keySet()) {
			if (visited.containsKey(src)) {
				continue;
			}
			
			BipartitePair bp = new BipartitePair(src, 0);
			queue.add(bp);
			while (!queue.isEmpty()) {
				// remove
				BipartitePair rp = queue.remove();

				// Ignore if already visited
				if (visited.containsKey(rp.vtx)) {
					if (visited.get(rp.vtx).lv != rp.lv) {
						return false;
					}
				}

				// marked visited
				visited.put(rp.vtx, rp);
				// nbrs
				for (int key : map.get(rp.vtx).keySet()) {
					if (!visited.containsKey(key)) {
						BipartitePair np = new BipartitePair(key, rp.lv + 1);
						queue.add(np);
					}

				}

			}

		}
		return true;
	}

	public class BipartitePair {
		int vtx;
		int lv;

		public BipartitePair(int vtx, int lv) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.lv = lv;
		}
	}

}
