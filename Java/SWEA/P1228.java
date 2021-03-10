package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			ArrayList<Integer> code = new ArrayList<Integer>();
            
            int codeLen = sc.nextInt();
            for(int i = 0; i < codeLen; i++){
            	code.add(sc.nextInt());
            }
            
            int commandLen = sc.nextInt();
            for(int k = 0; k < commandLen; k++){
            	String check = sc.next();
                int index = sc.nextInt();
                int newCodeLen = sc.nextInt();
                ArrayList<Integer> newCode = new ArrayList<Integer>();
                
                for(int i = 0; i < newCodeLen; i++){
               	    newCode.add(sc.nextInt());    
                }
                
                for(int i = newCode.size()-1; 0 <= i; i--){
                	code.add(index, newCode.get(i));
                }
            }
            
            System.out.print("#"+test_case+ " ");
            for(int i = 0; i < 10; i++){
            	System.out.print(code.get(i) + " ");
            }
            
		}
	}
}