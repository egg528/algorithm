package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
            String[] alph = str.split("");
            ArrayList<String> arr = new ArrayList<String>();
            
            for(int i = 0; i < alph.length; i++){
            	String temp = alph[i];
                if(arr.contains(temp)){
                	arr.remove(temp);
                }else{
                	arr.add(temp);
                }
            }
            
            if(arr.isEmpty()){
            	System.out.println("#"+test_case+" "+"Good");
            }else{
                Collections.sort(arr);
            	System.out.print("#"+test_case+" ");
                for(int i = 0; i < arr.size(); i++){
                	System.out.print(arr.get(i));
                }
                System.out.println();
            }
		}
	}
}