package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Long> arr = new ArrayList<Long>();
		
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextLong());
		}
		
		for (int i = 0; i < M; i++) {
			Collections.sort(arr);
			long k = arr.get(0)+arr.get(1);
			arr.set(0, k);
			arr.set(1, k);
		}
		long count = 0;
		for(int i = 0; i < arr.size(); i++) {
			count += arr.get(i);
		}

		System.out.println(count);
	}
}