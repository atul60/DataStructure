package DP;

import java.util.Arrays;

public class EqualSubsetSum {
	
	public static boolean helper(int n, int arr[], int sum, int[][] dp) {
        if(sum == 0) {
        	return true;
        }
		if(n == 0 && sum != 0)
			return false;
        if(dp[n][sum] == -1) {
            return false;
        }
        if (arr[n - 1] > sum)
            return helper(n - 1, arr, sum, dp);
		 dp[n][sum] = helper(n-1, arr, sum-arr[n-1], dp) || helper(n-1, arr, sum, dp) ? 1 : -1;
        if(dp[n][sum] == 1)
		    return true;
		 return false;
	}
	
    static int equalPartition(int N, int arr[])
    {
        // code here
        int total = 0;
        for(int no : arr)
        	total += no;
        int rem = total%2;
        int sum = total/2;
        if(rem != 0)
        	return 0;
        int[][] dp = new int[N+1][sum+1];
        for(int i=0; i<=N; i++) 
        	dp[i][0] = -1;
        Arrays.fill(dp[0], -1);
       return helper(N, arr, sum, dp) ? 1 : 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,5,7,1,4};
		int N = 4;
		System.out.println(equalPartition(N, arr));

	}
}
