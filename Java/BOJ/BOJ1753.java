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
			
			for(int i = 0; i < N+1; i++) {
				graph.add(new ArrayList<int[]>());
				distance[i] = 10000001;
			}
			
			for (int i = 0; i < E; i++) {
				int a = sc.nextInt();
				int[] b = {sc.nextInt(), sc.nextInt()};
				graph.get(a).add(b);
			}
			
			PriorityQueue<int[]> queue = new PriorityQueue<int[]>((int[] i1, int[] i2) -> i1[0] >= i2[0] ? 1 : -1);
			distance[start] = 0;
			queue.offer(new int[] {distance[start], start});
			
			while(queue.isEmpty()==false) {
				int[] poll = queue.poll();
				int dist = poll[0];
				int now = poll[1];
				
				for(int[] i : graph.get(poll[1])) {
					int cost = dist + i[1];
					if(cost < distance[i[0]]) {
						distance[i[0]] = cost;
						queue.offer(new int[] {cost, i[0]});
					}
				}
			}
			
			for (int i = 1; i < N+1; i++) {
				if(10000001<=distance[i]) {
					System.out.println("INF");
				}else {
					System.out.println(distance[i]);
				}
			}
	}
}