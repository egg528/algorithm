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
            
            long[] arr = new long[101];
            
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 2;
            arr[5] = 2;
            arr[6] = 3;
            arr[7] = 4;
            arr[8] = 5;
            arr[9] = 7;
            
            for(int i = 10; i <= N; i++){
            	arr[i] = arr[i-1]+arr[i-5];
            }
            
			System.out.println("#"+test_case+" "+arr[N]);


		}
	}
}