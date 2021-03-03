package SWEA;

import java.util.Scanner;

class Main
{
    public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int no = sc.nextInt();
            int answer = 0;
			int[][] arr = new int[100][100];
            
            for(int i = 0; i < 100; i++){
            	for(int k = 0; k < 100; k++){
                	arr[i][k] = sc.nextInt();
                }
            }
            
            
            for(int i = 0; i < 100; i++){
            	int row = 0;
                while(row < 100){
                	if(arr[row][i] == 1){
                    	row++;
                        while(row<100){
                            if(arr[row][i] == 2){
                            	answer++;
                                row++;
                                break;
                            }
                            row++;
                        }
                    }else{
                    	row++;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + answer);
            

		}
	} 
}