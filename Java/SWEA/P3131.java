package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		boolean[] arr = new boolean[1000001];
        
        for(int i = 2; i <= 500000; i++){
        	for(int k = i+i; k <= 1000000; k += i){
            	arr[k] = true;
            }
        }
        
		 for(int i = 2; i <= 1000000; i++){
        	if(arr[i] == false){
            	System.out.print(i+" ");
            }
        }
	}
}