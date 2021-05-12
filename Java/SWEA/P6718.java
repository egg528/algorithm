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
            
            if(N < 100){
            	System.out.println("#"+test_case+" "+0);
            }else if(N < 1000){
            	System.out.println("#"+test_case+" "+1);
            }else if(N < 10000){
            	System.out.println("#"+test_case+" "+2);
            }else if(N < 100000){
            	System.out.println("#"+test_case+" "+3);
            }else if(N < 1000000){
            	System.out.println("#"+test_case+" "+4);
            }else{
            	System.out.println("#"+test_case+" "+5);
            }
        }
	}
}