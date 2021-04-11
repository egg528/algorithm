package SWEA;

import java.io.*;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int K = Integer.valueOf(br.readLine());
            
            String[] tree = br.readLine().split(" ");
            boolean[] treeCheck = new boolean[tree.length];
            
            int start = tree.length;
            
            
            System.out.print("#"+test_case+" ");
            for(int i = 0; i < K; i++){
                start /= 2;
            	
                for(int k = start; k < tree.length; k+=start+1){
                	if(treeCheck[k] == false){
                    	System.out.print(tree[k]+" ");
                        treeCheck[k] = true;
                    }
                }
                System.out.println();
            }
		}
	}
}