package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//За
		int N = sc.nextInt();
		//ї­
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int min;
		int max = 0;
		for (int i = 0; i < N; i++) {
			min = 10001;
			for (int j = 0; j < M; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
			if (max < min) {
				max = min;
			}
		}
		
		System.out.println(max);
	}
}