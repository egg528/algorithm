package SWEA;

import java.util.*;


class Solution
{
    static int answer;
    
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++)
		{
		
            String[] NL = br.readLine().split(" ");
            int N = Integer.valueOf(NL[0]);
            int L = Integer.valueOf(NL[1]);
            
            
            int[] flavor = new int[N];
            int[] cal = new int[N];
            
            for(int i = 0; i < N; i++){
                String[] temp = br.readLine().split(" ");
                flavor[i] = Integer.valueOf(temp[0]);
                cal[i] = Integer.valueOf(temp[1]);
                
            }
            
            answer = 0;
            
            bfs(flavor, cal, 0, 0, 0, L);
            
            System.out.println("#"+test_case+" "+answer);
            
		}
    }
        public static void bfs(int[] flavor, int[] cal, int now, int flavorSum, int calSum, int restrict){
        	if(restrict< calSum){
            	return;
            }
            if(now == flavor.length){
            	if(calSum <= restrict && answer < flavorSum){
                	answer = flavorSum;
                }
                return;
            }
            if(answer < flavorSum){
            	answer = flavorSum;
            }
            bfs(flavor, cal, now+1, flavorSum, calSum, restrict);
            bfs(flavor, cal, now+1, flavorSum+flavor[now], calSum+cal[now], restrict);
        }
}