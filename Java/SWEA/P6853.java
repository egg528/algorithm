package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            // 사각형 입력 받기
			String[] square = br.readLine().split(" ");
           	int x1 = Integer.valueOf(square[0]);
            int y1 = Integer.valueOf(square[1]);
            int x2 = Integer.valueOf(square[2]);
            int y2 = Integer.valueOf(square[3]);
            
			// case 1,2,3
            int one = 0;
            int two = 0;
            int three = 0;
            
            int N = Integer.valueOf(br.readLine());
            
            for(int i = 0; i < N; i++){
            	String[] dot = br.readLine().split(" ");
             	
                int x = Integer.valueOf(dot[0]);
                int y = Integer.valueOf(dot[1]);
                
                if(x1 < x && x < x2&& y1 < y && y < y2){
                	one++;
                }else if((x == x1 && y1 <= y && y <= y2) ||
                          (x == x2 && y1 <= y && y <= y2) ||
                          (y == y1 && x1 <= x && x <= x2) ||
                          (y == y2 && x1 <= x && x <= x2)){
                	two++;
                }else{
                	three++;
                }
            }
            System.out.println("#"+test_case+" "+one+" "+two+" "+three);
		}
	}
}