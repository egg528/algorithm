class Solution {
    public String solution(int n) {
        String answer = "";
        if(n%2 == 0){
            while(0 < n){
                answer += "����";
                n-= 2;
            }
        }else{
            while(1 < n){
                answer += "����";
                n -= 2;
            }
            answer+= "��";
        }
        
        return answer;
    }
}