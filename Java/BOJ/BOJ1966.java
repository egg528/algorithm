package BOJ;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = sc.nextInt();
		
		for (int t = 0; t < Test; t++) {
			int num = sc.nextInt();
			int where = sc.nextInt();
			ArrayList<int[]> arr = new ArrayList<int[]>();
			ArrayList<int[]> sequence = new ArrayList<int[]>();
			
			for (int i = 0; i <num; i++) {
				arr.add(new int[] {sc.nextInt(), i});
			}
			
			while (arr.size() != 0) {
				int[] first = arr.get(0);
				for (int i = 1; i < arr.size(); i++) {
					if(first[0] < arr.get(i)[0]) {
						arr.remove(0);
						arr.add(first);
						break;
					}
				}
				if(first == arr.get(0)) {
					sequence.add(first);
					arr.remove(0);
				}
								
			}
			for(int i = 0; i < sequence.size(); i++) {
				if (where == sequence.get(i)[1]) {
					System.out.println(i+1);
				}
			}
		}

	}
}