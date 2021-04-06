package BOJ;

import java.util.*;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int price = sc.nextInt();
			
			int[] arr = new int[num];
			int[] answer = new int[price+1];
			
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}
			
			answer[0] = 0;
			for(int i = 1; i < answer.length; i++) {
				answer[i] = 100001;
			}
			
			
			
			for(int i = 0; i < answer.length; i++) {
				for(int j: arr) {
					if(i+j < answer.length) {
					answer[i+j] = Math.min(answer[i+j], answer[i]+1);
					}
				}
			}
			
			if(100001 == answer[answer.length-1]) {
				System.out.println(-1);
			}else {
				System.out.println(answer[answer.length-1]);
			}
	}
}