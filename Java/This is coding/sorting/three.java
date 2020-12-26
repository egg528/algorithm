package BOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			B.add(sc.nextInt());
		}
		
		
		Collections.sort(A);
		Collections.sort(B, Collections.reverseOrder());
		
		for (int i = 0; i < m; i++) {
			if (A.get(i) < B.get(i)) {
				A.set(i, B.get(i));
			}
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			cnt += A.get(i);
		}
		
		System.out.println(cnt);
	}
}