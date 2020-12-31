package BOJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void topologySort(ArrayList<ArrayList<Integer>> graph, int[] indegree) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i < indegree.length; i++) {
			if(indegree[i] == 0) {
				queue.offer(i);
			}
		}
		
		while(queue.isEmpty() == false) {
			int now = queue.poll();
			result.add(now);
			
			for (int i : graph.get(now)) {
				indegree[i] -=1;
				if(indegree[i] == 0) {
					queue.offer(i);
				}
			}
		}
		
		for(int i: result) {
			System.out.println(i+" ");
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int[] indegree = new int[v+1];
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < v+1; i++) {
			indegree[i] = 0;
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			indegree[b] += 1;
		}
		topologySort(graph, indegree);	
	}
}