package BOJ;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import test.Main.Temp;

class Main{
	public static class Temp{
		int num;
		int cnt;
		
		public Temp(int a, int b) {
			this.num = a;
			this.cnt = b;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int D = sc.nextInt();
		
		if(D <= S) {
			System.out.println(S-D);
		}else {
			PriorityQueue<Temp> queue = new PriorityQueue<Temp>(new Comparator<Temp>() {

				@Override
				public int compare(Temp o1, Temp o2) {
					// TODO Auto-generated method stub
					return (o1.cnt <= o2.cnt)? -1 : 1;
				}
				
			});
			boolean[] visited = new boolean[100001];
			
			queue.add(new Temp(S,0));
			
			while(true) {
				Temp now = queue.poll();
				visited[now.num]= true;
				
				if(now.num == D) {
					System.out.println(now.cnt);
					break;
				}
				
				if(0 <= now.num-1 && visited[now.num-1] == false) {
					queue.add(new Temp(now.num-1, now.cnt+1));
				}
				
				if(now.num+1 <= 100000 && visited[now.num+1] == false) {
					queue.add(new Temp(now.num+1, now.cnt+1));
				}
				
				if(now.num*2 <= 100000 && visited[now.num*2] == false) {
					queue.add(new Temp(now.num*2, now.cnt));
				}
			}
		}         
	}
}