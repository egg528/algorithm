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
		
			double p = sc.nextDouble();
            double q = sc.nextDouble();
            
            String answer = ((1-p)*q < p*(1-q)*q) ? "YES":"NO";
            
            System.out.println("#"+test_case+" "+answer);
            

		}
	}
}