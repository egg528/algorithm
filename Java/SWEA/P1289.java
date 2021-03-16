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
			StringBuilder str = new StringBuilder(sc.next());
            
            String temp = "1";
            int cnt = 0;
            
            for(int i = 0; i < str.length(); i++){
            	if(str.substring(i, i+1).equals(temp)){
                	if(temp.equals("1")){
                    	temp = "0";
                    }else{
                    	temp = "1";
                    }
                    cnt++;
                }
            }
            
            System.out.println("#"+test_case+" "+cnt);
		}
	}
}