package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int test = sc.nextInt();
            int minusNum = 1;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 0; i < 8; i++){
            	arr.add(sc.nextInt());
            }
            
            
            
            while(true){
            	int first = arr.get(0);
                if(0 < first-minusNum){
                	arr.remove(0);
                    arr.add(first-minusNum);
                }else{
                	arr.remove(0);
                    arr.add(0);
                    break;
                }
                

                if(minusNum == 5){
                	minusNum = 1;
                }else{
                	minusNum++;
                }
            }
            
            System.out.print("#"+test+" ");
            for(int i = 0; i < 8; i ++){
            	System.out.print(arr.get(i)+" ");
            }
            
            System.out.println();
		}
	}
}