package DP;

import java.util.Arrays;

public class CoinChange {
	
	public static int dp[][];
	public static int total = 0;
	
	public long count(int S[], int m, int n) {
        // code here.
		dp = new int[m+1][n+1];
		Arrays.fill(dp[0], -1);
		for(int i=0; i<m+1; i++) dp[i][0] = -1;
		helper(S, m, n, 0);
		return total;
    }
	
	public static int helper(int S[], int m, int n, int i) {
		if(n > -1 && dp[i][n] == 1) {
//			total += 1;
			return dp[i][n];
		}
		if(n == 0) {
//			total += 1;
			return 1;
		}
		if(n < 0 || m < 0) 	
			return 0;
		for(; i<m; i++) {
//			total = helper(S, m-1, n-S[i], i) + helper(S, m-1, n, i);
			if(helper(S, m-1, n-S[i], i) == 1) {
				
				total += 1;
				dp[i][n] = 1;
			}
			if(helper(S, m-1, n, i) == 1) {
				dp[i][n] = 1;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int m = 4;
		int[] S = new int[] {2,5,3,6};
		CoinChange obj = new CoinChange();
		System.out.println(obj.count(S, m, n));

	}

}
