package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int E = sc.nextInt();
			
			int[][] graph = new int[N+1][N+1];
			
			for(int i = 1; i < N+1; i++) {
				for(int j = 1; j < N+1; j++) {
					graph[i][j] = 1000001;
					if(i == j) {
						graph[i][j] = 0;
					}
				}
			}
			
			
			for(int i = 0; i < E; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			
			int X = sc.nextInt();
			int K = sc.nextInt();
			
			
			
			for(int k = 1; k < N+1; k++) {
				for(int a = 1; a < N+1; a++) {
					for(int b = 1; b < N+1; b++) {
						graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
					}
				}
			}
			if (1000000 < graph[1][K] + graph[K][X]) {
				System.out.println(-1);
			}else {
				System.out.println(graph[1][K] + graph[K][X]);
			}
					}
}