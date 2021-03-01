package SWEA;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		for(int i = 0; i < 5; i++){
            if(0 < i){
            	System.out.println();
            }
        	for(int k = 0; k < 5; k++){
            	if(i == k){
                	System.out.print("#");
                }else{
                	System.out.print("+");
                }
            }        
        }
	}
}