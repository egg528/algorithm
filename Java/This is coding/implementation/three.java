package BOJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//입력 받기	
		String str = sc.next();
		char[] dir = str.toCharArray();
		
		Map<String, Integer> cols = new HashMap<String, Integer>();
		cols.put("a", 1);
		cols.put("b", 2);
		cols.put("c", 3);
		cols.put("d", 4);
		cols.put("e", 5);
		cols.put("f", 6);
		cols.put("g", 7);
		cols.put("h", 8);
		
		int row = Integer.valueOf(String.valueOf(dir[1]));		
		int col = cols.get(String.valueOf(dir[0]));
		
		int count = 0;
		
		int[][] experiment = {
				{2, 1}, {2, -1}, {-2, -1}, {-2, 1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}  
		}; 
		
		for (int[] i : experiment) {
			if(0 < row+i[0] && row+i[0] <= 8
					&& 0 < col+i[1] && col+i[1] <= 8 ) {
				count+=1;
			}
		}
		System.out.println(count);		
	}
}