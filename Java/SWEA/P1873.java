package SWEA;

import java.util.*;
import java.io.*;


class Solution
{
    static String dir = "";
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.valueOf(br.readLine());


		for(int test_case = 1; test_case <= T; test_case++)
		{
           
            String[] HW = br.readLine().split(" ");
            int H = Integer.valueOf(HW[0]);
            int W = Integer.valueOf(HW[1]);
            
            String[][] map = new String[H][W];
            
            // 맵 정보 받기
            for(int i = 0; i < H; i++){
            	map[i] = br.readLine().split("");
            }
			
            // 명령어 정보 받기
            int orderCnt = Integer.valueOf(br.readLine());
           	String[] order = br.readLine().split("");
            
            // 위치 찾기
            int[] now = searchTank(map);
            
            //명령어 구현
           	for(int i = 0; i < order.length; i++){
            	
                if(order[i].equals("U")){
                    dir = "^";
                    map[now[0]][now[1]] = "^";
                    if(now[0] != 0 && map[now[0]-1][now[1]].equals(".")){
                    	map[now[0]][now[1]] = ".";
                        map[now[0]-1][now[1]] = "^";
                        now[0] = now[0]-1;
                    }
                }else if(order[i].equals("D")){
                	dir = "v";
                    map[now[0]][now[1]] = "v";
                    if(now[0] != H-1 && map[now[0]+1][now[1]].equals(".")){
                    	map[now[0]][now[1]] = ".";
                        map[now[0]+1][now[1]] = "v";
                        now[0] = now[0]+1;
                    }
                }else if(order[i].equals("L")){
                	dir = "<";
                    map[now[0]][now[1]] = "<";
                    if(now[1] != 0 && map[now[0]][now[1]-1].equals(".")){
                    	map[now[0]][now[1]] = ".";
                        map[now[0]][now[1]-1] = "<";
                        now[1] = now[1]-1;
                    }
                }else if(order[i].equals("R")){
                	dir = ">";
                    map[now[0]][now[1]] = ">";
                    if(now[1] != W-1 && map[now[0]][now[1]+1].equals(".")){
                    	map[now[0]][now[1]] = ".";
                        map[now[0]][now[1]+1] = ">";
                        now[1] = now[1]+1;
                    }
                }else if(order[i].equals("S")){
                	if(dir.equals("<")){
                        for(int k = now[1]-1; 0 <= k; k--){
                        	if(map[now[0]][k].equals("#")){
                            	break;
                            }else if(map[now[0]][k].equals("*")){
                            	map[now[0]][k] = ".";
                                break;
                            }
                        }
                    }else if(dir.equals(">")){
                        for(int k = now[1]+1; k < W; k++){
                        	if(map[now[0]][k].equals("#")){
                            	break;
                            }else if(map[now[0]][k].equals("*")){
                            	map[now[0]][k] = ".";
                                break;
                            }
                        }
                    }else if(dir.equals("^")){
                        for(int k = now[0]-1; 0 <= k; k--){
                        	if(map[k][now[1]].equals("#")){
                            	break;
                            }else if(map[k][now[1]].equals("*")){
                            	map[k][now[1]] = ".";
                                break;
                            }
                        }
                    
                    }else if(dir.equals("v")){
                        for(int k = now[0]+1; k < H; k++){
                        	if(map[k][now[1]].equals("#")){
                            	break;
                            }else if(map[k][now[1]].equals("*")){
                            	map[k][now[1]] = ".";
                                break;
                            }
                        }
                    }
                }
            }
            System.out.print("#"+test_case+" ");
            for(int i = 0; i < H; i++){
            	for(int k = 0; k < W; k++){
                	System.out.print(map[i][k]);
                }
                System.out.println();
            }
            
		}
    }
        
	public static int[] searchTank(String[][] map){
            
    	for(int i = 0; i < map.length; i++){
        	for(int k = 0; k < map[0].length; k++){
            	if(map[i][k].equals("<") || map[i][k].equals(">") || map[i][k].equals("^") || map[i][k].equals("v")){
                    dir = map[i][k];
                	return new int[] {i, k};
                }
            }
         }
		return null;
     }
}