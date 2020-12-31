package BOJ;

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
		boolean cycle = false;
		
		int[] parent = new int[N+1];
		for (int i=1; i < N+1; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i < E; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (find_parent(parent, a) == find_parent(parent, b)) {
				cycle = true;
				System.out.println(cycle);
				return;
			}else {
				union_parent(parent, a, b);
			}
		}
	}
}