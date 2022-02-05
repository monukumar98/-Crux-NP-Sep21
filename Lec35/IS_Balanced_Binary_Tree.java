package Lec35;

public class IS_Balanced_Binary_Tree {

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

	public class BalancedPair {
		boolean isbal = true;
		int ht = -1;
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return isbalnce(root).isbal;

		}

		public BalancedPair isbalnce(TreeNode root) {
			if (root == null) {
				return new BalancedPair();
			}

			BalancedPair lbp = isbalnce(root.left);
			BalancedPair rbp = isbalnce(root.right);
			BalancedPair sbp = new BalancedPair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean bf = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbal = lbp.isbal && rbp.isbal && bf;
			return sbp;

		}
	}
}
