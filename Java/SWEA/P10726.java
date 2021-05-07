package SWEA;

import java.util.Scanner;
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
			int N = sc.nextInt();
            int M = sc.nextInt();
            
            String binary = Integer.toBinaryString(M);
            boolean check = false;
            for(int i = binary.length()-1; binary.length()-N <= i; i--){
                if(i == -1){
                    check = true;
                	break;
                }
                
            	if(binary.charAt(i) != '1'){
                	check = true;
                    break;
                }
            }
            
            if(check){
            	System.out.println("#"+test_case+" "+"OFF");
            }else{
            	System.out.println("#"+test_case+" "+"ON");
            }

		}
	}
}