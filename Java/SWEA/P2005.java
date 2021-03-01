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
            System.out.println("#" + test_case);
            
            int len = sc.nextInt();
            
            ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < len; i++){
            	arr.add(new ArrayList<Integer>());
            }
            
            for(int i  = 0; i < len; i++){
                if(0<i){
                	System.out.println();
                }
            	for(int k = 0; k <= i; k++){
                	if(k == 0 || k == i){
                        arr.get(i).add(1);
                    	System.out.print("1" + " ");
                    }else{
                    	int sum = arr.get(i-1).get(k-1) + arr.get(i-1).get(k);
                        arr.get(i).add(sum);
                        System.out.print(sum+ " ");
                    }
                }
            }
            System.out.println();
		}
	}
}