package BOJ;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int start = sc.nextInt();

        boolean[] visited1 = new boolean[N+1];
        boolean[] visited2 = new boolean[N+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i <= N+1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        DFS(graph, visited1, start);
        System.out.println();
        BFS(graph, visited2, start);
    }
    public static void DFS(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for(int i : graph.get(start)) {
            if (visited[i] == false) {
                DFS(graph, visited, i);
            }
        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = true;

        while(queue.isEmpty() == false) {
            int v = queue.poll();
            System.out.print( v + " ");
            for(int i : graph.get(v)) {
                if (visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                }
            }

        }
    }
}