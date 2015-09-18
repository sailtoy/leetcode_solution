package leetcode_solutions;


public class Problem_111 {
	public int minDepth(TreeNode root) {
		if (root == null) 
			return 0;
		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);
		if (leftDepth == 0) 
			return rightDepth + 1;
		if (rightDepth == 0)
			return leftDepth + 1;
		return leftDepth < rightDepth ? leftDepth + 1 : rightDepth + 1;
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
