package BOJ;

import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String[] NQ = br.readLine().split(" ");
		
		int N = Integer.parseInt(NQ[0]);
		int Q = Integer.parseInt(NQ[1]);
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		
		int[] sum = new int[arr.size()+1];		
		for(int i = 1; i < sum.length; i++) {
			sum[i] = sum[i-1]+arr.get(i-1);
		}
				
		for(int i = 0; i < Q; i++) {
			String[] strart_end = br.readLine().split(" ");
			
			int start = Integer.parseInt(strart_end[0]);
			int end = Integer.parseInt(strart_end[1]);
			int answer = sum[end]-sum[start-1];
			bw.write(answer + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}