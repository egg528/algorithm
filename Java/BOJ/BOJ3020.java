package BOJ;

import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String[] NH = br.readLine().split(" ");
		
		int N = Integer.parseInt(NH[0]);
		int H = Integer.parseInt(NH[1]);
		
		
		int[] bottom = new int[H+1];
		int[] top = new int[H+1];
		
		
		for(int i = 0; i < N/2; i++) {
			bottom[Integer.parseInt(br.readLine())]++;
			top[Integer.parseInt(br.readLine())]++;
		}
		
		int[] bottom_sum = new int[H+1];
		int[] top_sum = new int[H+1];
		
		for(int i = 1; i <= H; i++) {
			
			bottom_sum[i] = bottom_sum[i-1]+bottom[H-i+1];
			
			
			top_sum[H-i] = top_sum[H-i+1] + top[H-i];
			
		}
		
		int min = Integer.MAX_VALUE;
		int minCnt = 0;
		
		for(int i = 1; i <= H; i++) {
			int crash = 0;
			
			crash += top_sum[i];
			crash += bottom_sum[i];
			
			
			if(crash == min) {
				minCnt++;
			}
			
			if(crash < min) {
				minCnt = 1;
				min = crash;
			}
			
		}
		
		System.out.println(min+" "+minCnt);
		}
}