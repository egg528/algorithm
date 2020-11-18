import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def DFS(graph, visited, start):
    visited[start] = True

    for i in graph[start]:
        if visited[i] == False:
            DFS(graph, visited, i)

def BFS(graph, visited, start):
    queue = deque()
    queue.append(start)
    visited[start] = True

    while queue:
        now = queue.popleft()
        for i in graph[now]:
            if visited[i] == False:
                visited[i] = True
                queue.append(i)

V, E = map(int, input().split())

graph = [[]for _ in range(V+1)]
visited = [False]*(V+1)
count = 0

for i in range(E):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1, V+1):
    if visited[i] == False:
        DFS(graph, visited, i)
        count += 1

print(count)