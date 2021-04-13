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
		
            int num = sc.nextInt();
            
			double answer = 0;
            
            for(int i  = 0; i < num; i++){
            	double a = sc.nextDouble();
                double b = sc.nextDouble();
                answer += a*b;
            }
            
            System.out.println("#"+test_case+" "+answer);

		}
	}
}