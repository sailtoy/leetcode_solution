package leetcode_solutions;

import java.util.Arrays;

public class Problem_074 {
	public static void main(String[] args) {
		/*int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };*/
		int [][] matrix = {{1}};
		Problem_074 p = new Problem_074();
		p.searchMatrix(matrix, 1);
		System.out.println();
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		boolean result = false;
		for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			if (Arrays.binarySearch(row, target) >= 0) {
				result = true;
				break;
			}
		}
		return result;
	}
}
