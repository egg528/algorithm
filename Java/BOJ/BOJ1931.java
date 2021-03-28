package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
	public static class Conference{
		public int startTime;
		public int endTime;
		
		public Conference(int start, int end) {
			this.startTime = start;
			this.endTime = end;
		}
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		ArrayList<Conference> arr = new ArrayList<Conference>();
		
		for(int i = 0; i < num; i++) {
			String[] time = br.readLine().split(" ");
			arr.add(new Conference(Integer.valueOf(time[0]), Integer.valueOf(time[1])));
		}
		
		Collections.sort(arr, new Comparator<Conference>() {
			
			
			@Override
			public int compare(Conference Con1, Conference Con2) {
				if(Con1.endTime == Con2.endTime) {
					return (Con1.endTime - Con1.startTime > Con2.endTime - Con2.startTime)? -1 : ((Con1.endTime - Con1.startTime == Con2.endTime - Con2.startTime)? 0 : 1);
				}
				return (Con1.endTime < Con2.endTime)? -1 : ((Con1.endTime == Con2.endTime)? 0 : 1);
			}
		});
		
		int time = -1;
		int answer = 0;
		for(int i = 0; i < arr.size(); i++){
			Conference con = arr.get(i);
			if(time <= con.startTime) {
				time = con.endTime;
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}