import java.util.*;

class Solution {
    static int answer = 51;
    
    public static boolean check(String a, String b){
        int cnt = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                cnt++;
            }
        }
        return cnt == 1;
    }
    
    public static void DFS(String begin, String target, String[] words, boolean[] use, int depth, int k){
        if(begin.equals(target)){
            answer = Math.min(answer, k);
            return;
        }
            
        for(int i = 0; i < words.length; i++){
            if(check(begin, words[i]) && i != depth && use[i] == false){
                use[i] = true;
                DFS(words[i], target, words, use, i, k+1);
                use[i] = false;
            }
        }
        
        return;
        
    }
    
    public int solution(String begin, String target, String[] words) {
        
        for(int i = 0; i < words.length; i++){
            if(check(begin, words[i])){
                boolean[] use = new boolean[words.length];
                use[i] = true;
                DFS(words[i], target, words, use, i, 1);
            }
        }
        if(answer == 51){
            return 0;
        }
        return answer;
    }
}