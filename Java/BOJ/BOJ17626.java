package BOJ;

import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		sol(N);

		
	}
	
	public static void sol(int N) {
		if(Math.sqrt(N)%1 == 0) {
			System.out.println(1);
			return;
		}
		
		for(int i = 1; i < N; i++) {
			if(N < Math.pow(i, 2)) {
				break;
			}
			for(int j = 1; j <= i; j++) {
				if(Math.pow(i, 2)+Math.pow(j, 2) == N) {
					System.out.println(2);
					return;
				}
			}
		}
		
		for(int i = 1; i < N; i++) {
			if(N < Math.pow(i, 2)) {
				break;
			}
			for(int j = 1; j <= i; j++) {
				for(int k = 1; k <= j; k++) {
					if(Math.pow(i, 2)+Math.pow(j, 2)+Math.pow(k, 2) == N) {
						System.out.println(3);
						return;
					}
				}
			}
		}
		
		System.out.println(4);
		return;
		
	}
}