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
            int submit = sc.nextInt();
            
            int[] arr = new int[N+1];
            
            for(int i = 0; i < submit; i++){
            	arr[sc.nextInt()] = 1;
            }
            
            System.out.print("#"+test_case);
            for(int i = 1; i <= N; i++){
            	if(arr[i] == 0){
                	System.out.print(" "+i);
                }
            } 
            System.out.println();
		}
	}
}