package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int city = sc.nextInt();
		int[] distance = new int[city-1];
		int[] price = new int[city];
		
		for(int i = 0; i < city-1; i++) {
			distance[i] = sc.nextInt();
		}
		
		for(int i = 0; i < city-1; i++) {
			price[i] = sc.nextInt();
		}
		
		long pay = 0L;
		int min = 1000000001;
		for(int i = 0; i < city-1; i++) {
			if (price[i] < min ) {
				min = price[i];
				pay += (long)min*distance[i];
			}else {
				pay += (long)min*distance[i];
			}
		}
		
		System.out.println(pay);
		
	}
}
