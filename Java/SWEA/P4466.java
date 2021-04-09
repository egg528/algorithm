package SWEA;

import java.util.*;
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
			int sub = sc.nextInt();
            int k = sc.nextInt();
            
            ArrayList<Integer> score = new ArrayList<Integer>();
            
            for(int i = 0; i < sub; i++){
            	score.add(sc.nextInt());
            }
            
            Collections.sort(score);
            
            int answer = 0;
            
            for(int i = score.size()-1; score.size()-1-k < i; i--){
            	answer += score.get(i);
            }
            
            System.out.println("#"+test_case+" "+answer);

		}
	}
}