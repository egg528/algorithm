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
			String first = sc.next();
            String second = sc.next();
            
            int firstLen = first.length();
            int secondLen = second.length();
            
            int bigLen = (firstLen < secondLen) ? secondLen : firstLen;
           
            StringBuilder sb = new StringBuilder("");
            
            
            int beforeSum = 0;
            for(int i = 0; i < bigLen; i++){
                String firstNum = "0";
                String secondNum = "0";
                
                if(0 <= firstLen-i-1){
            		firstNum = first.substring(firstLen-i-1, firstLen-i);
                }
                
                if(0 <= secondLen-i-1){
                	secondNum = second.substring(secondLen-i-1, secondLen-i);
                }
                
                int sum = Integer.valueOf(firstNum) + Integer.valueOf(secondNum)+beforeSum;
                beforeSum = 0;
                
                if(10 <= sum && i != bigLen-1){
                	beforeSum = 1;
                    sum -= 10;
                }
                
                sb.insert(0, String.valueOf(sum));
            }
            System.out.println("#"+test_case+" "+sb);

		}
	}
}