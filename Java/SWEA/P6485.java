package SWEA;

import java.util.Scanner;

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
            int[] check = new int[5001];
            
            int start = 0;
            int end = 0;
            for(int i = 0; i < N; i++){
            	start = sc.nextInt();
                end = sc.nextInt();
                for(int k = start; k <= end; k++){
                	check[k]++;
                }
            }
            
            int P = sc.nextInt();
            System.out.print("#"+test_case);
            for(int i = 0; i < P; i++){
            	System.out.print(" "+check[sc.nextInt()]);
            }
            System.out.println();
            
		}
	}
}