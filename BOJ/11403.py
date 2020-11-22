import sys
input = sys.stdin.readline
from collections import deque

V = int(input())

graph = [[]]
for _ in range(V):
    graph.append(list(map(int, input().split())))

edge = [[] for _ in range(V+1)]
for i in range(1,V+1):
    for j in range(V):
        if graph[i][j] == 1:
            edge[i].append(j+1)
            graph[i][j] = 0
visited = [False]*(V+1)


def BFS(graph, edge, V, start):
    visited = [False]*(V+1)
    queue = deque()
    queue.append(start)

    while queue:
        now = queue.popleft()
        for i in edge[now]:
            if visited[i] == False:
                visited[i] = True
                queue.append(i)
                graph[start][i-1] = 1

for i in range(1,V+1):
    BFS(graph, edge, V, i)

for i in range(1, V+1):
    for j in range(V):
        print(graph[i][j], end=" ")
    print()
