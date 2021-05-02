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
			String audience = sc.next();
            
            int needAud = 0;
            int nowAud = Integer.valueOf(audience.substring(0, 1));
            
            for(int i = 1; i < audience.length(); i++){
            	int need = Integer.valueOf(audience.substring(i, i+1));
                
                if(nowAud < i){
                	needAud += i-nowAud;
                    nowAud += i-nowAud;
                }
                nowAud += need;
            }
            
            System.out.println("#"+test_case+" "+needAud);

		}
	}
}