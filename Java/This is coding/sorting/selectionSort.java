package BOJ;

public class Main {	
	public static void main(String[] args){
		int[] arr = {3,2,5,6,8,7,4,2,4,5};
		
		int min_index;
		
		for(int i = 0; i < arr.length-1; i++) {
			min_index = i;
			for(int j = i; j <arr.length; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;		
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}