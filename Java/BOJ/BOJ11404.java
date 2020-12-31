package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int E = sc.nextInt();
			int[][] arr = new int[N+1][N+1];
			
			for(int i = 1; i < N+1; i++) {
				for (int j = 1; j < N+1; j++) {
					arr[i][j] = 10000001;
					if(i==j) {
						arr[i][j] = 0;
					}
				}
			}
			for(int i = 0; i < E; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				if(c < arr[a][b] )
					arr[a][b] = c;
				
			}
			for(int k = 1; k < N+1; k++) {
				for(int a = 1; a < N+1; a++) {
					for(int b = 1; b < N+1; b++) {
						arr[a][b] = Math.min(arr[a][b], arr[a][k] + arr[k][b]);
					}
				}
			}
			for(int i = 1; i < N+1; i++) {
				for(int j = 1; j < N+1; j++) {
					if (10000001<=arr[i][j] ) {
						System.out.print(0 + " ");
					}else {
						System.out.print(arr[i][j] + " ");
					}
				}
				System.out.println();
			}
			
			
		
	}
}