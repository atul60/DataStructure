package Sheet;

public class SubarraySumEqualsK {
	
	public int subarraySum(int[] nums, int k) {
		int count = 0;
        int size = nums.length;
        int sum = 0;
        int startIdx = 0;
        int i=0;
        while(i <= size) {
            if(i == size) {
                if(startIdx == size)
                    break;
                sum -= nums[startIdx++];
                if(sum == k) {
                    count++;
                }
            }
        	else if(sum + nums[i] == k) {
        		sum -= nums[startIdx++];
        		count++;
        	} else if(sum + nums[i] > k) {
        		if(startIdx == i)
        			i++;
        		else
        			sum -= nums[startIdx++];
        	} else {
        		sum += nums[i++];
        	}
        }
        return count;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-1,1};
		int k = 0;
		SubarraySumEqualsK obj = new SubarraySumEqualsK();
		System.out.println(obj.subarraySum(nums, k));

	}

}
