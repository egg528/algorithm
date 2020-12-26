package BOJ;

public class Main {	
	public static void quick_sort(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int pivot = start;
		int left = start + 1;
		int right = end;
		while (left<=right) {
			while (left <= end && arr[left] <= arr[pivot]) {
				left += 1;
			}
			while (start < right && arr[right] >= arr[pivot]) {
				right-=1;
			}
			if (left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}	
		}
		quick_sort(arr, start, right-1);
		quick_sort(arr, right+1, end);
		
	}
	
	
	
	public static void main(String[] args){
		int[] arr = {3,2,5,6,8,7,4,2,4,5};
		
		quick_sort(arr, 0, arr.length-1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}