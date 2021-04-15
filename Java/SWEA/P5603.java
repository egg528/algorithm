package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T= Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
            
            int num = Integer.valueOf(br.readLine());
            
            int sum = 0;
            for(int i = 0; i < num; i++){
            	int temp = Integer.valueOf(br.readLine());
                arr.add(temp);
                sum += temp;
            }
            
            int average = sum/arr.size();
            
            int answer = 0;
            for(int i = 0; i < arr.size(); i++){
            	int temp = arr.get(i);
                if(average < temp){
                	answer += temp - average;
                }
            }
            
            System.out.println("#"+test_case+" "+answer);

		}
	}
}