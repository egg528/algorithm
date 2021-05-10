package SWEA;

import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            
            int[] arr = new int[N];
            for(int i = 0; i < arr.length; i++){
            	arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int[] bread = new int[arr[arr.length-1]+1];
            
            // 시간대별 붕어빵 개수 배열 만들기
            for(int i = 1; i < bread.length; i++){
            	if(i%M == 0){
                	for(int k = i; k < bread.length; k++){
                    	bread[k] += K;
                    }
                }
            }
            
            
            
            // 손님들 순차적으로 확인
            
            boolean isPossible = true;
            
            for(int i = 0; i < arr.length; i++){
            	for(int k = arr[i]; k < bread.length; k++){
                	bread[k] -= 1;
                    if(bread[k] < 0){
                    	isPossible = false;
                        break;
                    }
                }
                if(!isPossible){
                	break;
                }
            }
            
            if(isPossible){
            	System.out.println("#"+test_case+" "+"Possible");
            }else{
            	System.out.println("#"+test_case+" "+"Impossible");
            }

		}
	}
}