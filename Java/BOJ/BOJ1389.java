package BOJ;

import java.io.*;
import java.util.*;

class Main{	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		int INF = 999;
		int[][] connection = new int[N][N];
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				connection[i][j] = INF;
				if(i == j) {
					connection[i][j] = 0;
				}
			}
		}
		
		
		while(M-- > 0) {
			String[] temp = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			
			connection[a-1][b-1] = 1;
			connection[b-1][a-1] = 1;		
		}
		
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(connection[j][i] + connection[i][k] < connection[j][k]) {
						connection[j][k] = connection[j][i] + connection[i][k];
					}
				}
			}
		}
		
		
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0; i < N; i++) {
			int sum = 0;
			for(int j = 0; j < N; j++) {
				sum+=connection[i][j];
			}
			if(sum < min) {
				min = sum;
				index = i;
			}
		}
		System.out.println(index+1);
		
	}
}s