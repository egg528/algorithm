package BOJ;

import java.util.*;
import java.io.*;

class Main{	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] DP = new int[N+1];
		DP[1] = 1;
		DP[2] = 3;
		
		for(int i = 3; i <= N; i++) {
			DP[i] = (DP[i-1]+(2*DP[i-2]))%10007;
		}
		System.out.println(DP[N]);
	}
}