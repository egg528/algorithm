package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		 	int aim = sc.nextInt();
            int[] sum = new int[aim+1];
            
            for(int i = 1; i < sum.length; i++){
            	sum[i] = sum[i-1]+i;
            }
            
            int answer = 0;
            for(int i = sum.length-1; 0 <= i; i--){
            	for(int k = i-1; 0 <= k; k--){
                	if(sum[i] - sum[k] == aim){
                    	answer++;
                    }else if(sum[i] - sum[k] > aim){
                    	break;
                    } 
                }
            }
            
       
            
            System.out.println("#"+test_case+" "+ answer);               

		}
	}
}