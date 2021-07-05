package BOJ;

import java.util.*;
import java.io.*;

class Main{	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
				System.out.println(0);
			}else if(N == 1){
				String[] temp = br.readLine().split(" ");
				System.out.println(1);
			}else {
				Map<String, Integer> map = new HashMap<String, Integer>();
				
				int answer = 1;
				while(N-- > 0) {
					String[] temp = br.readLine().split(" ");
					map.put(temp[1], map.getOrDefault(temp[1], 0)+1);
				}
				
				Set<String> set = map.keySet();
				for(String i : set) {
					answer *= map.get(i)+1;
				}
				System.out.println(answer-1);
			}
		}
	}
}