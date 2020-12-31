package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int INF = 1000000;
	
	public static int get_smallest_node(int n, int[] distance, boolean[] visited) {
		int min_value = INF;
		int index = 0;
		for(int i = 1; i < n+1; i++) {
			if (distance[i] < min_value && visited[i] == false) {
				min_value = distance[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void dijkstra(int start, int n, int[] distance, ArrayList<ArrayList<int[]>> graph, boolean[] visited) {
		distance[start] = 0;
		visited[start] = true;
		
		//시작 노드에서 한 번에 갈 수 있는 노드들 distance에 반영
		for (int[] i : graph.get(start)) {
			distance[i[0]] = i[1];
		}
		
		//
		for (int i = 0; i < n-1; i++) {
			int now = get_smallest_node(n, distance, visited);
			visited[now] = true;
			
			for (int[] j : graph.get(now)) {
				int cost = distance[now] + j[1];
						if (cost < distance[j[0]]) {
							distance[j[0]] = cost;
						}
			}
		}		
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int E = sc.nextInt();
			int start = sc.nextInt();
			
			boolean[] visited = new boolean[N+1];
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
			
			dijkstra(start, N, distance, arr, visited);
			
			for (int i = 1; i < N+1; i++) {
				System.out.println(distance[i]);
			}
	}
}