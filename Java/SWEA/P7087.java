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
            boolean[] check = new boolean[26];
            
            for(int i = 0; i < num; i++){
            	String str = sc.next();
                char first = str.charAt(0);
                
                check[first-'A'] = true;
            }
            
            int answer = 0;
            int index = 0;
            while(check[index]){
            	answer++;
                index++;
                if(index == 26){
                	break;
                }
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}