package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
		int count = 1;
		char fix = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != fix) {
				fix = arr[i];
				count += 1;
			}
		}
		count /= 2;
		if (count == 0) {
			System.out.println(0);
		}else if (count == 1) {
			System.out.println(1);
		}else {
			System.out.println(count);
		}
		
	}
}