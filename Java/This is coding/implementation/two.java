package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					String time = String.valueOf(i)+
							String.valueOf(j)+
							String.valueOf(k);
					
					if (time.contains("3")) {
						count+=1;
					}
				}
			}
		}
		System.out.println(count);
	}
}