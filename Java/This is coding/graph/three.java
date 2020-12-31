package BOJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
		
public class Main {
	
	public static int find_parent(int[] parent, int x) {
		if(parent[x] != x) {
			parent[x] = find_parent(parent, parent[x]);
		}
		return parent[x];
	}
	
	public static void union(int[] parent, int a, int b) {
		a = find_parent(parent, a);
		b = find_parent(parent, b);
		
		if(a < b) {
			parent[b] = a;
		}else {
			parent[a] = b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] courseTime = new int[N+1];
		int[] precourse = new int[N+1];
		int[] result = new int[N+1];
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		
		for(int i = 0; i < N+1; i++) {
			courseTime[i] = 0;
			precourse[i] = 0;
			arr.add(new ArrayList<Integer>());
		}
		
		for(int i = 1; i < N+1; i++) {
			courseTime[i] = sc.nextInt();
			result[i] = courseTime[i];
			int a = sc.nextInt();
			while(a != -1) {
				arr.get(a).add(i);
				precourse[i] += 1;
				 a = sc.nextInt();
			}			
		}

		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < N+1; i++) {
			if(precourse[i] == 0) {
				queue.offer(i);
			}
		}
		
		while (queue.isEmpty()==false) {
			int now = queue.poll();
			
			ArrayList<Integer> nowarr = arr.get(now);
			
			for (int i : nowarr) {
				precourse[i] -=1;
				result[i] = Math.max(result[i], result[now] + courseTime[i]);
				if(precourse[i] == 0) {
					queue.add(i);
				}
			}
		}
		for(int i = 1; i < N+1; i++) {
			System.out.println(result[i]);
		}
		
	}
}