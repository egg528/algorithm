package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


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
            int Q = sc.nextInt();
            
            int[] answer = new int[N+1];
            
            for(int i = 1; i <= Q; i++){
            	int L = sc.nextInt();
                int R = sc.nextInt();
                
                for(int k = L; k <=R; k++){
                	answer[k] = i; 
                }
            }
            
            System.out.print("#"+test_case);
            for(int i = 1; i < answer.length; i++){
            	System.out.print(" "+answer[i]);
            }
            System.out.println();

		}
	}
}