package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class MyComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Job j1 = (Job)o1;
		Job j2 = (Job)o2;
		return j2.profit - j1.profit;
	}
	
}


public class JobSequencingProblem {
	
	
	int[] JobScheduling(Job arr[], int n)
    {
		ArrayList<Job> list = new ArrayList<>();
        for (Job t : arr) {
            list.add(t);
        }
//		Collections.sort(list, new MyComp());
		Collections.sort(list, (a,b) -> b.profit - a.profit);
		Job job = list.get(0);
		int dLine = job.deadline;
		int profit = job.profit;
		int maxProfit = job.profit;
		int totalProfit = 0;
		int jobCount = 1;
		int currTime = 1;
		for(int i=0; i<n; i++) {
			if(currTime <= list.get(i).deadline) {
				totalProfit += list.get(i).profit;
				currTime++;
			}
		}
		return new int[]{--currTime, totalProfit};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Job[] arr = new Job[n];
		arr[0] = new Job(1,2,100);
		arr[1] = new Job(2,1,19);
		arr[2] = new Job(3,2,27);
		arr[3] = new Job(4,1,25);
		arr[4] = new Job(5,1,15);
		JobSequencingProblem obj = new JobSequencingProblem();
		int[] a = obj.JobScheduling(arr, n);
		System.out.print(a[0] + " " + a[1]);

	}
	


}
