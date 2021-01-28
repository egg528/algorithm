import java.util.*;

class Solution {
    public static void BFS(int k, int[][] computers, boolean[] check){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        
        while(!queue.isEmpty()){
            System.out.println(queue.toString());
            int now = queue.poll();
            check[now] = true;
            
            for(int i = now+1; i < computers[now].length; i++){
                if(computers[now][i] == 1){
                    queue.offer(i);
                }
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        if(n == 1) return 1;
        
        int network = 0;
        boolean[] check = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(check[i] == false){
                BFS(i, computers, check);
                network++;
            }
        }
        
        
        return network;
    }
}