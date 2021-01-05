package programmers;

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int one = 0;
        int two = 0;
        int three = 0;
        int[] onearr = {1,2,3,4,5};
        int[] twoarr = {2,1,2,3,2,4,2,5};
        int[] threearr = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == onearr[i%5]) {
                one++;
            }
            if(answers[i] == twoarr[i%8]) {
                two++;
            }
            if(answers[i] == threearr[i%10]) {
                three++;
            }
        }
        
        
        int[] arr = {one, two, three};
        Arrays.sort(arr);
        int k = 1;
        
        if(arr[2] == arr[1]){
            k++;
        }
        if(arr[2] == arr[0]){
            k++;
        }
        int[] answer = new int[k];
        
        
       
        if(one < two){
            if(two < three){
                answer[0] = 3;
            }else if(two == three) {
                answer[0] = 2;
                answer[1] = 3;
            }else{
                answer[0] = 2;
            }
        }else if( one == two) {
            if( two < three){
                answer[0] = 3;
            }else if(two == three){
                answer[0] = 1;
                answer[1] = 2;
                answer[2] = 3;
            }else {
                answer[0] = 1;
                answer[1] = 2;
            }
        }else if (two < one){
            if(one < three) {
                answer[0] = 3;
            }else if(one == three) {
                answer[0] = 1;
                answer[1] = 3;
            }else {
                answer[0] = 1;
            }
        }
        return answer;
    }
}