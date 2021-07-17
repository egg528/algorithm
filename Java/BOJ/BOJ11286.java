package BOJ;

import java.io.*;
import java.util.*;

class Main{	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(Math.abs(o1) == Math.abs(o2)) {
					return (o1 <= o2)? -1:1;
				}
				
				return (Math.abs(o1) < Math.abs(o2))? -1 : 1;
			}
		});
		
		while(N-- > 0) {
			int temp = Integer.parseInt(br.readLine());
				if(temp == 0) {
					if(!pq.isEmpty()) {
						bw.write(pq.poll()+" \n");
					}else {
						bw.write("0 \n");
					}
					
				}else {
					pq.add(temp);
				}
			}
		bw.flush();
		bw.close();
		br.close();
		
		}
}