package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
    
    static int win;
    static int lose;
    static int draw;
    
 	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.valueOf(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            ArrayList<Integer> rivalDeck = new ArrayList<Integer>();
            ArrayList<Integer> myDeck = new ArrayList<Integer>();
            
            while(st.hasMoreTokens()){
            	rivalDeck.add(Integer.valueOf(st.nextToken()));
            }
            
            for(int i = 1; i <= 18; i++){
            	if(!rivalDeck.contains(i)){
                	myDeck.add(i);
                }
            }
            
            win = 0;
            lose = 0;
            draw = 0;
            
            dfs(rivalDeck, myDeck, 0, 0, new boolean[9]);
            
            
            
            System.out.println("#"+test_case+" "+lose+" " + win);
            
		}
	}
    
    public static void dfs(ArrayList<Integer> rivalDeck, ArrayList<Integer> myDeck, int now, int score, boolean[] check){
    	if(now == 9){
        	if(0 == score){
            	draw++;
            }else if(0 < score){
            	win++;
            }else{
            	lose++;
            }
            return;
        }
        
        for(int i = 0; i < myDeck.size(); i++){
            if(!check[i]){
            	int rival = rivalDeck.get(now);
                int my = myDeck.get(i);
                
                check[i] = true;
                
                if(rival < my){
                    dfs(rivalDeck, myDeck, now+1, score+rival+my, check);
       
                }else{
                    dfs(rivalDeck, myDeck, now+1, score-(rival+my), check);
                }
                
                check[i] = false;
            }
        }
    }
}