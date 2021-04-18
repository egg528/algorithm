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
            
            int num = sc.nextInt();
            
            int orangeDir = 1;
            int blueDir = 1;
            
            int orangeCoin = 0;
            int blueCoin = 0;
            
            int answer = 0;
            
            for(int i = 0; i < num; i++){
            	String who = sc.next();
                int where = sc.nextInt();
                
                if(who.equals("O")){
                	int needTime = Math.abs(orangeDir-where)+1;
                    
                    if(needTime <= orangeCoin){
                    	orangeDir = where;
                        answer+=1;
                        blueCoin = 1;
                        orangeCoin = 0;
                    }else{
                    	int realTime = needTime - orangeCoin;
                        
                        answer += realTime;
                        blueCoin += realTime;
                        orangeDir = where;
                        orangeCoin = 0;
                    }
                }else{
                    int needTime = Math.abs(blueDir-where)+1;
                    
                    if(needTime <= blueCoin){
                    	blueDir = where;
                        answer+=1;
                        orangeCoin = 1;
                        blueCoin = 0;
                        
                    }else{
                    	int realTime = needTime - blueCoin;
                        
                        answer += realTime;
                        orangeCoin += realTime;
                        blueDir = where;
                        blueCoin = 0;
                    }
                }
            }
            System.out.println("#"+test_case+" "+answer);
		}
	}
}