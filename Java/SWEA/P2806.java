package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
    
    static int answer;
    static int[] board;
    
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            answer = 0;
			int N = sc.nextInt();
            board = new int[N];
            answer = 0;
            dfs(0, N);
            System.out.println("#"+test_case+" "+answer);
		}
	}
    
    public static void dfs(int now, int N){
        if(now == N){
        	answer++;
            return;
        }
        
        for(int i = 0; i < N; i++){
        	boolean possible = true;
            
            for(int k = 0; k < now; k++){
            		if(board[k] == i || Math.abs(k-now) == Math.abs(board[k]-i)){
                    	possible = false;
                        break;
                    }
            }
            if(possible){
                board[now] =i; 
            	dfs(now+1, N);
                
            }
            
            }
        }
    }