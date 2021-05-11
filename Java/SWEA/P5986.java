package SWEA;

import java.util.*;

class Solution
{
    
    static int answer = 0;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        boolean[] sample = new boolean[1001];
        
        // 1000������ �Ҽ� �迭
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 2; i < sample.length; i++){
        	if(!sample[i]){
                arr.add(i);
            	for(int k = i+i; k < sample.length; k+=i){
                	sample[k] = true;
                }
            }
        }
        

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            
            answer = 0;
            
            dfs(arr, 0, 0, N, 0);
            
            System.out.println("#"+test_case+" "+answer);
		

		}
	}
    
    public static void dfs(ArrayList<Integer> arr, int index, int nowCnt, int goal, int sum){
    	// 3�� ��� �� ��Ȳ
        if(nowCnt == 3){
        	if(goal == sum){
            	answer++;
            }
            return;
        }
        
        // 3�� ���� �ʰ� �迭 ���� �ٴٸ� ��Ȳ
        if(index == arr.size()){
        	return;
        }
        
        // 3���� ������ �ʾҴµ� ��ǥ������ ���ų� ū ��Ȳ
        if(goal <= sum){
        	return;
        }
        
        if(sum+arr.get(index) <= goal){
        	dfs(arr, index+1, nowCnt, goal, sum);
        }
        if(sum+arr.get(index) <= goal){
        	dfs(arr, index+1, nowCnt+1, goal, sum+arr.get(index));
        }
        if(nowCnt == 0 || (nowCnt == 1 && sum+(arr.get(index)*2) == goal)){
        	dfs(arr, index+1, nowCnt+2, goal, sum+(arr.get(index)*2));
        }
        if(nowCnt == 0 && (arr.get(index)*3) == goal){
        	dfs(arr, index+1, nowCnt+3, goal, sum+(arr.get(index)*3));
        }
    }
}