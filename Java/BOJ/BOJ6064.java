package BOJ;

import java.io.*;
import java.util.*;

class Main{	
	
	static String answer = "";
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String[] input = br.readLine().split(" ");
			
			int M = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[1]);
			int x = Integer.parseInt(input[2]);
			int y = Integer.parseInt(input[3]);
			
			int limit = lcm(M, N);
			
			// 처음으로 x일 때 오른쪽 값은 start
			int start = (x <= N) ? x: x%N;
			if(start == 0) {
				start = N;
			}
			
			int sum = x;
			
			while(start != y) {
				sum += M;
				start = sum%N;
				if(start == 0) {
					start = N;
				}
				
				if(limit < sum) {
					break;
				}
			}
			
			if(sum <= limit) {
				System.out.println(sum);
			}else {
				System.out.println(-1);
			}
		}
	}
	static int gcd(int a, int b){
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}

	static int lcm(int a, int b){
	    return a * b / gcd(a,b);
	}
}