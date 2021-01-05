class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = { 31,29,31,30,31,30,31,31,30,31,30,31 };
        
        if(a == 1) {
            answer = day[b%7];
        }else {
            int k = 0;
            for(int i = 0; i < a-1; i++) {
                k += month[i];
            }
            k += b;
            answer = day[k%7];
        }
        
        return answer;
    }
}