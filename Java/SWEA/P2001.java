package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    public static int sumArr(int i, int j, int N, int[][] arr){
        int sum = 0;
        for(int a =i; a < i+N; a++){
            for(int b = j; b < j+N; b++){
         	    sum += arr[a][b];
            }
        }
        return sum;
    }
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int M = sc.nextInt();
            int N = sc.nextInt();
            
            int[][] arr = new int[M][M];
            
            for(int i = 0; i < M; i++){
            	for(int k = 0; k < M; k++){
                	arr[i][k] = sc.nextInt();
                }
            }
            
            
            int max = 0;
            for(int i = 0; i < M-N+1; i++){
            	for(int j = 0; j < M-N+1; j++){
                	int sum = sumArr(i, j, N, arr);
                    
                    if(max < sum){
                    	max = sum;
                    } 
                }
            }
            
            System.out.println("#"+test_case+" "+max);

		}
	}
}