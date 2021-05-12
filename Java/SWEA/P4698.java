package SWEA;

import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String N = sc.next();
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            boolean[] arr = new boolean[B+1];
            int answer = 0;
            
            
            for(int i = 2; i < arr.length; i++){
            	if(!arr[i]){
                    if(A <= i && String.valueOf(i).contains(N)){
                    	answer++;
                    }
                	for(int k = i+i; k < arr.length; k += i){
                    	arr[k] = true;
                    }
                }
            }

            System.out.println("#"+test_case+" "+answer);

		}
	}
}