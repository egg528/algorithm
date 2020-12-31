package BOJ;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int INF = 1000000;
	public static void dijkstra_heap(int start, int[] distance, ArrayList<ArrayList<int[]>> arr) {
		PriorityQueue<int[]> Pqueue = new PriorityQueue<int[]>((int[] i1, int[] i2) -> i1[0] >= i2[0] ? 1 : -1);
		Pqueue.offer(new int[] {0, start});
		distance[start] = 0;
		
		while(Pqueue.isEmpty() == false) {
			int[] poll = Pqueue.poll();
			int dist = poll[0];
			int now = poll[1];
			
			for(int[] i : arr.get(now)) {
				int cost = dist + i[1];
				if (cost < distance[i[0]]) {
					distance[i[0]] = cost;
					Pqueue.offer(new int[] {cost, i[0]});
				}
			}
		}
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int E = sc.nextInt();
			int start = sc.nextInt();
			
			int[] distance = new int[N+1];
			for (int i = 1; i < N+1; i++) {
				distance[i] = INF;
			}
			
			
			ArrayList<ArrayList<int[]>> arr = new ArrayList<ArrayList<int[]>>();
			
			for(int i = 0; i < N+1; i++) {
				arr.add(new ArrayList<int[]>());
			}
			
			for (int i = 0; i < E; i++) {
				int a = sc.nextInt();
				int[] b = {sc.nextInt(), sc.nextInt()};
				arr.get(a).add(b);
			}
			
			dijkstra_heap(start, distance, arr);
			
			for (int i = 1; i < N+1; i++) {
				System.out.println(distance[i]);
			}
	}
}