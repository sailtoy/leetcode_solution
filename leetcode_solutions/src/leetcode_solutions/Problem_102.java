package leetcode_solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_102 {
	public static void main(String[] args) {
		Problem_102 p = new Problem_102();
		TreeNode root = p.new TreeNode(1);
		TreeNode a = p.new TreeNode(2);
		TreeNode b = p.new TreeNode(3);
		TreeNode c = p.new TreeNode(4);
		root.left = a;
		root.right = b;
		a.left = c;
		
		p.levelOrder(root);
		
	}
	
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) 
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int cur = 0;
		int next = 0;
		q.offer(root);
		cur = 1;
		List<Integer> level = new ArrayList<Integer>();
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			
			if (cur != 0){
				level.add(node.val);
				cur--;
			}
			if (node.left != null){
				q.offer(node.left);
				next++;
			}
			if (node.right != null){
				q.offer(node.right);
				next++;
			}
			if(cur == 0){
				cur = next;
				next = 0;
				result.add(level);
				level = new ArrayList<Integer>();
			}
		}
		return result;
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
