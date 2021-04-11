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
			int num = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            for(int i = 0; i < num; i++){
            	int temp = sc.nextInt();
                if(temp == 0){
                	arr.remove(arr.size()-1);
                }else{
                	arr.add(temp);
                }
            }
            int answer = 0;
            for(int i = 0; i < arr.size(); i++){
            	answer += arr.get(i);
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
}