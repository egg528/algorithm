package BOJ;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int find_parent(int[] parent, int x) {
		if(parent[x] != x) {
		 parent[x] = find_parent(parent, parent[x]);
		}
		return parent[x];
	}
	
	public static void union_parent(int[] parent, int a, int b) {
		a = find_parent(parent, a);
		b = find_parent(parent, b);
		
		if (a < b) {
			parent[b] = a;
		}else {
			parent[a] = b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int E = sc.nextInt();
		
		int[] parent = new int[N+1];
		for (int i=1; i < N+1; i++) {
			parent[i] = i;
		}
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>((int[] i1, int[] i2) -> i1[2] >= i2[2] ? 1 : -1);
		
		
		for(int i=0; i < E; i++) {
			int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			queue.offer(arr);
		}

		int cost = 0;
		for (int j = 0; j < E; j++) {
			int[] i = queue.poll();
			if(find_parent(parent, i[0]) != find_parent(parent, i[1])) {
				union_parent(parent, i[0], i[1]);
				cost+=i[2];
			}
		}
		System.out.println(cost);
		
	}
}