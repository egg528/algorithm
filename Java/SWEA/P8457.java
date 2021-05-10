package SWEA;

import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int B = sc.nextInt();
            int E = sc.nextInt();
            
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
            	arr[i] = sc.nextInt();
            }
            
            int answer = 0;
            
            for(int i = 0; i < N; i++){
            	int time = arr[i];
                
                // ¿ÀÂ÷
                int min = B;
                int times = 1;
                
                while(Math.abs(B - (times*time)) < min){
                	min = Math.abs(B - (times*time));
                    times++;
                }
                
                if(min <= E){
                	answer++;
                }
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
}