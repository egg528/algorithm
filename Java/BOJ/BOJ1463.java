package BOJ;

import java.util.Scanner;

class Main{	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int[] arr = new int[X+1];
		
		
		
		for(int i = X; X/2 < i; i--){
			arr[i] = X-i;
		}
		
		for(int i = X/2; 0 < i; i--) {
			int low = arr[i+1]+1;
			
			if(i*2 <= X) {
				low = Math.min(low, arr[i*2]+1);
			}
			
			if(i*3 <= X) {
				low = Math.min(low, arr[i*3]+1);
			}
			
			arr[i] = low;
		}
		
		System.out.println(arr[1]);

	}
}