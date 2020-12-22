from collections import deque

N, E, start = map(int, input().split())

graph = [[] for _ in range(N+1)]

for _ in range(E):
    a, b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(N):
    graph[i].sort()


visited1 = [False] * (N+1)
visited2 = [False] * (N+1)


def DFS(graph, visited, start):

    visited[start] = True
    print(start, end=' ')

    for i in graph[start]:
        if visited[i] == False:
            DFS(graph, visited, i)

def BFS(graph, visited, start):
    queue = deque()
    queue.append(start)

    print(start, end=" ")
    visited2[start] = True

    while queue:
        v = queue.popleft()

        for i in graph[v]:
            if visited[i] == False:
                print(i, end=" ")
                visited[i] = True
                queue.append(i)



DFS(graph, visited1, start)
print()
BFS(graph, visited2, start)

