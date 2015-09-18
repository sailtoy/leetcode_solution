package leetcode_solutions;

import java.util.Arrays;

public class Problem_106 {
	public static void main(String[] args) {
		int inorder[] = {5,4,3,2,1};
		int postorder[] = {5,4,3,2,1};
		Problem_106 p = new Problem_106();
		TreeNode root = p.buildTree(inorder,postorder);
		System.out.println();
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || inorder.length == 0)
			return null;
		int index = inorder.length - 1;
		while(inorder[index] != postorder[postorder.length - 1])
			index--;
		TreeNode root = new TreeNode(postorder[postorder.length - 1]);
		root.left = buildTree(Arrays.copyOfRange(inorder, 0, index),Arrays.copyOfRange(postorder, 0, index));
		root.right = buildTree(Arrays.copyOfRange(inorder, index+1, inorder.length),Arrays.copyOfRange(postorder, index, postorder.length - 1));
		return root;
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
