package BOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 0; i < arr.length; i++) {
			count[Character.getNumericValue(arr[i])] += 1;
		}
		int ninesix = count[6] + count[9];
		if (ninesix%2 == 0) {
			ninesix /= 2;
		}else {
			ninesix = (ninesix/2)+1;
		}
		
		count[6] = ninesix;
		count[9] = ninesix;
		
		Arrays.sort(count);
		System.out.println(count[count.length-1]);

	}
}