package exercise;

import java.util.*;
import java.util.Scanner;

class Main {
	public static void heap_djik(int start, int[] dis, ArrayList<ArrayList<int[]>> arr) {
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>((int[] i1, int[] i2) -> i1[0] < i2[0] ? -1 : 1);
		
		dis[start] = 0;
		queue.offer(new int[] {dis[start], start});
		
		while(!queue.isEmpty()) {
			int[] nowArray = queue.poll();
			int dist = nowArray[0];
			int now = nowArray[1];
			
			for(int[] i : arr.get(now)){
				int cost = dis[now] + i[0];
				if(cost < dis[i[1]]) {
					dis[i[1]] = cost;
					queue.offer(new int[] {cost, i[1]}); 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<int[]>> arr = new ArrayList<ArrayList<int[]>>();
		
		Scanner sc = new Scanner(System.in);
		
		int node = sc.nextInt();
		int edge = sc.nextInt();
		
		for(int i = 0; i < node+1; i++) {
			arr.add(new ArrayList<int[]>());
		}
		
		for(int i = 0; i < edge; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int dist = sc.nextInt();
			
			arr.get(a).add(new int[] {dist, b});
		}
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		if(node == 1 || start == end) {
			System.out.println(0);
			return;
		}
		
		
		int[] dis = new int[node+1];
		for(int i = 1; i < dis.length; i++) {
			dis[i] = 999999999; 
		}
		
		heap_djik(start, dis, arr);
		
		System.out.println(dis[end]); 
    }
}