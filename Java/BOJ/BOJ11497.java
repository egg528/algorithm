package BOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		ArrayList<Integer> last = new ArrayList<Integer>();
		
		for(int i = 0; i < testCase; i++) {
			int log = sc.nextInt();
			int[] arr = new int[log];
			
			for (int j = 0; j < log; j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int[] answer = new int[log];
			
			if(log%2 == 0) {
				int mid = log/2;
				answer[mid] = arr[log-1];
				for(int k = 1; k <= mid-1; k++) {
					answer[mid+k] = arr[(log-1)-((k*2)-1)];
					answer[mid-k] = arr[(log-1)-(k*2)];
				}
				answer[0] = arr[0];
			}else {
				int mid = log/2;
				answer[mid] = arr[log-1];
				for(int k = 1; k <= mid; k++) {
					answer[mid+k] = arr[(log-1)-((k*2)-1)];
					answer[mid-k] = arr[(log-1)-(k*2)];
				}
				
			}

			
			int[] level = new int[log];
			
			level[0] = Math.abs(answer[0]-answer[answer.length-1]);
			for (int k = 1; k < log; k++) {
				level[k] = Math.abs(answer[k]-answer[k-1]);
			}
			
			Arrays.sort(level);
			last.add(level[level.length-1]);
		}
		for(int i = 0; i < last.size(); i++) {
			System.out.println(last.get(i));
		}
	}
}