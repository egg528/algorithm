package programmers;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if (0 <= i-1 && arr[i-1] == arr[i]) {
                
            }else{
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);            
        }
        
        return answer;
    }
}
