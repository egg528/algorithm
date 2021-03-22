package SWEA;

import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();s


		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			String str = sc.next();
            
            Set set = new HashSet();
            
            for(int i = 0; i < str.length(); i++){
            	set.add(str.substring(i, i+1));
            }
			
            System.out.println("#"+test_case+" "+set.size());
		}
	}
}