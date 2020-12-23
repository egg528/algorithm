package BOJ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int K = sc.nextInt();
		 int count = 0;
		 
		 while (N != 1) {
			 if (N%K ==0) {
				 N /= K;
				 count += 1;
			 }else {
				 N -= 1;
				 count += 1;
			 }
		 }
		 System.out.println(count);
	}
}