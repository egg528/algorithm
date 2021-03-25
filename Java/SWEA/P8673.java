package SWEA;

import java.util.*;
import java.io.*;
import java.io.FileInputStream;


class Solution
{
    	public static void main(String args[]) throws Exception
	{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[(int)Math.pow(2, k)];
            
            for(int i = 0; i < Math.pow(2, k); i++) {
            	arr[i] = Integer.parseInt(st.nextToken());
            }
            int answer = 0;
            for(int i = k; 0 < i; i--){
                int right = (int)Math.pow(2, k-i);
                int down = (int)Math.pow(2,k-i+1);
            	for(int j = 0; j < Math.pow(2, i)/2; j++ ){
                	int start = down * j;
                    int winner = (arr[start] < arr[start + right]) ? arr[start + right] : arr[start];
                    answer += Math.abs(arr[start] - arr[start+right]);
                    arr[start] = winner;
                }
            }      
            System.out.println("#"+test_case+" "+answer);
		}
	}
}          