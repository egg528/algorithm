package BOJ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());
				
		//입력값에 따라 어떻게 움직일 지
		int[][] value = {{0,1}, {0, -1}, {-1, 0}, {1, 0}};
		Map<String, int[]> how = new HashMap<String, int[]>();
		how.put("R", value[0]);
		how.put("L", value[1]);
		how.put("U", value[2]);
		how.put("D", value[3]);
		
		String str = sc.nextLine();
		String[] command = str.split(" ");
		
		int[] now = {1, 1};
		
		for (int i = 0; i < command.length; i++) {
			int[] move = how.get(command[i]);
			
			int row = move[0];
			int col = move[1];
			
			if( 0 < now[0]+row && now[0]+row < N+1 
					&& 0 < now[1] + col && now[1] + col < N+1) {
				now[0] += row;
				now[1] += col;
			}
		}
		System.out.println(now[0] + " " + now[1]);
	}
}
