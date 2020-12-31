package BOJ;

package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			int[] arr = new int[num];
			
			for(int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}

			int cnt;
			PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
						
			for(int i = 0; i < arr.length; i++) {
				cnt = 0;
				for (int j = i; j < arr.length; j+=2) {
					cnt += arr[j];
				}
				priorityQueue.add(cnt);
			}
			
			System.out.println(priorityQueue.peek());
	}
}