package exercise;

import java.util.*;


public class Main {
	public static class Project{
		int progress;
		int speed;
		public Project(int progress, int speed) {
			this.progress = progress;
			this.speed = speed;
		}
	}
    public static int[] solution(int[] progresses, int[] speeds) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	Queue<Project> queue = new LinkedList<>();
    	for (int i = 0; i < progresses.length; i++) {
    		queue.add(new Project(progresses[i], speeds[i]));
    	}
    	
    	Project first;
    	int remain;
    	int time;
    	Project check;
    	int k; 
    	
    	while(!queue.isEmpty()) {
    		k = 0;
    		first = queue.poll();
    		k++;
    		remain = 100-first.progress;
    		if(remain%first.speed == 0) {
    			time = remain/first.speed;
    		}else {
    			time = (remain/first.speed) + 1;
    		}
    		if (!queue.isEmpty()) {
    		check = queue.peek();
    		while( 100 <= check.progress + (check.speed*time)) {
    			queue.poll();
    			k++;
    			check = queue.peek();
    			if(check == null) {
    				break;
    			}
    			}
    		}
    		arr.add(k);
    	}
    	int[] answer = new int[arr.size()];
    	for (int i = 0; i < answer.length; i++) {
    		answer[i] = arr.get(i);
    	}
    	return answer;
    	
    }

	public static void main(String[] args) { 	
		int[] a = {95, 90, 99, 99, 80, 99};
		int[] b = {1, 1, 1, 1, 1, 1};
		
		int[] arr = solution(a, b);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}