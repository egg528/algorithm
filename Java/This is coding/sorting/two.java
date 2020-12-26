package BOJ;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {	
	public static class student implements Comparable<student> {
		String name;
		int score;
		
		public student(String name, int score) {
			this.name = name;
			this.score = score;
		}

		@Override
		public int compareTo(student s) {
			if (score < s.score) {
				return -1;
			}else if (score > s.score){
				return 1;
			}
			return 0;
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<student> arr = new ArrayList<student>();
		
		for (int i = 0; i < N; i++) {
			student st = new student(sc.next(), sc.nextInt());
			arr.add(st);
		}
		
		Collections.sort(arr);
		
		for (int i = 0; i < N; i++) {
			System.out.print(arr.get(i).name + " ");
		}
	}
}
