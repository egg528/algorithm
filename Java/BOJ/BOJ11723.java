package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] set = new boolean[21];
		
		int num = Integer.valueOf(br.readLine());
		
		
		
		for(int i = 0; i < num; i++) {
			String[] order = br.readLine().split(" ");
			
			if(order[0].equals("add")) {
				add(set, Integer.valueOf(order[1]));
			}else if(order[0].equals("remove")) {
				remove(set, Integer.valueOf(order[1]));
			}else if(order[0].equals("check")) {
				if(set[Integer.valueOf(order[1])]) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}				
			}else if(order[0].equals("toggle")) {
				toggle(set, Integer.valueOf(order[1]));
			}else if(order[0].equals("all")) {
				all(set);
			}else if(order[0].equals("empty")) {
				empty(set);
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
			         
	}
	
	public static void add(boolean[] set, int x) {
		set[x] = true;
	}
	public static void remove(boolean[] set, int x) {
		set[x] = false;
	}

	public static void toggle(boolean[] set, int x) {
		if(set[x]) {
			set[x] = false;
		}else {
			set[x] = true;
		}
		
	}
	public static void all(boolean[] set) {
		for(int i = 0; i < set.length; i++) {
			set[i] = true;
		}
	}
	public static void empty(boolean[] set) {
		for(int i = 0; i < set.length; i++) {
			set[i] = false;
		}
	}
}