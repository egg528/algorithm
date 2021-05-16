package SWEA;

import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int[] arr = new int[N];
            
            for(int i = 0 ; i < N; i++){
            	arr[i] = sc.nextInt(); 
            }
            
            int sum = arr[0];
            
            for(int i = 1; i < N; i++){
            	if(sum == 0 || arr[i] == 0 || sum == 1 || arr[i] == 1){
                	sum += arr[i];
                }else{
                	sum *= arr[i];
                }
            }
            
          System.out.println("#"+test_case+" "+sum);

		}
	}
}