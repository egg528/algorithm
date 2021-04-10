package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Main
{
	static int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			for(int i = 1; i < month; i++) {
				day += days[i];
			}
			int answer = (day%7);
			
			if(answer <= 3) {
				System.out.println("#"+test_case+" "+ (answer+3));
			}else {
				System.out.println("#"+test_case+" "+(answer-4));
			}

		}
	}
}