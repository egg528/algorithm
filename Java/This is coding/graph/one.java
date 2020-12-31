package BOJ;

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
		
		for(int i = 0; i < N+1; i++) {
			student[i] = i;
		}
		
		for(int i = 0; i <M; i++) {
			int a = sc.nextInt();
			
			if(a == 0) {
				union(student, sc.nextInt(), sc.nextInt());
			}else {
				int b = find_parent(student, sc.nextInt());
				int c = find_parent(student, sc.nextInt());
				if(b == c) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
				
	}
}