class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] cloth = new int[n+1];
        for(int i : lost) {
            cloth[i] -= 1;
        }
        for(int i : reserve) {
            cloth[i] += 1;
        }
        
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (0 <= cloth[i]){
                answer++;
            }else if (cloth[i-1] == 1) {
                answer++;
            }else if (i+1 <= n && cloth[i+1] == 1) {
                answer++;
                cloth[i+1]-=1;
            }
        }
        return answer;
    }
}