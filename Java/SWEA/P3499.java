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
            int num = Integer.valueOf(br.readLine());
            String[] arr = br.readLine().split(" ");
            ArrayList<String> answer = new ArrayList<String>();
            
            int mid = num/2;
            
			if(num%2 == 0){
            	for(int i = 0; i < num/2; i++){
                	answer.add(arr[i]);                    
                    if(mid < num){
                    	answer.add(arr[mid]);
                    }
                    mid++;
                }
            }else if(num == 1){
                System.out.println("#"+test_case+" "+arr[0]);
            }else{
                mid += 1;
            	for(int i = 0; i <= num/2; i++){
                	answer.add(arr[i]);                    
                    if(mid < num){
                    	answer.add(arr[mid]);
                    }
                    mid++;
                }
            }
            System.out.print("#"+test_case);
           for(int i = 0; i < answer.size(); i++){
           		System.out.print(" "+answer.get(i));
           }
            System.out.println();
           	
		}
	}
}