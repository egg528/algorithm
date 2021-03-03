package SWEA;

import java.util.*;
import java.io.FileInputStream;

class Solution
{    
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        String[] arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
        
        ArrayList<String> arr2 = new ArrayList<String>();
        
        for(int i = 0; i < arr.length; i++){
        	arr2.add(arr[i]);
        }


		for(int test_case = 1; test_case <= T; test_case++)
		{
			String test = sc.next();
            int num = sc.nextInt();
            ArrayList<Temp> answer = new ArrayList<Temp>();
            
            for(int i = 0; i < num; i++){
                String str = sc.next();
                answer.add(new Temp(str, arr2.indexOf(str)));
            }
            
            Collections.sort(answer);
            
            
            System.out.println(test);
            
            
            for(int i = 0; i < answer.size(); i++){
            	System.out.print(answer.get(i).str+" ");
            }
            System.out.println();
            

		}
	}
    
    public static class Temp implements Comparable<Temp>{
    	String str;
        int index;
        
        public Temp(String str, int index){
            this.str = str;
            this.index = index;
        }
        public int compareTo(Temp o) {
			return (index < o.index) ? -1 : ((index==o.index) ? 0 : 1);
		}
    }
}