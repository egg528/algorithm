V = int(input())

E = int(input())

graph = [[] for i in range(V+1)]
visited = [False]*(V+1)

for _ in range(E):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


count = 0

def DFS(graph, i, visited):
    global count
    visited[i] = True

    for j in graph[i]:
        if visited[j] == False:
            visited[j] = True
            count += 1
            DFS(graph, j, visited)


DFS(graph, 1, visited)
print(count)

