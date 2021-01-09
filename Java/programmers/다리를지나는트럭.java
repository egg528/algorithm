package exercise;

import java.util.*;


public class Main {
	public static class Truck{
		int weight;
		int dis;
		public Truck(int weight) {
			this.weight = weight;
			this.dis = 0;
		}
	}
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
    	Queue<Truck> wait = new LinkedList<>();
    	ArrayList<Truck> bridge = new ArrayList<Truck>();
    	
    	for(int i = 0; i < truck_weights.length; i++) {
    		wait.add(new Truck(truck_weights[i]));
    	}
    	int k = 0;
    	int now;
    	Truck first;
    	while(!wait.isEmpty() || !bridge.isEmpty()) {
    		now = 0;
    		if(!bridge.isEmpty()) {
        		first = bridge.get(0);
        		if(first.dis == bridge_length) {
        			bridge.remove(0);
        		}
        	}
    		
    		if(!bridge.isEmpty()) {
    		for(int i = 0; i < bridge.size(); i++) {
    			now += bridge.get(i).weight;
    			}
    		}
    		
    		if(!wait.isEmpty()) {
    		first = wait.peek();
    		if(first.weight + now <= weight) {
    			bridge.add(wait.poll());
    			}
    		}
    		
    		for(int i = 0; i < bridge.size(); i++) {
    			bridge.get(i).dis += 1;
    		}
    		k++;
    	}
    	
    	return k;

    	
    }

	public static void main(String[] args) { 	
		int a =100;
		int b =100;
		int[] c = {10};
		
		System.out.println(solution(a,b,c));
		
		

	}
}