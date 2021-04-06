package BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		ArrayList<Integer> small = new ArrayList<Integer>();
		ArrayList<Integer> big = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			if(sc.nextInt() == 3) {
				small.add(sc.nextInt());
			}else {
				big.add(sc.nextInt());
			}
		}
		
		Collections.sort(small, Comparator.reverseOrder());
		Collections.sort(big, Comparator.reverseOrder());
		
		
		long[] s = new long[small.size()+1];
		long[] b = new long[big.size()+1];
		
		for(int i = 1; i < s.length; i++) {
			s[i] = s[i-1]+small.get(i-1);
		}
		
		for(int i = 1; i < b.length; i++) {
			b[i] = b[i-1]+big.get(i-1);
		}
		
		int maxThree = Math.min(W/3, small.size());
		long max = 0;
		
		while(0<=maxThree) {
			int maxFive = Math.min((W-(3*maxThree))/5, big.size());
			
			if(max < s[maxThree]+b[maxFive]) {
				max = s[maxThree]+b[maxFive];
				System.out.println(maxThree + " "+ maxFive);
			}
			
			maxThree--;
		}
		
		System.out.println(max);
	}
}