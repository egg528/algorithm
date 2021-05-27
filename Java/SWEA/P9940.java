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
			int len = sc.nextInt();
            
            boolean[] arr = new boolean[len];
            
            for(int i = 0; i < len; i++){
            	int num = sc.nextInt();
                if(num <= len){
                	arr[num-1] = true;
                }
            }
            
            boolean check = false;
            
            for(int i = 0; i < len; i++){
            	if(!arr[i]){
                	check = true;
                    break;
                }
            }
            
            if(check){
            	System.out.println("#"+test_case+" "+"No");
            }else{
            	System.out.println("#"+test_case+" "+"Yes");
            }
		}
	}
}