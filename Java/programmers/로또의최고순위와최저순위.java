package programmers;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int unknown = 0;
        int match = 0;
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                unknown++;
            }else{
                for(int k = 0; k < win_nums.length; k++){
                    if(lottos[i] == win_nums[k]){
                        match++;
                        win_nums[k] = 0;
                        break;
                    }
                }
            }
        }
        int min = -1;
        int max = -1;
        
        if(match == 6){
            min = 1;
        }else if(match == 5){
            min = 2;
        }else if(match == 4){
            min = 3;
        }else if(match == 3){
            min = 4;
        }else if(match == 2){
            min = 5;
        }else{
            min = 6;
        }
        
        if(match+unknown == 6){
            max = 1;
        }else if(match+unknown == 5){
            max = 2;
        }else if(match+unknown == 4){
            max = 3;
        }else if(match+unknown == 3){
            max = 4;
        }else if(match+unknown == 2){
            max = 5;
        }else{
            max = 6;
        }
        
        
        return new int[] {max, min};
    }
}