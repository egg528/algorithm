package SWEA;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			String num = sc.next();
            
            int firstNum = Integer.valueOf(num.substring(num.length()-1, num.length()));
            
            if(firstNum%2 == 0){
            	System.out.println("#"+test_case+" "+"Even");
            }else{
            	System.out.println("#"+test_case+" "+"Odd");
            }

		}
	}
}