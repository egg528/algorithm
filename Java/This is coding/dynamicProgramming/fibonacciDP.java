package BOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int fibo(int x) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (x == 1 || x == 2) return 1;
		
		arr.add(1);
		arr.add(1);
		
		for(int i = 2; i < x; i++) {
			arr.add(arr.get(i-2) + arr.get(i-1));
		}
		
		return arr.get(arr.size()-1);
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			System.out.println(fibo(i));
		}
		
	}
}