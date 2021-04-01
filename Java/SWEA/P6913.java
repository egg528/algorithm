package SWEA;

import java.util.*;
import java.io.FileInputStream;
import java.io.*;


class Solution{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] NM = br.readLine().split(" ");
            
            int N = Integer.valueOf(NM[0]);
            int M = Integer.valueOf(NM[1]);
            
            String[][] arr = new String[N][M];
            
            for(int i = 0; i < N; i++){
            	arr[i] = br.readLine().split(" ");
            }
            
            int max = 0;
            int maxCnt = 0;
            for(int i = 0; i < N; i++){
            	int temp = 0;
                for(int j = 0; j < M; j++){
                	if(arr[i][j].equals("1")){
                    	temp++;
                    }
                }
                if(max == temp){
                	maxCnt++;
                }
                
                if(max < temp){
                	maxCnt = 1;
                    max = temp;
                }
            }
            
            System.out.println("#"+test_case+" "+maxCnt+" "+max);
            
		}
	}
}