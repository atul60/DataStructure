package DP;

import java.util.Arrays;

public class Knapsack {
	
	 public static int knapSack(int W, int wt[], int val[], int n) {
		int[][] dp = new int[n+1][W+1];
		for(int i=0; i<n+1; i++) dp[i][0] = 0;
		Arrays.fill(dp[0], 0);
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				if(j-wt[i-1] >= 0)
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wt[i-1]] + val[i-1]); 
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		int max = 0;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				if(max < dp[i][j])
					max = dp[i][j];
			}
		}
		
		
		return max;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w[] = new int[] {30,10,40,20};
		int v[] = new int[] {10,20,30,40};
		int c = 40;
		System.out.print(knapSack(c, w, v, v.length));
		

	}

}
