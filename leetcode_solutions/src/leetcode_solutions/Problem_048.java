package leetcode_solutions;

public class Problem_048 {
	public static void main(String[] args) {
		Problem_048 p = new Problem_048();
		//int[][] test = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] test = {{1}};
		p.rotate(test);
		printMatrix(test);
	}
	
	public static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int col = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == matrix[n-j-1][n-i-1]) 
					continue;
				matrix[i][j] ^= matrix[n-j-1][n-i-1];
				matrix[n-j-1][n-i-1] ^= matrix[i][j];
				matrix[i][j] ^= matrix[n-j-1][n-i-1];
			}
			col--;
		}
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == matrix[n-i-1][j]) 
					continue;
				matrix[i][j] ^= matrix[n-i-1][j];
				matrix[n-i-1][j] ^= matrix[i][j];
				matrix[i][j] ^= matrix[n-i-1][j];
			}
		}
	}
}
