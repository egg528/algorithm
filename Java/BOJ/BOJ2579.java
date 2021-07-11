package BOJ;

import java.util.*;
import java.io.*;

class Main{
	static int max = 0;
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		if(N == 1) {
			System.out.print(arr[0]);
		}else if(N == 2) {
			System.out.print(arr[0]+arr[1]);
		}else if(N == 3) {
			System.out.print(Math.max(arr[0]+arr[2], arr[1]+arr[2]));
		}else {
			int[] DP = new int[N];
			DP[0] = arr[0];
			DP[1] = arr[0]+arr[1];
			DP[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
			
			for(int i = 3; i < N; i++) {
				DP[i] = Math.max(DP[i-2]+arr[i], DP[i-3]+arr[i-1]+arr[i]);
			}
			
			System.out.println(DP[N-1]);
		}
	}
