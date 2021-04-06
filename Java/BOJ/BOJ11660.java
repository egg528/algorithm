package BOJ;

import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String[] NM = br.readLine().split(" ");
		
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int[][] arr = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			String[] temp = br.readLine().split(" ");
			for(int k = 1; k <=temp.length; k++) {
				arr[i][k] = arr[i][k-1] + Integer.parseInt(temp[k-1]);
				
			}
		}
		
		for(int i = 0; i < M; i++) {
			String[] order = br.readLine().split(" ");
			int x1 = Integer.parseInt(order[0]);
			int y1 = Integer.parseInt(order[1]);
			int x2 = Integer.parseInt(order[2]);
			int y2 = Integer.parseInt(order[3]);
			
			int answer = 0;

			for(int k = x1; k <= x2; k++) {
				answer += arr[k][y2] - arr[k][y1-1];

			}	
			bw.write(answer +"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}