package programmers;

import java.util.List;
import java.util.ArrayList;


//ArrayList¸¦ È°¿ë
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        List<String> par = new ArrayList<String>();
        
        for(int i = 0; i < participant.length; i++) {
            par.add(participant[i]);
        }
        
        for(int i = 0; i < completion.length; i++) {
            par.remove(completion[i]));
        }
        answer = par.get(0);
        return answer;
    }
}


import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for(int i = 0; i < participant.length; i++) {
            boolean compelete= false;
            for(int j = 0; j < completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                    compelete = true;
                    completion[j] = "check";
                    break;
                }
            }
            if(!compelete) {
                answer = participant[i];
                return answer;
            }
        }
        return answer;
    }
}


import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                return answer;
            }
        }
        answer = participant[participant.length-1];
        return answer;
    }
}


