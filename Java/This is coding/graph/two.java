package BOJ;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
		
public class Main {
	
	public static int find_parent(int[] parent, int x) {
		if(parent[x] != x) {
			parent[x] = find_parent(parent, parent[x]);
		}
		return parent[x];
	}
	
	public static void union(int[] parent, int a, int b) {
		a = find_parent(parent, a);
		b = find_parent(parent, b);
		
		if(a < b) {
			parent[b] = a;
		}else {
			parent[a] = b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] student = new int[N+1];
		for(int i = 1; i < N+1; i++) {
			student[i] = i;
		}
		
		PriorityQueue<int[]> graph = new PriorityQueue<int[]>((int[] i1, int[] i2) -> i1[2] >= i2[2] ? 1 : -1);
		
		for(int i = 0; i < M; i++) {
			int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			graph.offer(a);
		}
		

		
		
		int cost = 0;
		ArrayList<Integer> result  = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			int[] a = graph.poll();
			if (find_parent(student, a[0]) != find_parent(student, a[1])) {
				union(student, a[0], a[1]);
				result.add(a[2]);
			}
		}
		
		for(int i = 0; i < result.size()-1; i++) {
			cost += result.get(i);
		}
		System.out.println(cost);
		
		
	}
}