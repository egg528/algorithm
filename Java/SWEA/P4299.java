package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] time = br.readLine().split(" ");
            
            int day = Integer.valueOf(time[0]);
            int hour = Integer.valueOf(time[1]);
            int min = Integer.valueOf(time[2]);
            
            if (day < 11){
            	System.out.println("#"+test_case+" "+(-1));
            }else if(day == 11 && hour < 11){
            	System.out.println("#"+test_case+" "+(-1));
            }else if(day == 11 && hour == 11 && min < 11){
            	System.out.println("#"+test_case+" "+(-1));
            }else if(day == 11){
            	int answer = 0;
                if(hour == 11){
                	System.out.println("#"+test_case+" "+(min - 11));
                }else{
                	answer += (hour-11)*60;
                    answer += min;
                    System.out.println("#"+test_case+" "+answer);
                }
            }else{
                int answer = 769;
                answer+= (day-12)*1440;
                answer+=hour*60;
                answer += min;
                System.out.println("#"+test_case+" "+answer);     
            }
		}
	}
}