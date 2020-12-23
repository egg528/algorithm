package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		Arrays.sort(arr);
		
		if(M <= K) {
			System.out.println(arr[-1]*M);
		}else {
			int a = M/(K+1);
			int b = M%K;
			System.out.println((a*arr[arr.length-2])+((M-a)*arr[arr.length-1]));
		}
	
	}
}
