package Lec35;


public class Sum_Root_to_Leaf_Numbers {
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
		public int sumNumbers(TreeNode root) {
             return NumberSum(root, 0);
		}

		public int NumberSum(TreeNode root, int ans) {
			if (root == null) {
				return ans;
			}

			if (root.left == null && root.right == null) {
				return ans * 10 + root.val;

			}
			int leftsum = NumberSum(root.left, ans * 10 + root.val);
			int rightsum = NumberSum(root.right, ans * 10 + root.val);
			return leftsum + rightsum;

		}
	}
}
