package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

class Main{
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		
		for(int i = 1; i <= N; i++) {
			String name = br.readLine();

			map1.put(name, String.valueOf(i));
			map2.put(String.valueOf(i), name);
		}
		
		for(int i = 0; i < M; i++) {
			String order = br.readLine();
			if(map1.containsKey(order)) {
				System.out.println(map1.get(order));
			}else {
				System.out.println(map2.get(order));
			}
		}
	}
}
