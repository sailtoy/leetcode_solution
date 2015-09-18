package leetcode_solutions;

public class Problem_053 {
	public static void main(String[] args) {
		Problem_053 p = new Problem_053();
		 int A[] = {-2,1,-3,4,-1,2,1,-5,4};
		//int A[] = { -2, -1 };
		System.out.println(p.maxSubArray(A));
	}

	public int maxSubArray(int[] A) {
		int sum = 0;
		int maxSum = 0;
		int flag = 0;
		int tmp = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			if (sum > maxSum)
				maxSum = sum;
			else if (sum < 0)
				sum = 0;
			if (tmp < A[i]) {
				tmp = A[i];
			}
			if (A[i] > 0) {
				flag = 1;
			}
		}
		if (flag == 0)
			return tmp;

		return maxSum;
	}
}
