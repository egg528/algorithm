package SWEA;

import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String[] NM = br.readLine().split(" ");
            int N = Integer.valueOf(NM[0]);
            int M = Integer.valueOf(NM[1]);
            
            int[] prices = new int[N+1];
            int[] weights = new int[M+1];
            
            // 가격
            for(int i = 1; i <= N; i++){
            	prices[i] = Integer.valueOf(br.readLine());
            }
            
            // 무게
            for(int i = 1; i <= M; i++){
            	weights[i] = Integer.valueOf(br.readLine());
            }
            
            // 주차장
            int[] parkingLot = new int[N+1];
            Queue<Integer> wait = new LinkedList<>();
            
            int profit = 0;
            
            for(int i = 0; i < 2*M; i++){
            	int car = Integer.valueOf(br.readLine());
                
                if(car < 0){
                    car *= -1;
                    for(int k = 1; k <= N; k++){
                    	if(parkingLot[k] == car){
                        	parkingLot[k] = 0;
                            if(!wait.isEmpty()){
                                int newCar = wait.poll();
                            	parkingLot[k] = newCar;
                                profit += prices[k] * weights[newCar];
                            }
                            break;
                        }
                    }
                }else{
                    boolean isFull = true;
                    for(int k = 1; k <= N; k++){
                    	if(parkingLot[k] == 0){
                        	parkingLot[k] = car;
                            profit += prices[k] * weights[car];
                            isFull = false;
                            break;
                        }
                    }
                    if(isFull){
                    	wait.add(car);
                    }
                }
                
            }
            System.out.println("#"+test_case+" "+profit);
		}
	}
}