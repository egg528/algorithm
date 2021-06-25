package BOJ;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[ ] DP = new int[N+1];
		DP[0] = 1;
		DP[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			DP[i] = (DP[i-1] + DP[i-2])%10007;
		}
		
		System.out.println(DP[N]);
	}
}
