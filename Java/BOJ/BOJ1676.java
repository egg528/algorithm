package BOJ;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int two = 0;
		int five = 0;
		
		for(int i = 1; i <= N; i++) {
			int temp = i;
			while(temp%2 == 0) {
				temp = temp/2;
				two++;
			}
			while(temp%5 == 0) {
				temp = temp/5;
				five++;
			}
		}
		
	
			System.out.println((two < five)? two : five);
		
	}
}