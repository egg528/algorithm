package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Main
{
	static int answer = 0
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num = sc.nextInt();
			
			boolean[][] arr = new boolean[num][26]; 
			
			
			for(int i = 0; i < num; i++) {
				char[] temp = sc.next().toCharArray();
				
				for(int k = 0; k < temp.length; k++) {
					arr[i][temp[k]-'a'] = true;
				}
			}
			
			dfs(num, 0, arr, new int[26]);
			System.out.println("#"+test_case+" "+ answer);
			answer =0;

		}
	}
	
	public static void dfs(int deepth, int cnt, boolean[][] arr, int[] check) {
		if(deepth == cnt) {
			int flag = 0;
			for(int i = 0; i < check.length; i++) {
				if(0 < check[i]) {
					flag++;
				}
			}
			if(flag == 26) {
				answer++;
			}
			return;
		}
		
		for(int i = 0; i < 26; i++) {
			if(arr[cnt][i]) {
				check[i]++;
			}
		}
		dfs(deepth, cnt+1, arr, check);
		
		for(int i = 0; i < 26; i++) {
			if(arr[cnt][i]) {
				check[i]--;
			}
		}
		dfs(deepth, cnt+1, arr, check);
	}
}