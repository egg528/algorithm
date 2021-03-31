package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
	static int white = 0;
	static int blue = 0;
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		String[][] arr = new String[N][N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(" ");
		}
		
		checkOneColor(arr, N, 0, 0);
		
		System.out.println(white);
		System.out.println(blue);
		
		
	}
	public static void checkOneColor(String[][] arr, int N, int startCol, int startRow) {
		if(N == 0) {
			return;
		}
		
		boolean OneColor = true;
		
		String before = arr[startRow][startCol];
		for(int i = startRow; i < N+startRow; i++) {
			for(int k = startCol; k < N+startCol; k++) {
				if(!arr[i][k].equals(before)) {
					OneColor = false;
					break;
				}
				before = arr[i][k]; 
			}
			if(OneColor == false) {
				break;
			}
		}
		
		
		
		if(OneColor == true ) {
			if(arr[startRow][startCol].equals("1")) {
				blue++;
			}else {
				white++;
			}
			return;
		}
		
		int half = N/2;
		
		checkOneColor(arr, N/2, startCol, startRow);
		checkOneColor(arr, N/2, startCol+N/2, startRow);
		checkOneColor(arr, N/2, startCol, startRow+N/2);
		checkOneColor(arr, N/2, startCol+N/2, startRow+N/2);
	
	}
}