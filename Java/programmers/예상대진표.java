class Solution{
    public int solution(int n, int a, int b){
        int[] arr = new int[n+1];
        
        for(int i = 1; i < n+1; i++){
            arr[i] = i;
        }
        
        int cnt = 0;
        while(arr[a] != arr[b]){
            cnt++;
            for(int i = 1; i < n+1; i++){
                if(arr[i]%2 == 0){
                    arr[i] /= 2;
                }else{
                    arr[i] = (arr[i]+1)/2;
                }
            }
        }
        return cnt;
    }
}