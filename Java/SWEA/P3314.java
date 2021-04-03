package SWEA;

import java.util.Scanner;

}class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int sum = 0;
            
            for(int i = 0; i < 5; i++){
            	int score = sc.nextInt();
                if(score <= 40){
                	sum+=40;
                 }else{
                	sum+=score;
                }
            }
            
            System.out.println("#"+test_case+" "+sum/5);
		}
	}
}