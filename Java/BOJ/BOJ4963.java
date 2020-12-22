package BOJ;

import java.util.Scanner;

public class Main {
	static int count = 0;
	
	public static void BFS(int[][] arr, int i, int j) {
		if (0 <= i && 0 <= j && i < arr.length && j < arr[0].length && arr[i][j] == 1) {
			arr[i][j] = 0;
			BFS(arr, i-1, j-1);
			BFS(arr, i-1, j);
			BFS(arr, i-1, j+1);
			BFS(arr, i+1, j+1);
			BFS(arr, i+1, j);
			BFS(arr, i+1, j-1);
			BFS(arr, i, j+1);
			BFS(arr, i, j-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		while (w != 0 && h != 0) {
			count = 0;
			
			
			int[][] arr = new int[h][w];
			
			for (int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] == 1) {
						BFS(arr, i, j);
						count+=1;	
					}
				}
			}
			
			System.out.println(count);
			
			w = sc.nextInt();
			h = sc.nextInt();
		}
		
	
	}
}