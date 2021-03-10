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
            int cnt = sc.nextInt();
            StringBuilder sb = new StringBuilder(sc.next());
		
			for(int i = 0; i < sb.length()-1; i++){
            	if(sb.charAt(i) == sb.charAt(i+1)){

                	sb.delete(i, i+2);
                    if(i != 0){
                    	i -= 2;
                    }
                }
            }
            
            System.out.print("#"+test_case+" "+sb.toString());
            System.out.println();

		}
	}
}