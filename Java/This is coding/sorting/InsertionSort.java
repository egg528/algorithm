package BOJ;

public class Main {	
	public static void main(String[] args){
		int[] arr = {3,2,5,6,8,7,4,2,4,5};
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; 0 < j; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
