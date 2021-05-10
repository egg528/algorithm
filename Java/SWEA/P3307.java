package SWEA;

import java.util.*;
import java.io.*;

class Solution
{
    static int answer = 0;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int[][] arr = new int[2][N];
            
            for(int i = 0; i < N; i++){
            	arr[0][i] = sc.nextInt();
                arr[1][i] = 1;
            }
            
            int max = 1;
            for(int i = 0; i < N; i++){
                for(int k = 0; k < i; k++){
                    if(arr[0][k] <= arr[0][i] && arr[1][i]< arr[1][k]+1){
                    	arr[1][i] = arr[1][k]+1;
                    }
                }
                if(max < arr[1][i]){
                	max = arr[1][i];
                }
            }

            System.out.println("#"+test_case+" "+max);            
		}
	}   
}