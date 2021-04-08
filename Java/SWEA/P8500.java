package SWEA;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++)
		{
            int num = Integer.valueOf(br.readLine());
			String[] arr = br.readLine().split(" ");
            
            ArrayList<Integer> seat = new ArrayList<Integer>();
            
            for(int i = 0; i < arr.length; i++){
            	seat.add(Integer.valueOf(arr[i]));
            }
            
            Collections.sort(seat);
            
            int answer = (seat.get(seat.size()-1)*2)+1;
            
            for(int i = seat.size()-2; 0 <= i; i--){
            	answer+=seat.get(i)+1;
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
}