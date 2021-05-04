package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.valueOf(br.readLine());
            int[] funnyDay = new  int[N];
            
            for(int i = 0; i < N; i++){
            	funnyDay[i] = Integer.valueOf(br.readLine());
            }
            
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            for(int i = 1; i < N; i++){
            	int d = funnyDay[i] - 1;
                boolean check = false;
                for(int k = 0; k < arr.size(); k++){
                	if(d%arr.get(k)==0){
                    	check = true;
                        break;
                    }
                }
                if(!check){
                	arr.add(d);
                }
            }
			System.out.println("#"+test_case+" "+arr.size());
		}
	}
}