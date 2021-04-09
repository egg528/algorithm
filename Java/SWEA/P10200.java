package SWEA;

import java.util.Scanner;
import java.io.*;


class Main
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T;
		T=Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] arr = br.readLine().split(" ");
            
			System.out.println(arr[2]);
			int N = Integer.valueOf(arr[0]);
            int A = Integer.valueOf(arr[1]);
            int B = Integer.valueOf(arr[2]);
			
            int max = (A < B) ? A : B;
            int min = (N < A+B) ? (A+B) - N : 0;
            
            bw.write("#"+test_case+" "+max+" "+min+"\n");
            
		}
		bw.flush();
		bw.close();
		br.close();
	}
}