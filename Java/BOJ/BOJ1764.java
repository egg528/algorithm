package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		int noHear = Integer.valueOf(arr[0]);
		int noSee = Integer.valueOf(arr[1]);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int answer = 0;
		
		for(int i = 0; i < noHear; i++) {
			map.put(br.readLine(), 1);
		}
		
		
		ArrayList<String> answerArr = new ArrayList<String>();
		
		for(int i = 0; i < noSee; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				answerArr.add(str);
				answer++;
			}
		}
		
		Collections.sort(answerArr);
		
		System.out.println(answer);
		for(int i = 0; i < answerArr.size(); i++) {
			System.out.println(answerArr.get(i));
		}
	}
}