package BOJ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int gw = 0;
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			char[] arr = str.toCharArray();
			ArrayList<String> list = new ArrayList<String>();
			Set<String> av = new HashSet<String>();
			
			char keep = arr[0];
			list.add(String.valueOf(arr[0]));
			av.add(String.valueOf(arr[0]));
			
			for(int j = 1; j < arr.length; j++) {
				if(keep != arr[j]) {
					keep = arr[j];
					list.add(String.valueOf(arr[j]));
					av.add(String.valueOf(arr[j]));
				}
			}	
			if(av.size() == list.size()) {
				gw += 1;
			}
		}
		System.out.println(gw);

	}
}
