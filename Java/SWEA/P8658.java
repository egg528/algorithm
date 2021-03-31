package SWEA;

import java.util.*;
import java.io.*;



class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T = Integer.parseInt(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] arr = br.readLine().split(" ");
            int[] sum = new int[10];
            
            // 주여진 10개의 자연수 각 자리수 합으로 변경 arr -> sum
            for(int i = 0; i < 10; i++){
            	String str = arr[i];
                int temp = 0;
                for(int k = 0; k < str.length(); k++){
                	temp += Integer.parseInt(str.substring(k, k+1));
                }
                sum[i] = temp;
            }
            
            Arrays.sort(sum);
            
            System.out.println("#"+test_case+" "+sum[9]+" "+sum[0]);
			

		}
	}
}