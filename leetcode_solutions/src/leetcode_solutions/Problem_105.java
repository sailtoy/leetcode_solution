package leetcode_solutions;

import java.util.Arrays;
public class Problem_105 {
	public static void main(String[] args) {
		int preorder[] = {1,2,4,3,5,6};
		int inorder[] = {4,2,1,5,3,6};
		Problem_105 p = new Problem_105();
		TreeNode root = p.buildTree(preorder,inorder);
		System.out.println();
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (inorder == null || inorder.length == 0)
			return null;
		int index = 0;
		while(inorder[index] != preorder[0])
			index++;
		TreeNode root = new TreeNode(preorder[0]);
		root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1),Arrays.copyOfRange(inorder, 0, index));
		root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),Arrays.copyOfRange(inorder, index+1, inorder.length));
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
