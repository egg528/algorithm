package SWEA;

import java.util.*;
import java.io.*;

class Solution
{
    static int answer;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String[] NK = br.readLine().split(" ");
            int N = Integer.valueOf(NK[0]);
            int K = Integer.valueOf(NK[1]);
            
            String[] arr = br.readLine().split(" ");
            
            answer = 0;
            
            for(int i = 1; i  <= N; i++){
            	bfs(arr, i, K, 0, 0, 0);
            }
            
            System.out.println("#"+test_case+" "+answer);
         	
		}
	}
    // cnt는 선택할 개수, K는 목표 합, now는 지금 배열 위치, nowCnt는 선택한 개수, sum은 지금까지 합
   	public static void bfs(String[] arr, int cnt, int K, int now, int nowCnt, int sum){
    	if(nowCnt == cnt){
        	if(K == sum){
            	answer++;
                return;
            }
            return;
        }
        
        if(K < sum){
        	return;
        }
        
        if(arr.length == now){
        	return;
        }
        
        bfs(arr, cnt, K, now+1, nowCnt, sum);
        bfs(arr, cnt, K,now+1, nowCnt+1, sum+Integer.valueOf(arr[now]));
        
        return;
    }
    
}