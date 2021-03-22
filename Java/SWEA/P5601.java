package SWEA;

import java.util.Scanner;



class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
            int num = sc.nextInt();
            
            System.out.print("#"+test_case+" ");
            for(int i = 0; i < num; i++){
            	System.out.print(1+"/"+num+" ");
            }
			
            System.out.println();

		}
	}
}