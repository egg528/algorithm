class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        for(int i = 0; i < arr.length; i++){
            int temp = 2;
            while(arr[i] != 1){
                if(arr[i]%temp == 0){
                    arr[i]/=temp;
                    answer *= temp;
                    for(int k = i+1; k < arr.length; k++){
                        if(arr[k]%temp == 0){
                            arr[k] /= temp;
                        }
                    }
                }else{
                    temp ++;
                }   
            }
        }
        return answer;
    }
}