package BOJ;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		int cnt;
		
		for (int i = 0; i < N; i++) {
			cnt = 0;
			for (int j = 0; j < N; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt += 1;
				}
			}
			System.out.print((cnt+1) + " ");
		}
	}
}