package BOJ;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			map.put(temp[0], temp[1]);
		} 
		
		for(int i = 0; i < M; i++) {
			bw.write(map.get(br.readLine())+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
		
	}
}