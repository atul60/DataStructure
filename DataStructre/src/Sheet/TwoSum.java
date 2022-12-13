package Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		int len = nums.length;
		for(int i=0; i<len; i++) {
			if(map.get(nums[i]) == null) {
				map.put(nums[i], new ArrayList<Integer>(i));
			}
			map.get(nums[i]).add(i);
		}
		Arrays.sort(nums);
		for(int i=0, j=len-1; i != j; ) {
			if(nums[i] + nums[j] == target) {
				int result[] = new int[2];
				result[0] = map.get(nums[i]).get(0);
				map.get(nums[i]).remove(0);
				result[1] = map.get(nums[j]).get(0);
				return result;
			}
			else if(nums[i] + nums[j] > target)
				j--;
			else
				i++;
		}
		return new int[] {};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 3};
		int target = 6;
		int result[] = twoSum(nums, target);
		System.out.print(result[0] + " " + result[1]);
	}

}
