package BOJ;

public class Main {	
	
	public static int binarySearch_recursion(int target, int[] array, int start, int end) {
		if (end < start) return -1;
	
		int mid = (start + end)/2;
		
		if (array[mid] < target) {
			return binarySearch_recursion(target, array,mid+1, end);
		}else if (array[mid] == target) {
			return mid+1;
		}else {
			return binarySearch_recursion(target, array, start, mid-1);
		}
	}
	public static int binarySearch_for(int target, int[] array, int start, int end) {
		while (start<= end) {
			int mid = (start + end)/2;
			
			if (target == array[mid]) {
				return mid+1;
			}else if(target < array[mid]) {
				end = mid-1;
			}else {
				start = mid +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
	}
}