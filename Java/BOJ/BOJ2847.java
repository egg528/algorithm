package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Level = sc.nextInt();
		
		
		int[] score = new int[Level];
		
		for (int i = 0; i < Level; i++) {
			score[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i = score.length-2; 0 <= i; i--) {
			if(score[i] >= score[i+1]) {
				int k = score[i];
				score[i] = score[i+1]-1;
				count += k - score[i];
			}
		}
		System.out.println(count);
	}
}
