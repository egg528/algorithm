package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= T; test_case++)
		{	
   long answer = 0;
			
			int day = sc.nextInt();
			int[] price = new int[day];
			
			for(int i = 0; i < day; i ++) {
				price[i] = sc.nextInt();
			}
			
			int temp = -1;
			int max = 0;
			for(int i = 0; i < day-1; i++) {
				
				if(i <= temp) {
					
				}else {
					max = price[i];
					for(int k = i+1; k < day; k++) {
						if(max<price[k]) {
							max = price[k];
							temp = k;
						}
					}
				}
				
				if(price[i] < max) {
					answer += max - price[i];
				}
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}