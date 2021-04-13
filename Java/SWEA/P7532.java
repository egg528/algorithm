package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

class Main
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int S = sc.nextInt();
            int E = sc.nextInt();
            int M = sc.nextInt();
			
            int answer = S;
            
            while(S != 0){
            	if(S==E && E==M){
                	break;
                }
                
                
                
                if((answer-E)%24 == 0){
                	if((answer-M)%29 == 0){
                    	break;
                    }
                }
                
                answer += 365;
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}