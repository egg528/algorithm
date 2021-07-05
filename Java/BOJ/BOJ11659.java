package BOJ;

import java.util.*;
import java.io.*;

class Main{	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		String[] arr = br.readLine().split(" ");
		int[] sum = new int[N+1];
		for(int i = 1; i <= N; i++) {
			sum[i] = sum[i-1]+Integer.parseInt(arr[i-1]);
		}
		
		while(M-- > 0) {
			String[] order = br.readLine().split(" ");
			System.out.println(sum[Integer.parseInt(order[1])] - sum[Integer.parseInt(order[0])-1] );
		}
	}
}