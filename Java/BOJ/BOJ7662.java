package BOJ;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> lowPQ = new PriorityQueue<Integer>();
			PriorityQueue<Integer> highPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			while(N-- > 0) {
				String[] temp = br.readLine().split(" ");
				
				if(temp[0].equals("I")) {
					int num = Integer.parseInt(temp[1]);
					lowPQ.add(num);
					highPQ.add(num);
					map.put(num, map.getOrDefault(num, 0)+1);
					
				}else if(temp[0].equals("D") && temp[1].equals("-1")) {
					while(!lowPQ.isEmpty()) {
						int num = lowPQ.poll();
						int temp2 = map.getOrDefault(num, 0);
						
						if(temp2 == 0) {
							continue;
						}
						
						if(temp2 == 1) {
							map.remove(num);
						}else {
							map.put(num, temp2-1);
						}
						break;
					}
				}else{
						while(!highPQ.isEmpty()) {
							int num = highPQ.poll();
							int temp2 = map.getOrDefault(num, 0);
							
							if(temp2 == 0) {
								continue;
							}
							
							if(temp2 == 1) {
								map.remove(num);
							}else {
								map.put(num, temp2-1);
							}
							break;
						}
					}
				}
			
		
			while(!highPQ.isEmpty()) {
				int num = highPQ.peek();
				int temp2 = map.getOrDefault(num, 0);
				if(temp2 == 0) {
					highPQ.poll();
				}else {
					break;
				}
			}
			while(!lowPQ.isEmpty()) {
				int num = lowPQ.peek();
				int temp2 = map.getOrDefault(num, 0);
				if(temp2 == 0) {
					lowPQ.poll();
				}else {
					break;
				}
			}
			
			
			if(lowPQ.isEmpty()) {
				bw.write("EMPTY\n");
			}else {
				bw.write(highPQ.poll() + " " + lowPQ.poll()+"\n");
			}
			
			bw.flush();
		
		}
	}
}
