package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        System.out.println("sorted - " + nums);
        List<List<Integer>> list = new ArrayList<>();
        int prevI = Integer.MAX_VALUE, prevJ=Integer.MAX_VALUE, prevK=Integer.MAX_VALUE;
        boolean isStarted = false;
        for(int i=0; i<size-1; i++) {
            int newSum = -1*nums[i];
            int j = i+1, k = size-1;
            while(j < k) {
                if(nums[j] + nums[k] == newSum) {
                    if(!isStarted) {
                        prevI = nums[i];
                        prevJ = nums[j];
                        prevK = nums[k];
                        isStarted = true;
                    } else if(prevI == nums[i] && prevJ == nums[j] && prevK == nums[k]) {
                    	break;
                    }
                    List<Integer> arr = new ArrayList<>();
                	arr.add(nums[i]);
                	arr.add(nums[j]);
                	arr.add(nums[k]);
                	j++;
                    list.add(arr);
                    prevI = nums[i];
                	prevJ = nums[j];
                	prevK = nums[k];
                } else if(nums[j] + nums[k] > newSum) 
                    k--;
                else
                    j++;
            }
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		TripletSum obj = new TripletSum();
		obj.threeSum(nums);
		System.out.println("list is - " + obj.threeSum(nums));

	}

}
