package BOJ;

import java.io.*;
import java.util.*;

class Main{	
	
	static String answer = "";
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		// �迭 ����
		String[][] arr = new String[N][N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().split("");
		}
		
		recursive(arr, N, 0, 0);
		
		System.out.println(answer);
	}
	
	
	//��� �Լ�
	static void recursive(String[][] arr, int N, int startRow, int startCol) {
		
		// �迭 ���� ��� ������ Ȯ��
		boolean isSame = true;
		String first = arr[startRow][startCol];
		
		for(int i = startRow; i < startRow+N; i++) {
			for(int j = startCol; j < startCol+N; j++) {
				if(!arr[i][j].equals(first)) {
					isSame = false;
					break;
				}
			}
			if(!isSame) {
				break;
			}
		}
		
		// ��� ���� ��� 0 or 1 �߰�
		if(isSame) {
			answer += first; 
			
		// �ٸ� ��� ����	
		}else {
			answer += "(";
			recursive(arr, N/2, startRow, startCol);
			recursive(arr, N/2, startRow, startCol+N/2);
			recursive(arr, N/2, startRow+N/2, startCol);
			recursive(arr, N/2, startRow+N/2, startCol+N/2);
			answer += ")";
		}
	}
}