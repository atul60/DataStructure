package DP;

import java.util.ArrayList;

public class StockBuySell {
	
	ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list.add(new ArrayList<Integer>());
		list.get(0).add(0);
		int currPair = 0;
		int instant = 1;
		for(int i=1; i<A.length; i++) {
			if(instant == 1 && A[i-1] >= A[i]) {
				list.get(currPair).set(0, i);
			}
			else if(A[i-1] > A[i]) {
				instant = 0;
				list.get(currPair).add(i-1);
				currPair++;
				list.add(new ArrayList<Integer>());
				list.get(currPair).add(i);
			}
			else {
				instant = 0;
			}
		}
		if(list.get(currPair).size() == 1 && A[list.get(currPair).get(0)] != A[n-1]) {
			list.get(currPair).add(n-1);
		} else {
			list.remove(currPair);
		}
		return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a[] = {4,2,2,2,5};
		StockBuySell obj = new StockBuySell();
		ArrayList<ArrayList<Integer> > list = obj.stockBuySell(a, n);
		list.forEach((li) -> {
			System.out.println(li);
		});
	}

}
