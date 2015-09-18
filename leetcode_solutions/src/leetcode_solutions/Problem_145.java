package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem_145 {
	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) {
			return result;
		}
		postTravel(root);
		return result;
	}

	public void postTravel(TreeNode root) {
		if (root.left != null)
			postTravel(root.left);
		if (root.right != null)
			postTravel(root.right);
		result.add(root.val);
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
