package SWEA;

import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] word = br.readLine().split(" ");
            
            String answer = word[0].substring(0, 1).toUpperCase() + word[1].substring(0, 1).toUpperCase() + word[2].substring(0, 1).toUpperCase();
            
            System.out.println("#"+test_case+" "+answer);	
		}
	}
}