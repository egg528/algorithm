package BOJ;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int riceCake = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int cut = 0;
		for(int i = 0; i < num; i++) {
			if(cut < arr[i]) {
				cut = arr[i];
			}
		}
		
		int cnt = 0;
		
		while (cnt < riceCake) {
			cnt = 0;
			for (int i = 0; i < num; i++) {
				if (cut < arr[i]) {
					cnt += arr[i] - cut;
				}
			}
			cut--;
		}
		
		System.out.println(cut+1);
		
	}
}