package BOJ;

import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++){
			String str = sc.next();
			if(!arr.contains(str)) {
				arr.add(str);
			}
		}
		
		Collections.sort(arr);
		
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int o1len = o1.length();
				int o2len = o2.length();
				
				return (o1len < o2len)? -1 : ((o1len == o2len)? 0:1);
				

			}});
		
	
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
    }
}