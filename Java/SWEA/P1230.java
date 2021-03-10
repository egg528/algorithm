package SWEA;

import java.util.*;
import java.io.FileInputStream;


class Solution
{
    static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws Exception
	{


		for(int test_case = 1; test_case <= 10; test_case++)
		{
            ArrayList<Integer> code = new ArrayList<Integer>(); 
            int codeLen = sc.nextInt();
            
            for(int i = 0; i < codeLen; i++){
            	code.add(sc.nextInt());
            }
			
            int commandCnt  = sc.nextInt();
            
            for(int i = 0; i < commandCnt; i++){
            	String command = sc.next();
                if(command.equals("D")){
                	delete(code);
                }else if(command.equals("A")){
                	add(code);
                }else{
                	Insert(code);
                }
            }
             System.out.print("#"+test_case+" ");
       		 for(int i = 0; i < 10; i++){
        		System.out.print(code.get(i)+" ");
        	}  
			

		}
	}
    public static void Insert(ArrayList<Integer> code){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int index = sc.nextInt();
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++){
        	temp.add(sc.nextInt());
        }
        
        for(int i = temp.size()-1; 0 <= i; i--){
        	code.add(index, temp.get(i));
        }   
    }
    public static void delete(ArrayList<Integer> code){
    	int index = sc.nextInt();
        int cnt = sc.nextInt();
        
        for(int i = 0; i < cnt; i++){
        	code.remove(index);
        }
        
    }
    
    public static void add(ArrayList<Integer> code){
    	int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++){
        	code.add(sc.nextInt());
        }
    }
}