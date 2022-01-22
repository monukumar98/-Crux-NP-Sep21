package Lec30;

public class Delete_Node {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public void deleteNode(ListNode node) {

			ListNode node_next = node.next;
			node.val = node_next.val;
			node.next = node_next.next;
			node_next.next = null;

		}
	}
}
