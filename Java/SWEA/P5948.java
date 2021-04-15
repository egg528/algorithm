package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
    static ArrayList<Integer> arr;
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{	
            String[] numList = br.readLine().split(" ");
            
            arr = new ArrayList<Integer>();
            
            dfs(numList, 0, 0, 0);
            
            Collections.sort(arr);
            
            System.out.println("#"+test_case+" "+arr.get(arr.size()-5));


		}
	}
    public static void dfs(String[] numList, int deepth, int cnt, int sum){        
        if(cnt == 3){
        	if(!arr.contains(sum)){
            	arr.add(sum);
            }
            return;
        }
        
        if(deepth == 7){
        	return;
        }
        dfs(numList, deepth+1, cnt, sum);
        dfs(numList, deepth+1, cnt+1, sum+Integer.valueOf(numList[deepth]));
        return;
    }
}