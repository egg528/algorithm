import java.util.*;

class Solution {
    public static class File{
        int loc;
        int pri;
        
        public File(int loc, int pri){
            this.loc = loc;
            this.pri = pri;
        }
    }
	public int solution(int[] priorities, int location) {
        ArrayList<File> arr = new ArrayList<File>();
        ArrayList<File> result = new ArrayList<File>();
        for(int i = 0; i < priorities.length; i++) {
        	arr.add(new File(i, priorities[i]));
        }
        
        File check;
        int priority;
        while(!arr.isEmpty()) {
        	check = arr.remove(0);
        	
            if(arr.isEmpty()) {
        		result.add(check);
        		break;
        	}
        	
        	for(int i = 0; i < arr.size(); i++) {
        		if(check.pri < arr.get(i).pri) {
        			arr.add(check);
        			break;
        		}
                
        		if(i == arr.size()-1) {
        			result.add(check);
        		}
        	}
        }
        int answer = 0;
        for(int i = 0; i < result.size(); i++) {
            if(result.get(i).loc == location){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}