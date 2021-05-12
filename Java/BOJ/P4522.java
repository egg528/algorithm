package BOJ;

import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String str = sc.next();
            boolean isPalindrome = true;
            
            int len = str.length();
            
            
            // 문자열 크기 짝수
            if(len%2 == 0){
                int half = len/2;
                for(int i = 1; i <= half; i++){
                	String left = str.substring(half-i, half-i+1);
                    String right = str.substring(half+i-1, half+i);
                    
                    if(left.equals("?") || right.equals("?") || left.equals(right)){
                    }else{
                    	isPalindrome = false;
                        break;
                    }
                }
            
            //문자열 크기 홀수
            }else{
                int half = len/2;
                for(int i = 1; i <= half; i++){
                    String left = str.substring(half-i, half-i+1);
                    String right = str.substring(half+i, half+i+1);
                    
                	if(left.equals("?") || right.equals("?") || left.equals(right)){
                    }else{
                    	isPalindrome = false;
                        break;
                    }
                }
            }
            if(isPalindrome){
            	System.out.println("#"+test_case+" "+"Exist");
            }else{
            	System.out.println("#"+test_case+" "+"Not exist");
            }
            
		}
	}
}