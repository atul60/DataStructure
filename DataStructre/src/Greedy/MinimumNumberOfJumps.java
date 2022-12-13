package Greedy;

public class MinimumNumberOfJumps {
	public static int count  = 0;
	static int minJumps(int[] arr){
        // your code here
		return helper(arr, arr.length, 0);
    }
	
	public static int helper(int[] arr, int len, int curr) {
		if(curr == len - 1) {
			return 1;
		}
		if(curr > len) {
			return -1;
		}
		if(arr[curr] == 0) {
			if(arr[curr]-1 > curr) 
				helper(arr, len, arr[curr] + curr - 1);
		}
		count++;
		helper(arr, len, arr[curr] + curr);
		return count;
	}

	public static void main(String[] args) {
		int n = 11; 
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));
	}

}
