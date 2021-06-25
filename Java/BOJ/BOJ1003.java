package BOJ;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] DP = new int[41][2];
		DP[0][0] = 1;
		DP[0][1] = 0;
		
		DP[1][0] = 0;
		DP[1][1] = 1;
		
		DP[2][0] = 1;
		DP[2][1] = 1;
		
		DP[3][0] = 1;
		DP[3][1] = 2;
		
		for(int i = 4; i <= 40; i++) {
			DP[i][0] = DP[i-1][0]+DP[i-2][0];
			DP[i][1] = DP[i-1][1]+DP[i-2][1];
		}
		
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(DP[n][0] + " " + DP[n][1]);
		}

	}
}