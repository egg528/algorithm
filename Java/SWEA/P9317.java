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
			int N = sc.nextInt();
            
            String wright = sc.next();
            String cheon = sc.next();
            
            for(int i = 0; i < wright.length(); i++){
            	if(wright.charAt(i) != cheon.charAt(i)){
                	N--;
                }
            }         
            System.out.println("#"+test_case+" " + N);
		}
	}
}