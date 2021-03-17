package SWEA;

import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{


		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int people = sc.nextInt();
            int[] arr = new int[people];
            
            int ave = 0;
            
            for(int i = 0; i < arr.length; i++){
            	arr[i] = sc.nextInt();
                ave += arr[i];
            }
            
            ave /= people;
            
            int answer = 0;
            
            for(int i = 0; i < arr.length; i++){
            	if(arr[i] <= ave){
                	answer++;
                }
            }
			System.out.println("#" + test_case + " "+answer);
		}
	}
}
