package DP;

public class MinOprt {
	
	public static int minNum(int N) {
		helper(N, 0);
		return 0;
	}
	
	public static int helper(int n, int count) {
		if(n == 0)
			return count;
		if(isMultiple(n)) {
			return count + 1;
		}
		
		return 0;
	}
	
	public static boolean isMultiple(int p) {
		if(p%12 == 0)
			return false;
		if(p%2 == 0 || p%3 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		System.out.print(minNum(n));

	}

}
