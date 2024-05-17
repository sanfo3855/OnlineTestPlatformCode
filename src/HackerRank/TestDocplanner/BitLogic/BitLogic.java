package HackerRank.TestDocplanner.BitLogic;

public class BitLogic {
	/*
	 * Complete the 'maxXor' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. INTEGER lo
	 *  2. INTEGER hi
	 *  3. INTEGER k
	 */

	//For two positive integers, low and high, and a limi k, find two integers, a and b satisfying the following criteria:
	// - low <= a <= b <= high
	// - a XOR b is maximal and less than or equal to k
	public static int maxXor(int low, int high, int k) {
		// Write your code here
		int max = 0;
		for (int a = low; a <= high; a++) {
			for (int b = a; b <= high; b++) {
				int xor = a ^ b;
				if (xor > max && xor <= k) {
					max = xor;
				}
			}
		}
		return max;
	}
}
