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
            ArrayList<int[]> arr = new ArrayList<int[]>();
            
            for(int i = 0; i < num; i++){
            	arr.add(new int[] {sc.nextInt(), sc.nextInt()});
            }
            

            
            int answer = 0;
            
            for(int i = 0; i < arr.size(); i++){
            	int[] temp = arr.get(i);
                int left = temp[0];
                int right = temp[1];
                for(int k = 0; k < arr.size(); k++){
                	if(i != k){
                    	int[] temp2 = arr.get(k);
                        int left2 = temp2[0];
                        int right2 = temp2[1];
                        
                        if(left < left2 && right2 < right){
                        	answer++;
                        }else if(left2 < left && right < right2){
                        	answer++;
                        }
                    }
                }
            }
            System.out.println("#"+test_case+" "+answer/2);
        }
	}
}