package Lec36;

public class Validate_Binary_Search_Tree {
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

	public class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		Long max = Long.MIN_VALUE;
		// sum --> hole tree summ
		// ans --> bst ka sum 
	}

	class Solution {
		public boolean isValidBST(TreeNode root) {
			if (root.left == null && root.right == null) {
				return true;
			}
			return ValidBST(root).isbst;
		}

		public BstPair ValidBST(TreeNode root) {

			if (root == null) {
				return new BstPair();
			}

			BstPair lbp = ValidBST(root.left);
			BstPair rbp = ValidBST(root.right);

			BstPair sbp = new BstPair();
			long leftmax = lbp.max;
			long rightmin = rbp.min;
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			if (lbp.isbst && rbp.isbst && leftmax < root.val && rightmin > root.val) {
				sbp.isbst = true;
				
			} else
				sbp.isbst = false;

			return sbp;

		}
	}
}
