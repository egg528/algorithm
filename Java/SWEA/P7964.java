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
			String[] ND = br.readLine().split(" ");
            int D = Integer.valueOf(ND[1]);
            
            String[] arr = br.readLine().split(" ");
            int cnt = 0;
            
            int now = D;
            
            for(int i = 0; i < arr.length; i++){
                now -= 1;
                
                if(arr[i].equals("1")){
                	now =  D;
                }else{
                    if(now == 0){
                		cnt++;
                    	now = D;
                    }
                }
            }
     
          
            
            System.out.println("#"+test_case+" "+cnt);

		}
	}
}