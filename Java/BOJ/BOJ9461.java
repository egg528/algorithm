package BOJ;

import java.util.*;
import java.io.*;

class Main{	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] DP = new long[101];
		
		DP[1] = 1;
		DP[2] = 1;
		DP[3] = 1;
		DP[4] = 2;
		DP[5] = 2;
		DP[6] = 3;
		
		
		for(int i = 7; i <= 100; i++) {
			DP[i] = DP[i-5]+DP[i-1];
		}
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(DP[N]);
		}
	}
}