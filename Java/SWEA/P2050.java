package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc  = new Scanner(System.in);
		String str = sc.next();
        
        char[] arr = str.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(Integer.valueOf(arr[i])-64 + " ");
        
        }

	}
}