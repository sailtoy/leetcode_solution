package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem_077 {
	public static void main(String[] args) {
		Problem_077 p = new Problem_077();
		p.combine(4, 2);
	}
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		if (n < k || n < 1 || k < 1) {
			return result;
		}
		for (int i = 1; i <= n; i++) {
			path.add(i);
			dfs(n,k,i,result,path);
			path.remove(path.size()-1);
		}
		return result;
	}
	public void dfs(int n, int k, int cur,List<List<Integer>> result,List<Integer> path) {
		if (path.size() == k){
			result.add(new ArrayList<Integer>(path));
			return;
		}
		for (int i = cur + 1; i <= n; i++) {
			path.add(i);
			dfs(n, k, i,result,path);
			path.remove(path.size()-1);
		}
	}
}
