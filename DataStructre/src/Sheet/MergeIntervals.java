package Sheet;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
	
	public int[][] merge(int[][] intervals) {
		int len = intervals.length;
		if(len == 0)
            return new int[0][0];
		int overlap = 0;
		for(int i=0; i<len-1; i++) {
			if(intervals[i][1] > intervals[i+1][1])
				overlap++;
		}
        int[][] newArr = new int[len - overlap][2];
        int count = 0;
        newArr[0][0] = intervals[0][0];
        int i=0;
		for(; i<len-overlap-1; i++) {
			if(intervals[i][1] < intervals[i+1][1]) {
				newArr[count][1] = intervals[i][1];
				count++;
				newArr[count][0] = intervals[i+1][0];
			}
		}
		newArr[count][1] = intervals[i][1];
        return newArr;
    }

	public static void main(String[] args) {
		MergeIntervals obj = new MergeIntervals();
		int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
		int[][] arr = obj.merge(intervals);
		for(int[] a : arr) {
			System.out.print(a + " ");
		}

	}

}
