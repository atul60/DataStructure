package DP;

import java.util.Arrays;

public class JumpGameII {
	
	public static int minJumps = Integer.MAX_VALUE;
    public int jump(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        Arrays.fill(dp, -1);
        return helper(nums, 0, nums.length-1, 0, dp);
    }
    public static int helper(int[] nums, int pos, int lastIdx, int jumps, int[] dp) {
        if(dp[pos] != -1) 
            return -1;
        if(pos >= lastIdx) {
            if(minJumps > jumps){
                minJumps = jumps;
            }
        } 
        else {
            for(int i=nums[pos]+pos; i>pos; i--) {
                helper(nums, i, lastIdx, jumps+1, dp);
                dp[pos] = minJumps;
            } 
        }
        return minJumps;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGameII obj = new JumpGameII();
		int[] arr = new int[] {1,2};
		System.out.println(obj.jump(arr));

	}

}
