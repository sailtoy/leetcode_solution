package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem_022 {
	public static void main(String[] args) {
		Problem_022 p = new Problem_022();
		System.out.println(p.generateParenthesis(4));
	}

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		if (n > 0)
			dfs(result, "", n, n);
		return result;
	}

	public void dfs(List<String> result, String cur, int m, int n) {
		if (m == 0 && n == 0) {
			result.add(cur);
		} else {
			if (m != 0)
				dfs(result, cur + "(", m - 1, n);
			if (m < n && n != 0)
				dfs(result, cur + ")", m, n - 1);
		}
	}
}
