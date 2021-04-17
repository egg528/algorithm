package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
    static int answer;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] NM = br.readLine().split(" ");
            int N = Integer.valueOf(NM[0]);
            int M = Integer.valueOf(NM[1]);
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] arr = new int[N];
            
            for(int i = 0; i < N; i++){
            	arr[i] = Integer.valueOf(st.nextToken());
            }
            
            answer = -1;
            
            dfs(arr, 0, 0, 0, M);
            
            System.out.println("#"+test_case+" "+answer);
			

		}
    }
        
        public static void dfs(int[] arr, int cnt, int now, int sum, int M){
        	
            if(cnt == 2){
            	if(answer < sum && sum <= M){
                	answer = sum;
                }
                return;
            }
            if(M < sum || now == arr.length){
            	return;
            }
            
            
            dfs(arr, cnt+1, now+1, sum+arr[now], M);
            dfs(arr, cnt, now+1, sum, M);
            
            return;
	}
}