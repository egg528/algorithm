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
			int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            
            double alice = (double) A/B;
            double bob = (double) C/D;
            

            if(alice < bob){
            	System.out.println("#"+test_case+" "+"BOB");
            }else if(alice == bob){
            	System.out.println("#"+test_case+" "+"DRAW");
            }else{
            	System.out.println("#"+test_case+" "+"ALICE");
            }

		}
	}
}