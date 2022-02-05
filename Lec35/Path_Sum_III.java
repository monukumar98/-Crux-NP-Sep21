package Lec35;

public class Path_Sum_III {

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
		public int pathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return 0;
			}

			int count = countpath(root, targetSum);
			int leftpath = pathSum(root.left, targetSum);
			int rightpath = pathSum(root.right, targetSum);
			return count + leftpath + rightpath;

		}

		private int countpath(TreeNode root, int targetSum) {
			// TODO Auto-generated method stub
			if (root == null) {
				return 0;
			}
			int count = 0;
			if (targetSum - root.val == 0) {
				count++;
			}

			count = count + countpath(root.left, targetSum - root.val);
			count = count + countpath(root.right, targetSum - root.val);
			return count;
		}

	}

}
