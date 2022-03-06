package Lec44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graph_2 {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
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

	public void BFT() {
		HashSet<Integer> visited = new HashSet<>();
		LinkedList<Integer> queue = new LinkedList<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			queue.add(src);
			while (!queue.isEmpty()) {
				// remove
				int rv = queue.remove();

				// Ignore if already visited
				if (visited.contains(rv)) {
					continue;
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
		System.out.println();

	}

	public void DFT() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			stack.push(src);
			while (!stack.isEmpty()) {
				// remove
				int rv = stack.pop();

				// Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// print
				System.out.print(rv + " ");
				// marked visited
				visited.add(rv);
				// nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						stack.push(key);
					}

				}

			}
		}
		System.out.println();

	}

	public boolean IsCycle() {
		HashSet<Integer> visited = new HashSet<>();
		LinkedList<Integer> queue = new LinkedList<>();

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			queue.add(src);
			while (!queue.isEmpty()) {
				// remove
				int rv = queue.remove();

				// Ignore if already visited
				if (visited.contains(rv)) {
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
		}
		return false;

	}

	public boolean IsConnected() {
		HashSet<Integer> visited = new HashSet<>();
		LinkedList<Integer> queue = new LinkedList<>();
		int count = 0;
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
					continue;
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
		}
		return count == 1;

	}

	public ArrayList<ArrayList<Integer>> GetAllConnectedComponent() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ArrayList<Integer> list = new ArrayList<>();
			stack.push(src);
			while (!stack.isEmpty()) {
				// remove
				int rv = stack.pop();

				// Ignore if already visited
				if (visited.contains(rv)) {
					continue;
				}
				// add
				list.add(rv);
				// marked visited
				visited.add(rv);
				// nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						stack.push(key);
					}

				}

			}
			ans.add(list);
		}
		return ans;

	}

}
