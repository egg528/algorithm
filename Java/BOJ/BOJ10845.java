package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] arr = br.readLine().split(" ");
			
			
			String order = arr[0];
			if(order.equals("push")) {
				queue.offer(Integer.parseInt(arr[1]));
				
			}else if(order.equals("pop")){
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.poll());
				}
				
			}else if(order.equals("size")){
				System.out.println(queue.size());
				
			}else if(order.equals("empty")){
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}else if(order.equals("front")){
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.peek());
				}
			}else if(order.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					int size = queue.size();
					Iterator it = queue.iterator();
					int out = 0;
					while(it.hasNext()) {
						out = (int) it.next();
						
					}
					System.out.println(out);
					
				}
			}
		}		
    }
}