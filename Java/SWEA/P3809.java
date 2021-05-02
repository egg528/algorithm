package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int num = sc.nextInt();
            
            StringTokenizer st;
            String str = "";
            while(true){
            	String temp = br.readLine();
                if(temp.equals("")){
                	break;
                }
                
                st = new StringTokenizer(temp, " ");
                
                while(st.hasMoreTokens()){
                	str+= st.nextToken();
                }
                
                
            }

            
            
            boolean[] check = new boolean[1000];
            
            for(int i = 0; i < str.length(); i++){
            	check[Integer.valueOf(str.substring(i, i+1))] = true;
            }
            
            for(int i = 0; i <  str.length()-1; i++){
            	check[Integer.valueOf(str.substring(i, i+2))] = true;
            }
            for(int i = 0; i < str.length()-2; i++){
            	check[Integer.valueOf(str.substring(i, i+3))] = true;
            }
            
            for(int i = 0; i<1000 ; i++){
            	if(!check[i]){
                	System.out.println("#"+test_case+" "+i);
                    break;
                }
            }
		}
	}
}