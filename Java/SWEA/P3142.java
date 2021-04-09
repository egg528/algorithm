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
		
			int horn = sc.nextInt();
            int animal = sc.nextInt();
            
            int twin = 0;
            int uni = animal;
            
            while(animal != horn){
            	animal++;
                twin++;
                uni--;
            }
            
            System.out.println("#"+test_case+" "+uni+" "+twin);

		}
	}
}