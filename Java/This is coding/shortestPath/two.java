package BOJ;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int E = sc.nextInt();
			int start = sc.nextInt();
			
			int[] distance = new int[N+1];
			
			ArrayList<ArrayList<int[]>> graph = new ArrayList<ArrayList<int[]>>();
			
			for (int i = 0; i < N+1; i++) {
				graph.add(new ArrayList<int[]>());
				distance[i] = 10000001;
			}
			
			for (int i = 0; i < E; i++) {
				int a = sc.nextInt();
				int[] b = {sc.nextInt(), sc.nextInt()};
				graph.get(a).add(b);
			}
			
			
			PriorityQueue<int[]> Pqueue = new PriorityQueue<int[]>((int[] i1, int[] i2) -> i1[0] >= i2[0] ? 1 : -1);
			
			distance[start] = 0;
			Pqueue.offer(new int[] {distance[start], start});
			
			while (Pqueue.isEmpty() == false) {
				int[] poll = Pqueue.poll();
				int dist = poll[0];
				int now = poll[1];
				
				for (int[] i: graph.get(now)) {
					int cost = dist + i[1];
					if (cost < distance[i[0]]) {
						distance[i[0]] = cost;
						Pqueue.offer(new int[] {cost, i[0]});
					}
				}
			}
			
			int max = 0;
			int city = 0;
			for(int i = 1; i < N+1; i++) {
				if(distance[i] < 10000001) {
					city+=1;
					if(max < distance[i]) {
						max = distance[i];
					}
				}
			}
			System.out.println(city-1 + " " + max);
			
	}
}