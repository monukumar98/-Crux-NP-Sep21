package Lec36;

public class Add_BST {
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
		public TreeNode insertIntoBST(TreeNode root, int val) {
			return Add(root, val);
		}

		public TreeNode Add(TreeNode root, int item) {

			if (root == null) {
				TreeNode nn = new TreeNode(item);
				return nn;
			}

			if (root.val > item) {

				root.left = Add(root.left, item);

			}

			else {
				root.right = Add(root.right, item);
			}

			return root;
		}
	}
}
