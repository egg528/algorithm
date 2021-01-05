import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int t = 0; t < commands.length; t++){
            int start = commands[t][0]-1;
            int end = commands[t][1]-1;
            int key = commands[t][2]-1;
            
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            for(int i = start; i <= end; i++){
                arr.add(array[i]);
            }
            Collections.sort(arr);
            
            answer[t] = arr.get(key);
        }
        return answer;
    }
}