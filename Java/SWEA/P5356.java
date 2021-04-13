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
			int maxLen = 0;
            
            ArrayList<String> arr = new ArrayList<String>();
            
            for(int i = 0; i < 5; i++){
           		String word = br.readLine();
                
                if(maxLen < word.length()){
                	maxLen = word.length();
                }
                
                arr.add(word);
            }
            
            String[][] answer = new String[5][maxLen];
            
            for(int i = 0; i < 5; i++){
            	String word = arr.get(i);
                for(int k = 0; k < word.length(); k++){
                	answer[i][k] = word.substring(k, k+1);
                }
            }
            
            System.out.print("#"+test_case+" ");
            for(int i = 0; i < maxLen; i++){
            	if(answer[0][i] != null){
                	System.out.print(answer[0][i]);
                }
                if(answer[1][i] != null){
                	System.out.print(answer[1][i]);
                }
                if(answer[2][i] != null){
                	System.out.print(answer[2][i]);
                }
                if(answer[3][i] != null){
                	System.out.print(answer[3][i]);
                }
                if(answer[4][i] != null){
                	System.out.print(answer[4][i]);
                }
            }
            System.out.println();
		}
	}
}