package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder(br.readLine());
            int num =Integer.valueOf(br.readLine());
            String[] command = br.readLine().split(" ");
            
            int[] cnt = new int[sb.length()+1];
       
            for(int i = 0; i < command.length; i++){
            	cnt[Integer.valueOf(command[i])]++;
            }
            
            int sup = 0;
            
            for(int i = 0; i < cnt.length; i++){
            	if(cnt[i] != 0){
                    for(int k = 0; k < cnt[i]; k++){
                		sb.insert(i+sup, "-");
                    	sup++;
                    }
                }
            }
            System.out.println("#"+test_case+ " "+sb.toString());
		}
	}
}