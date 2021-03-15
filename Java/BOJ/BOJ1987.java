package BOJ;

import java.util.HashMap;
import java.util.Scanner;


class Main{
	 static int[] dx = {1, -1, 0, 0};
	 static int[] dy = {0, 0, 1, -1};
	 static int max = -1;
	 
	 
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 
		 int R = sc.nextInt();
		 int C = sc.nextInt();
		 
		 String[][] arr = new String[R][C];
		 
		 for(int i = 0; i < R; i++) {
			 String[] temp = sc.next().split("");
			 for(int k = 0; k < C; k++) {
				 arr[i][k] = temp[k];
			 }
		 }
		 

		 
		 HashMap<String, Integer> alph = new HashMap<String, Integer>();
		 alph.put(arr[0][0], 1);
		 
		 dfs(arr, alph, 0, 0, 1);
		 
		 System.out.println(max);
		
		
	 }
	 
	 
	 
	 
	 
	 public static void dfs(String[][] arr, HashMap<String, Integer> alph, int x, int y, int num) {
		 max = Math.max(max, num);
		 
		 for(int i = 0; i < 4; i++) {
			 int nx = x + dx[i];
			 int ny = y + dy[i];
			 if(0 <= nx && nx < arr.length && 0 <= ny && ny < arr[0].length && alph.containsKey(arr[nx][ny]) == false) {
				 alph.put(arr[nx][ny], 1);
				 dfs(arr, alph, nx, ny, num+1);
				 alph.remove(arr[nx][ny]);
			 }
		 }
		 
		 
	 }
}