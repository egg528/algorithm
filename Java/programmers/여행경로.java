import java.util.*;

class Solution {
    static String[] answer;
    static ArrayList<String> real = new ArrayList<String>();
    
    
    public static void DFS(String[][] tickets, boolean[] use, String start, int k){
        if(k == tickets.length){
            answer[tickets.length] = start;
            String temp = "";
            for(int i = 0; i < answer.length; i++){
                temp += answer[i] + " ";
            }
            real.add(temp);
            return;
        }
        
        
        for(int i = 0; i < tickets.length; i++){
            if(start.equals(tickets[i][0]) && use[i] == false){
                use[i] = true;
                answer[k] = start;
                DFS(tickets, use, tickets[i][1], k+1);
                use[i] = false;
            }
        }
        
        return;
    }
    
    public String[] solution(String[][] tickets) {
        
        answer = new String[tickets.length+1];
        answer[0] = "ICN";
        
        for(int i = 0; i<tickets.length; i++){
            if(tickets[i][0].equals("ICN")){
                boolean[] use = new boolean[tickets.length];
                use[i] = true;
                DFS(tickets, use, tickets[i][1] , 1);
            }
        }
        
        Collections.sort(real);
        
        answer = real.get(0).split(" "); 
        
        
        return answer;
        
    }
}