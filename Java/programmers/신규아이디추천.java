package programmers;


import java.util.*;

class Main {
	public static void main(String[] args) {
		String id = "abcdefghijklmn.p";
		id  = id.toLowerCase();
		
		StringBuilder sb = new StringBuilder(id);
		
		for(int i = 0; i < sb.length(); i++) {
			if(97 <= sb.charAt(i) && sb.charAt(i) <= 122) {
				
			}else if(48 <= sb.charAt(i) && sb.charAt(i) <= 57) {
				
			}else if (sb.charAt(i) == '-' || sb.charAt(i) == '_' || sb.charAt(i) == '.') {
				
			}else{
				sb.deleteCharAt(i);
				i--;
			}
		}
		
		
		for(int i = 1; i < sb.length(); i++) {
			if(sb.charAt(i) == '.' && sb.charAt(i) == sb.charAt(i-1)) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		
		if(sb.charAt(0) == '.') {
			sb.deleteCharAt(0);
		}
		
		if(sb.charAt(sb.length()-1) == '.') {
			sb.deleteCharAt(sb.length()-1);
		}
		
		if(sb.length() == 0) {
			sb.append("a");
		}
		System.out.println(sb.substring(0, 4));
		if(16 < sb.length()) {
			sb = new StringBuilder(sb.substring(0, 12));
		}
		System.out.println(sb);
		if(sb.charAt(sb.length()-1) == '.') {
			sb.deleteCharAt(sb.length()-1);
		}
		
		while(sb.length() < 3) {
			sb.append(sb.charAt(sb.length()-1));
		}
		
		id = sb.toString();
		System.out.println(sb);

    }
}