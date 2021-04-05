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
            int M = sc.nextInt();
            
            int[] arr = new int[N+M+1];
            
            
			for(int n = 1; n <= N; n++){
            	for(int m = 1; m <= M; m++){
                	arr[n+m]++;
                }
            }
            int max = 0;
            
            for(int i = 2; i <= N+M; i++){
           		if(max < arr[i]){
                	max = arr[i];
                }
            }
            System.out.print("#"+test_case);
            for(int i = 2; i <= N+M; i++){
           		if(arr[i] == max){
                    System.out.print(" "+i);
                }
            }
            System.out.println();
		}
	}
}