package SWEA;

import java.util.ArrayList;
import java.util.Scanner;


class Main{
	
	    static ArrayList<String> arr = new ArrayList<String>();
	    
		public static void main(String args[]) throws Exception{

	        arr.add("a");
	        arr.add("e");
	        arr.add("i");
	        arr.add("o");
	        arr.add("u");
	        
	        
			Scanner sc = new Scanner(System.in);
			int T;
			T=sc.nextInt();

			for(int test_case = 1; test_case <= T; test_case++)
			{
			
				StringBuilder str = new StringBuilder(sc.next());
	            
	            for(int i = 0; i < str.length(); i++){
	            	String temp = str.substring(i, i+1);
	                if(arr.contains(temp)){
	                	str.deleteCharAt(i);
	                    i--;
	                    
	                }
	            }
	            
	            System.out.println(str.toString());
			}
		}
}