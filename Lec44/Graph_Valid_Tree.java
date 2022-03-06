package Lec44;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph_Valid_Tree {
	public boolean validTree(int n, int[][] edges) {
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new HashMap<>());

		}
		for (int i = 0; i < edges.length; i++) {
			int a = edges[i][0];
			int b = edges[i][1];
			map.get(a).put(b, 1);
			map.get(b).put(a, 1);

		}
		return istree(map);

	}

	public boolean istree(HashMap<Integer, HashMap<Integer, Integer>> map) {
		HashSet<Integer> visited = new HashSet<>();
		LinkedList<Integer> queue = new LinkedList<>();
          int count=0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			queue.add(src);
			while (!queue.isEmpty()) {
				// remove
				int rv = queue.remove();

				// Ignore if already visited
				if (visited.contains(rv)) {
					return false;
				}
				// print
				System.out.print(rv + " ");
				// marked visited
				visited.add(rv);
				// nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						queue.add(key);
					}

				}

			}
		}
		return count==1;
	}
}
