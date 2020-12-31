package BOJ;

import java.util.Scanner;

public class Main {
	public static int find_parent(int[] parent, int x) {
		if(parent[x] != x) {
			return find_parent(parent, parent[x]);
		}
		return x;
	}
	
	public static int improved_find_parent(int[] parent, int x) {
		if(parent[x] != x) {
		 parent[x] = improved_find_parent(parent, parent[x]);
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
		
		for(int i=0; i < E; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			union_parent(parent, a, b);
		}
		
		for(int i = 1; i < N+1; i++) {
			System.out.print(find_parent(parent, i) + " ");
		}
		
		for(int i = 1; i < N+1; i++) {
			System.out.print(parent[i] + " ");
		}
	}
}