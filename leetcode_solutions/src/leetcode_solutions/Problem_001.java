package leetcode_solutions;

import java.util.HashMap;
import java.util.Map;

public class Problem_001 {
	public static void main(String[] args) {
		int[] numbers = {0,4,3,0};
		int target = 0;
		Problem_001 p = new Problem_001();
		int[] result = p.twoSum(numbers, target);
		System.out.println(result);
	}
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i]) && (numbers[i]*2 == target)) {
				result[0] = map.get(numbers[i]) + 1;
				result[1] = i + 1;
				return result;
			}
			map.put(numbers[i], i);
		}
		for (int i = 0; i < numbers.length; i++) {
			int remain = target - numbers[i];
			if (remain == numbers[i])
				continue;
			if (map.containsKey(remain)) {
				result[0] = i + 1;
				result[1] = map.get(remain) + 1;
				break;
			}
		}
		return result;
	}
}
