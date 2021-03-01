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
			int cnt = 0;
            String str = String.valueOf(test_case);
            
            if(str.contains("3") || str.contains("6") || str.contains("9")){
                for(int i = 0; i < str.length(); i++){
                	if(str.charAt(i) =='3' || str.charAt(i) =='6' || str.charAt(i) =='9'){
                    	cnt++;
                    }
                }
                for(int i = 0; i < cnt; i++){
                	System.out.print("-");
                }
                System.out.print(" ");
      
            }else{
            	System.out.print(test_case+" ");
            }
			

		}
	}
}