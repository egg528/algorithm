package programmers;

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i : moves) {
            i -= 1;
            for(int j = 0; j < board.length; j++){
                if(board[j][i] != 0){
                    result.add(board[j][i]);
                    board[j][i] = 0;
                    break;
                }
            }
        }
        for(int i = 0; i < result.size()-1; i++) {
            if(result.get(i)== result.get(i+1)){
                result.remove(i);
                result.remove(i);
                answer += 2;
                i = -1;
            }
        }
        
        return answer;
    }
}