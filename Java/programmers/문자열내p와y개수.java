package programmers;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if((int)arr[i] == 112 ||(int)arr[i] == 80){
                p++;
            }else if((int)arr[i] == 121 || (int)arr[i] == 89) {
                y++;
            }
        }
        
        if (p != y) {
            answer = false;
        }
        return answer;
    }
}
