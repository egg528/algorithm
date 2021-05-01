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
			int A = sc.nextInt();
            int B = sc.nextInt();
            
            int cnt = A/B;
            
            long answer = 0;
            for(int i = 1; i <= cnt; i++){
            	answer += 2*(i-1) + 1;
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}