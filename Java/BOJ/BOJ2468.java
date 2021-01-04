package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
		
public class Main {
	
	static int[] x = {1, -1, 0, 0};
	static int[] y = {0, 0, 1, -1};
	static int N;
	
	public static void DFS(int[][] arr2, int j, int k, int m) {
		arr2[j][k] = 0;
		
		for(int i  = 0; i < 4; i++) {
			if(0 <= j+y[i] && j+y[i] < N && 0<= k+x[i] && k+x[i] < N && m < arr2[j+y[i]][k+x[i]]) {
				DFS(arr2, j+y[i], k+x[i], m);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][N];
		int[][] arr2 = new int[N][N];
		int max = 0;
		int maxresult = 0;
		int cnt;
		
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		
		for(int i = 0; i < max; i++) {
			
			for(int j = 0; j <N; j++) {
					System.arraycopy(arr[j], 0, arr2[j], 0, arr[0].length);
			}
			cnt = 0;
			for(int j = 0; j <N; j++) {
				for(int k = 0; k < N; k++) {
					if(i < arr2[j][k]) {
						DFS(arr2, j, k, i);
						cnt++;
					}
				}
			}
			if(maxresult < cnt) {
				maxresult = cnt;
			}
		}
		System.out.println(maxresult);
	}
}