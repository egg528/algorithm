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
		
			int start = sc.nextInt();
            int end = sc.nextInt();
			
            int answer = 0;
            for(int i = start; i <=end; i++){
                String str = String.valueOf(i);
                if(check(str) == true){
                answer++;}
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
    public static boolean check(String str){
        double sqrt = Math.sqrt(Integer.valueOf(str));
        
        if(sqrt%1 != 0.0){
        	return false;
        }
        
        String str2 = String.valueOf((int)sqrt);
        
        int mid = str.length()/2;
        int mid2 = str2.length()/2;
        
        
        
        //¦
        if(str2.length()%2 == 0){
        	for(int i = 0; i < mid2; i++){
                if(str2.charAt(mid2-i-1) != str2.charAt(mid2+i)){
                	return false;
                }
            }
        //Ȧ
        }else{
            for(int i = 0; i < mid2; i++){
                if(str.charAt(mid2-i-1) != str.charAt(mid2+i+1)){
                	return false;
                }
            }
        }
        
        
        
        if(str.length()  == 1){
        	return true;
        }
        
        //¦
        if(str.length()%2 == 0){
        	for(int i = 0; i < mid; i++){
                if(str.charAt(mid-i-1) != str.charAt(mid+i)){
                	return false;
                }
            }
        //Ȧ
        }else{
            for(int i = 0; i < mid; i++){
                if(str.charAt(mid-i-1) != str.charAt(mid+i+1)){
                	return false;
                }
            }
        }
        return true;
    }
}