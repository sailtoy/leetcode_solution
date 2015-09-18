package leetcode_solutions;

public class Problem_124 {
	private int result;
	public static void main(String[] args) {
		Problem_124 p = new Problem_124();
		TreeNode root = p.new TreeNode(-1);
		TreeNode left = p.new TreeNode(-2);
		TreeNode right = p.new TreeNode(3);
		root.left = left;
		root.right = right;
		p.maxPathSum(root);
		System.out.println();
	}
	
	public int maxPathSum(TreeNode root) {
		if (root == null)
			return 0;
		result = Integer.MIN_VALUE;
		dfs(root);
		return result;
	}

	public int dfs(TreeNode root) {
		if (root == null)
			return 0;
		int left = dfs(root.left);
		int right = dfs(root.right);
		int cur = root.val;
		if (left > 0)
			cur += left;
		if (right > 0)
			cur += right;
		if (cur > result)
			result = cur;
		cur = left > right ? left : right;
		return root.val + (cur > 0 ? cur : 0);
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
