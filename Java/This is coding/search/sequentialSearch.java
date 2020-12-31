package BOJ;

public class Main {	
	
	public static int sequentialSearch(int target, int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if(target == array[i]) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	}
}