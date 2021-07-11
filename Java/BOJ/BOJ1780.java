package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{	
	static long minus = 0;
	static long zero = 0;
	static long one = 0;
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(" ");
		}
		
		divide(arr, N, 0, 0);
		
		System.out.println(minus+"\n"+zero+"\n"+one);
		
		
		
		
	}
	
	public static void divide(String[][] arr, int N, int startRow, int startCol) {
		
		// check all number is same;
		String check = arr[startRow][startCol];
		Boolean isSame = true;
		
		for(int i = startRow; i < startRow+N; i++) {
			for(int j = startCol; j < startCol+N; j++) {
				if(!arr[i][j].equals(check)) {
					isSame = false;
					break;
				}
			}
			if(!isSame) {
				break;
			}
		}
		
		if(isSame) {
			if(check.equals("-1")){
				minus++;
			}else if(check.equals("0")) {
				zero++;
			}else {
				one++;
			}		
		}else {
			int div = N/3;
			divide(arr, div, startRow, startCol);
			divide(arr, div, startRow, startCol+div);
			divide(arr, div, startRow, startCol+div+div);
			
			
			divide(arr, div, startRow+div, startCol);
			divide(arr, div, startRow+div, startCol+div);
			divide(arr, div, startRow+div, startCol+div+div);
			
			
			divide(arr, div, startRow+div+div, startCol);
			divide(arr, div, startRow+div+div, startCol+div);
			divide(arr, div, startRow+div+div, startCol+div+div);
		}
		
		return;
		
		
	}
}