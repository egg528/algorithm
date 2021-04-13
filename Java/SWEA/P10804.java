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
			char[] arr = sc.next().toCharArray();
            String answer = "";
            
            for(int i = arr.length-1; 0<= i; i--){
            	char temp = arr[i];
                if(temp == 'p'){
                	answer+="q";
                }else if(temp=='q'){
                	answer+="p";
                }else if (temp=='b'){
                	answer+="d";
                }else{
                	answer+="b";
                }
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
}