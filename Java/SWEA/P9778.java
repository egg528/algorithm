package SWEA;

import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{	
            // ī�� ��Ȳǥ
            int[] card =  {4,4,4,4,4,4,4,4,4,16,4};
            
            int N = sc.nextInt();
            int sum = 0;
            
            // �����̰� ���� ��ġ ��� + ī�� ��Ȳ�� �ֽ�ȭ
            for(int i = 0; i < N; i++){
                int point = sc.nextInt();
                
                // ���� ���
                sum += point;
                
                // ī�� ��Ȳ�� �ֽ�ȭ
                card[point-2]--;
            }
            
            
            // Ȯ�� ���
            
            int remain = 52-N;
            int remainPoint = 21-sum;
            int answer = 0;
            
            for(int i = 0; i < card.length; i++){
            	if( i+2 <= remainPoint ){
                	answer += card[i];
                }else{
                	break;
                }
            }
            
            
            if( answer <= remain-answer ){
            	System.out.println("#"+test_case+" "+"STOP");
            }else{
            	System.out.println("#"+test_case+" "+"GAZUA");
            }
		
            

		}
	}
}