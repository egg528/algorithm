package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Solution
{
    static int answer = 0;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            answer = 0;
			StringBuilder str = new StringBuilder(sc.next());
            int change = sc.nextInt();
			
            if(str.length()<= change) {
            	for(int i = 0; i < str.length()-1; i++){
                	int max = -1;
                    int index = -1;
                    for(int j = i+1; j < str.length(); j++){
                    	if(max < Integer.valueOf(str.substring(j, j+1))){
                        	max = Integer.valueOf(str.substring(j, j+1));
                            index = j;
                        }
                    }
                    if(Integer.valueOf(str.substring(i, i+1)) < max){
                    	swap(str, i,  index);
                        change--;
                    }
                }
                if(change%2 == 0){
                	System.out.println("#"+test_case+" "+str.toString());
                }else{
                    swap(str, str.length()-1, str.length()-2);
                	System.out.println("#"+test_case+" "+str.toString());
                }                
            }else{
            	dfs(str, change, 0);
                System.out.println("#"+test_case+" "+answer);
            }

		}
	}
	
	
    public static void dfs(StringBuilder str, int change, int cnt){
    	if(change == cnt){

            if(Integer.valueOf(str.toString()) > answer){
            	answer = Integer.valueOf(str.toString());
            }
            return;
        }
        
        for(int i = 0; i < str.length(); i++){
        	for(int j = i+1; j < str.length(); j++){
            	
                    swap(str, i, j);
                    dfs(str, change, cnt+1);
                    swap(str, i, j);
               
            }
        }
    }
    
    public static void swap(StringBuilder str, int i, int j){
    	char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
    
}