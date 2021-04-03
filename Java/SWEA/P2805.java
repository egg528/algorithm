package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int size = sc.nextInt();
            int[][] arr = new int[size][size];
            
            for(int i = 0; i < size; i++){
            	String str = sc.next();
                for(int k  = 0; k < str.length(); k++){
                	arr[i][k] = Integer.valueOf(str.substring(k, k+1));
                }
            }
            
            int half = size/2;
            int sum = 0;
            
            for(int i =0; i < size; i++){
            	sum+=arr[half][i];	
            }
            
            for(int i = 1; i <= half; i++){
            	for(int k = i; k < size-i; k++ ){
                	sum+=arr[half-i][k];	
                }
                for(int k = i; k < size-i; k++ ){
                	sum+=arr[half+i][k];
                }
            }
            
            System.out.println("#"+test_case+" "+sum);
            
		}
	}
}