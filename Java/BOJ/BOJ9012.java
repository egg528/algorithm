package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();

			int check = 0;
			for(int k = 0; k < str.length(); k++) {

				if(check < 0) {
					System.out.println("NO");
					break;
				}
				
				if(str.substring(k, k+1).equals("(")) {
					check++;
				}else {
					check--;
				}
				
				if(k == str.length()-1 && check == 0) {
					System.out.println("YES");
				}else if(k == str.length()-1 && check != 0){
					System.out.println("NO");
				}
			}
		}
	}
}
