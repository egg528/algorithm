package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int makeOne(int x) {
		int[] arr = new int[x+1];
		arr[1] = 0;
		
		
		
		for(int i = 2; i <= x; i++) {
			int minValue = arr[i-1];
			if(i%2 == 0) {
				minValue = Math.min(minValue, arr[i/2]);
			}
			if(i%3 == 0) {
				minValue = Math.min(minValue, arr[i/3]);
			}
			if(i%5 == 0) {
				minValue = Math.min(minValue, arr[i/5]);
			}
			arr[i] = minValue+1;
		}
		
		return arr[x];
		
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 29; i++) {
			System.out.println(makeOne(i));
		}
		
	}
}