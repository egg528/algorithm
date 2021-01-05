package programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++) {
                if( i != j) {
                    set.add(numbers[i] + numbers[j]);
                    System.out.println(i + " " + j);
                }
            }
        }
        
        int[] answer = new int[set.size()];
        int k = 0;
        
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            answer[k] = (int)iter.next();
            k++;
        }
        
        Arrays.sort(answer);
    
        
        
        return answer;
    }
}

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                    System.out.println(i + " " + j);
            }
        }
        
        int[] answer = new int[set.size()];
        int k = 0;
        
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            answer[k] = (int)iter.next();
            k++;
        }
        
        Arrays.sort(answer);
    
        
        
        return answer;
    }
}
