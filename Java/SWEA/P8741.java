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
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] word = br.readLine().split(" ");
            
            String answer = word[0].substring(0, 1).toUpperCase() + word[1].substring(0, 1).toUpperCase() + word[2].substring(0, 1).toUpperCase();
            
            System.out.println("#"+test_case+" "+answer);	
		}
	}
}