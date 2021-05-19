package SWEA;

import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			long N = sc.nextInt();
            long A = sc.nextInt();
            long B = sc.nextInt();
            
            long answer = Integer.MAX_VALUE;
            
            for(int R = 1; R <= N; R++){
            	for(int C = 1; C <= N; C++){
                	if(R*C <= N){
                        long temp = (A*Math.abs(R-C)) + B*(N-R*C);
                        if(temp < answer){
                            answer = temp;
                        }
                    }else{
                    	break;
                    }
                }
            }
            System.out.println("#"+test_case+" "+answer);
            
		}
	}
}