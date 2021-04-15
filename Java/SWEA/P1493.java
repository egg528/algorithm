package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    
    public static int[] startY(int p, int y, int num){
    	if(p == num){
            int[] arr = {y, num};
        	return arr;
        }
        if(p < num){
            int[] arr = {y-1, num-y+1};
        	return arr;
        }
        
        return startY(p, y+1, num+y);
    }
    
    public static int searchNum(int x, int y) {
    	int num = 1;
    			
    	for(int i = 1; i < y; i++) {
    		num+=i;
    	}
    	
    	for(int i = 1; i < x; i++) {
    		num += y+i;
    		
    	}
    	
    	return num;
    }
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int p = sc.nextInt();
            int q = sc.nextInt();
            
            int[] arrP = startY(p, 1, 1);
            int[] arrQ = startY(q, 1, 1);
            
            int[] xyP = {1, arrP[0]};
            int[] xyQ = {1, arrQ[0]};

            while(p != arrP[1]){
            	arrP[1]++;
                xyP[0]++;
                xyP[1]--;
            }
            
            while(q!= arrQ[1]){
            	arrQ[1]++;
                xyQ[0]++;
                xyQ[1]--;
            }
            
            int[] xy = {xyP[0]+xyQ[0], xyP[1]+xyQ[1]};
            
            int answer = searchNum(xy[0], xy[1]);
            
            System.out.println("#"+test_case+" "+answer);
            
		}
	}
}