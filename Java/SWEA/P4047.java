package SWEA;

import java.util.*;
import java.io.*;


class Solution{
	public static void main(String args[]) throws Exception{
			
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
		

		for(int test_case = 1; test_case <= T; test_case++){
            
            String deck = br.readLine();
            boolean[] S = new boolean[14];
            boolean[] D = new boolean[14];
            boolean[] H = new boolean[14];
            boolean[] C = new boolean[14];
            
            boolean error = false;
            
            for(int i = 0; i < deck.length()/3; i++){
            	String card = deck.substring(i*3, i*3+3);
                
                String kind = card.substring(0, 1);
                int num = Integer.valueOf(card.substring(1, 3));
                
                if(kind.equals("S")){
                	if(S[num] == false){
                    	S[num] = true;
                    }else{
                    	System.out.println("#"+test_case+" "+"ERROR");
                        error = true;
                        break;
                    }
                }else if(kind.equals("D")){
                    if(D[num] == false){
                    	D[num] = true;
                    }else{
                    	System.out.println("#"+test_case+" "+"ERROR");
                        error = true;
                        break;
                    }                
                }else if(kind.equals("H")){
                    if(H[num] == false){
                    	H[num] = true;
                    }else{
                    	System.out.println("#"+test_case+" "+"ERROR");
                        error = true;
                        break;
                    }
                }else{
                    if(C[num] == false){
                    	C[num] = true;
                    }else{
                    	System.out.println("#"+test_case+" "+"ERROR");
                        error = true;
                        break;
                    }                
                }
            }
            if(error == false){
                int cntS = 13;
                int cntD = 13;
                int cntH = 13;
                int cntC = 13;

                for(int i = 1; i <= 13; i++){
                    if(S[i] == true){
                        cntS--;
                    }
                    if(D[i] == true){
                        cntD--;
                    }
                    if(H[i] == true){
                        cntH--;
                    }
                    if(C[i] == true){
                        cntC--;
                    }
                }
            	System.out.println("#"+test_case+" "+cntS+" "+cntD+" "+cntH+" "+cntC);
            }
		}
	}
}