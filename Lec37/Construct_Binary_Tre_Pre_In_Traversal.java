package Lec37;

public class Construct_Binary_Tre_Pre_In_Traversal {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {

			return CreateTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);

		}

		private TreeNode CreateTree(int[] preorder, int[] inorder, int ilo, int ihi, int plo, int phi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}

			TreeNode node = new TreeNode(preorder[plo]);
			int i = Sreach(inorder, preorder[plo], ilo, ihi);
			int net = i - ilo;
			node.left = CreateTree(preorder, inorder, ilo, i - 1, plo + 1, plo + net);
			node.right = CreateTree(preorder, inorder, i + 1, ihi, plo + net + 1, phi);
			return node;
		}

		private int Sreach(int[] inorder, int item, int si, int ei) {
			// TODO Auto-generated method stub

			for (int i = si; i <= ei; i++) {
				if (inorder[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}
	

}
