package BOJ;

import java.io.*;
import java.util.*;

class Main{	
	
	static int max = 0;
	
	static String answer = "";
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] MNH = br.readLine().split(" ");
		int M = Integer.parseInt(MNH[0]);
		int N = Integer.parseInt(MNH[1]);
		int H = Integer.parseInt(MNH[2]);
		
		String[][][] arr = new String[H][N][M];
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = br.readLine().split(" ");
			}
		}
		
		bfs(arr);
		boolean isFail = false;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					if(arr[i][j][k].equals("0")) {
						isFail = true;
						break;
					}
				}if(isFail) {
					break;
				}
				
			}if(isFail) {
				break;
			}
		}

		
		if(isFail) {
			System.out.println(-1);
		}else {
			System.out.println(max);
		}

	}
	static void bfs(String[][][] arr) {
		Queue<Node> queue = new LinkedList<>();
		
		// 익은 토마토 삽입
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					if(arr[i][j][k].equals("1")) {
						queue.add(new Node(i,j,k,0));
					}
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(max < temp.day) {
				max = temp.day;
			}
			
			if(0 <= temp.H-1 && arr[temp.H-1][temp.N][temp.M].equals("0")) {
				arr[temp.H-1][temp.N][temp.M] = "1";
				queue.add(new Node(temp.H-1, temp.N, temp.M, temp.day+1));
			}
			
			if(temp.H+1 < arr.length && arr[temp.H+1][temp.N][temp.M].equals("0")) {
				arr[temp.H+1][temp.N][temp.M] = "1";
				queue.add(new Node(temp.H+1, temp.N, temp.M, temp.day+1));
				
			}
			
			if(0 <= temp.N-1  && arr[temp.H][temp.N-1][temp.M].equals("0")) {
				arr[temp.H][temp.N-1][temp.M] = "1";
				queue.add(new Node(temp.H, temp.N-1, temp.M, temp.day+1));
				
			}
			
			if(temp.N+1 < arr[0].length && arr[temp.H][temp.N+1][temp.M].equals("0")) {
				arr[temp.H][temp.N+1][temp.M] = "1";
				queue.add(new Node(temp.H, temp.N+1, temp.M, temp.day+1));
				
			}
			
			if(0 <= temp.M-1 && arr[temp.H][temp.N][temp.M-1].equals("0")) {
				arr[temp.H][temp.N][temp.M-1] = "1";
				queue.add(new Node(temp.H, temp.N, temp.M-1, temp.day+1));
				
			}
			
			if(temp.M+1 < arr[0][0].length && arr[temp.H][temp.N][temp.M+1].equals("0")) {
				arr[temp.H][temp.N][temp.M+1] = "1";
				queue.add(new Node(temp.H, temp.N, temp.M+1, temp.day+1));
				
			}
			
			
		}
		
	}
	static class Node{
		int H;
		int N;
		int M;
		int day;
		public Node(int H, int N, int M, int day) {
			this.H = H;
			this.N = N;
			this.M = M;
			this.day = day;
		}
	}
}