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
            String str = sc.next();
            int answer = 1;
		
			for(int i = 2; i  <= 15; i++){
            	if(str.substring(0, i).equals(str.substring(i, i+i))){
                	answer = i;
                    break;
                }
            }
            System.out.println("#"+test_case+" "+answer);

		}
	}
}