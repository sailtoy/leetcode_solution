package leetcode_solutions;

import java.util.Stack;

public class Problem032 {

	public static void main(String[] args) {
		Problem032 p = new Problem032();
		System.out.println(p.isValid("ab{3}23(32)"));
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
				stack.push(c[i]);
			} else if (c[i] == ')' || c[i] == '}' || c[i] == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char sign = stack.pop();
					if (c[i] == ')' && sign != '(') {
						return false;
					}else if (c[i] == '}' && sign != '{') {
						return false;
					}else if (c[i] == ']' && sign != '[') {
						return false;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
}
