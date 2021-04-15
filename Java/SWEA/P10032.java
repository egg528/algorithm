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
            int K = sc.nextInt();
            int answer = (N%K == 0) ? 0 : 1;
            
            System.out.println("#"+test_case+" "+answer);
		
		}
	}
}