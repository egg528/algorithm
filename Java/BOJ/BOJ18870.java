package BOJ;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}	
		
		int[] answer = arr.clone();
		Arrays.sort(answer);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int idx = 0;
		for(int n : answer) {
			if(!map.containsKey(n)) {
				map.put(n, idx++);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.append(String.valueOf(map.get(arr[i])) + " ");
		}	
		bw.flush();
		br.close();
		bw.close();
	}
}
