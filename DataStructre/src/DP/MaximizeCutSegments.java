package DP;

import java.util.Arrays;

public class MaximizeCutSegments {
	
	public int maximizeCuts(int n, int x, int y, int z)
    {
		int[] arr = {x, y, z};
		Arrays.sort(arr);
		int min = arr[0];
		int mid = arr[1];
		int max = arr[2];
		boolean isMid = false;
		System.out.println("N - " + min + " " + mid + " " + max);
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		return maximumCount(n, min, mid, max, 0, dp);
    }
	
	public static int maximumCount(int n, int min, int mid, int max, int count, int[] dp) {
		if(n == 0)
			return count;
		if(n < min) 
			return 0;
		if(dp[n] != -1)
			return dp[n];
		int result;
		result = maximumCount(n-min, min, mid, max, count+1, dp);
		if(result == 0) {
			result = maximumCount(n-mid, min, mid, max, count+1, dp);
			if(result == 0) {
				result = maximumCount(n-max, min, mid, max, count+1, dp);
			}
		}
		dp[n] = result;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 53;
		int x=10, y=11, z=23;
		MaximizeCutSegments obj = new MaximizeCutSegments();
		System.out.print(obj.maximizeCuts(N, x, y, z));

	}

}
