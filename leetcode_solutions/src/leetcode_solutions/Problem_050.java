package leetcode_solutions;

public class Problem_050 {
	public double myPow(double x, int n) {
		if (n == 0 || x == 1)
			return 1.0;
		if (x == 0)
			return 0;
		if (n < 0) {
			x = 1 / x;
			n = -n;
		}
		if (n == 1)
			return x;
		double result = myPow(x, n >> 1);
		if ((n & 1) != 0)
			return x * result * result;
		else
			return result * result;
	}
}
