package Lec36;

public class Delete_BST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
          
			return delete(root, key);
		}

		public TreeNode delete(TreeNode root, int key) {
			if (root == null) {
				return null;
			}
			if (root.val > key) {
				root.left = delete(root.left, key);
			} else if (root.val < key) {
			 root.right = delete(root.right, key);
			}

			else {
				// 0 ya 1 child
				if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					int min = min(root.right);
					root.val = min;
					root.right=delete(root.right, min);
					return root;
				}

			}
			return root;
			

		}

		public int min(TreeNode root) {
			if (root == null) {
				return Integer.MAX_VALUE;
			}

			return Math.min(root.val, min(root.left));

		}

	}

}
