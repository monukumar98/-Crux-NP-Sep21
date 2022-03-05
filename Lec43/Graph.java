package Lec43;

import java.util.*;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void addvertx(int v) {
		if (map.containsKey(v)) {
			return;
		}
		map.put(v, new HashMap<>());
	}

	public int noofedge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();

		}
		return sum / 2;
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean ContainsVertx(int v) {
		return map.containsKey(v);
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}

	public void removeVertx(int v) {
		for (int key : map.get(v).keySet()) {
			map.get(key).remove(v);
		}
		map.remove(v);
	}

	public void Display() {
		for (int key : map.keySet()) {
			System.out.println(key + " --> " + map.get(key));
		}
	}

	public boolean HashPath(int src, int dis, HashSet<Integer> visited) {
		if (src == dis) {
			return true;
		}
		visited.add(src);

		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				boolean res = HashPath(key, dis, visited);
				if (res) {
					return res;
				}
			}
		}
		visited.remove(src);
		return false;
	}

	public void PrintallPath(int src, int dis, HashSet<Integer> visited, String ans) {
		visited.add(src);
		if (src == dis) {

			System.out.println(ans + src);

		}

		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				PrintallPath(key, dis, visited, ans + src + " ");

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int dis) {
		HashSet<Integer> visited = new HashSet<>();
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(src);
		while (!queue.isEmpty()) {
			// remove
			int rv = queue.remove();

			// Ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}
			// src==dis
			if (rv == dis) {
				return true;
			}
			// marked visited
			visited.add(rv);
			// nbrs
			for (int key : map.get(rv).keySet()) {
				if (!visited.contains(key)) {
					queue.add(key);
				}

			}

		}
		return false;

	}

	public boolean DFS(int src, int dis) {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(src);
		while (!stack.isEmpty()) {
			// remove
			int rv = stack.pop();

			// Ignore if already visited
			if (visited.contains(rv)) {
				continue;
			}
			// src==dis
			if (rv == dis) {
				return true;
			}
			// marked visited
			visited.add(rv);
			// nbrs
			for (int key : map.get(rv).keySet()) {
				if (!visited.contains(key)) {
					stack.push(key);
				}

			}

		}
		return false;

	}

}
