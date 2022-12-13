package DP;

import java.util.Arrays;

public class SubsetSum {
	
	static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
		int[][] dp = new int[N+1][sum+1];
		for(int i=0; i<N+1; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		if(helper(N-1, arr, sum, dp) == 1)
			return true;
		return false;
    }
	
	static int helper(int n, int arr[], int sum, int[][] dp) {
		if(n < 0 || sum < 0) {
			return 0;
		}
		if(sum == 0) {
			return 1;
		}
		if(dp[n][sum] != -1) {
			return dp[n][sum];
		}
		if(arr[n] > sum) {
			helper(n-1, arr, sum, dp);
		}
		else if(helper(n-1, arr, sum-arr[n], dp) == 1 || helper(n-1, arr, sum, dp) == 1) {
			return dp[n][sum] = 1;
		} 
		return dp[n][sum] = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int arr[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
		int sum = 1;
		System.out.println(isSubsetSum(n, arr, sum));
	}

}
