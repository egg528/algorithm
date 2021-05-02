package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;
 
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
             
            int all = N*K;
            int answer = 0;
             
             
            if(N%2 == 0){
                answer = (1+all)*(all/2);
                answer /=K;
                System.out.print("#"+test_case);
                 
                //Ãâ·Â
                for(int i = 0; i < K; i++){
                    System.out.print(" "+answer);
                }
                System.out.println();
            }else{
                for(int i = 1; i <= all-K; i++){
                    answer+= i;
                }
                 
                answer /= K;
                 
                System.out.print("#"+test_case);
                for(int i = 1; i <= K; i++){
                    System.out.print(" "+(answer+all-K+i));
                }
                System.out.println();
            }
             
             
        }
    }
}