package programmers;

class Solution {
    
    static int answer = 0;
    
    public int solution(int[] nums) {
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        
        boolean[] check = new boolean[sum+1];
        check[0] = true;
        check[1] = true;
        
        for(int i = 2; i <= sum/2; i++){
            if(!check[i]){
                for(int k = 2*i; k <= sum; k += i){
                    check[k] = true;
                }
            }
        }
        
        answer = 0;
        
            bfs(check, nums, 3, 0, 0, 0);    
        
        
        
        return answer;

    }
    
    public static void bfs(boolean[] check, int[] nums, int max, int cnt, int now, int sum){
        if(max == cnt){
            if(!check[sum]){
                answer++;
            }
            return;
        }
        if(now == nums.length){
            return;
        }
        
        bfs(check, nums, max, cnt+1, now+1, sum+nums[now]);
        bfs(check, nums, max, cnt, now+1, sum);
        
        return;
    }
}