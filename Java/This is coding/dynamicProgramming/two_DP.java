package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			int[] arr = new int[num];
			int[] answer = new int[num];
			
			for(int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}
			
			answer[0] = arr[0];
			answer[1] = arr[1];
			
			for (int i = 2; i < num; i++) {
				answer[i] = Math.max(answer[i-1], answer[i-2]+ arr[i]);
			}
			
			System.out.println(answer[num-1]);	
	}
}