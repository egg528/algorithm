import java.util.*;

class Solution
{
    static int answer;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);



		for(int test_case = 1; test_case <= 10; test_case++)
		{	
            int t = sc.nextInt();
            answer = 1;
			char[][] arr = new char[100][100];
            for(int i = 0; i < 100; i++){
            	arr[i] = sc.next().toCharArray();
            } 
            // °¡·Î
			for(int len = 100; answer < len; len--){
            	for(int i = 0; i < 100; i++){
                	for(int k = 0; k+len <= 100; k++){
                    	int mid = (k+ k+ len-1)/2;
                            if(len%2 == 0){
                                for(int j = 1; j <= len/2; j++){
                                	if(arr[i][mid-j+1] != arr[i][mid+j]){
                                    	break;
                                    }
                                    if(j == len/2){
                                    	answer = Math.max(answer, len);
                                    }
                                }
                            }else{
                                for(int j = 1; j <= len/2; j++){
                                	if(arr[i][mid-j] != arr[i][mid+j]){
                                    	break;
                                    }
                                    if(j == len/2){
                                    	answer = Math.max(answer, len);
                                    }
                                }
                            }
                    }
                }
            }
			for(int len = 100; answer < len; len--){
            	for(int i = 0; i < 100; i++){
                	for(int k = 0; k+len <= 100; k++){
                    	int mid = (k+ k+ len-1)/2;
                            if(len%2 == 0){
                                for(int j = 1; j <= len/2; j++){
                                	if(arr[mid-j+1][i] != arr[mid+j][i]){
                                    	break;
                                    }
                                    if(j == len/2){
                                    	answer = Math.max(answer, len);
                                    }
                                }
                            }else{
                                for(int j = 1; j <= len/2; j++){
                                	if(arr[mid-j][i] != arr[mid+j][i]){
                                    	break;
                                    }
                                    if(j == len/2){
                                    	answer = Math.max(answer, len);
                                    }
                                }
                            }
                    }
                }
            }
			
			System.out.println("#"+t + " " +answer);
	}
    }   
}