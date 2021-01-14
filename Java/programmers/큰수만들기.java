import java.util.*;


class Solution {    
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
		char[] arr = number.toCharArray();
        int len = arr.length-k;
        
        
        int index = -1;
        int max = -1;
    
        
        while(len != 0) {
        	max = -1;
        	for(int i = index+1; i <= arr.length-len; i++) {
        		if(max < Character.getNumericValue(arr[i])) {
        			max = Character.getNumericValue(arr[i]);
        			index = i;
                    if(max == 9) break;
        		}
        	}
        	answer.append(String.valueOf(max));
        	len--;
        }
        
        
		return answer.toString();
    }
}