package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            
            for(int i = 0; i < N; i++){
            	map.put(sc.next(), sc.nextInt());
            }
            
            ArrayList<String> arr = new ArrayList<String>();
            for(int i = 0; i < M; i++){
            	arr.add(sc.next());
            }
            
            Set<String> set = map.keySet();
            
            Iterator iter = set.iterator();
            long answer = 0;
            
            while(iter.hasNext()){
            	String str = (String) iter.next();
                for(int i = 0; i < arr.size(); i++){
                	String index = arr.get(i);
                    if(lotto(str, index)){
                        answer+= (long) map.get(str);
                    }
                }
            }
            
            System.out.println("#"+test_case+" "+answer);
		}
	}
    public static boolean lotto(String str1, String str2){
    	for(int i = 0; i < 8; i++){
        	String temp1 = str1.substring(i, i+1);
            String temp2 = str2.substring(i, i+1);
            
            if(temp1.equals("*")){
            }else if(temp1.equals(temp2)){
            }else{
            	return false;
            }
        }
        
        return true;
    }
}
