package DP;

public class Logic {
	
	public static boolean isSolved = false;
	
	public static int solution(int[] a, int[] b, int s) {
		int Bmin = Integer.MAX_VALUE;
		for(int ele : b) {
			Bmin = Bmin > ele ? ele : Bmin;
		}
		int n = a.length;
		int r;
		for(r=(-1)*(Bmin) + 1; r<1000; r++) {
			helper(0, a, b, s, n, r);
			if(isSolved)
				break;
		}
		return r;
	}
	
	public static int helper(int i, int[] a, int[] b, int s, int n, int r) {
		if(s == 0 && n==0) {
			isSolved = true;
			return 1;
		}
		if(n < 1 || s < 0) 
			return -1;	
		if(a[i]%(b[i] + r) != 0)
			return 0;
		int rem = a[i]/(b[i] + r);
		helper(++i, a, b, s-rem, n-1, r);
		
		return 1;
	}

	public static void main(String[] args) {
		int[] a = {10,18,22};
		int[] b = {-4,-3,2};
		int s = 7;
		System.out.println(solution(a, b, s));

	}

}
