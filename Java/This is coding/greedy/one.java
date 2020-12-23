package greedy;

public class Main {
	public static void main(String[] args) {
		int n = 1260;
		int count = 0;
		int[] list = {500, 100, 50, 10};
		
		for (int i: list) {
			if (n >= i) {
				count += n/i;
				n = n%i;
			}
		}
		System.out.println(count);
	
	}
}
