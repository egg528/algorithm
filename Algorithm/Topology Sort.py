from collections import deque

v, e = map(int, input().split())

indegree = [0] * (v+1)

graph = [[] for i in range(v+1)]

for i in range(e):
    a, b = map(int, input().split())
    indegree[b] += 1
    graph[a].append(b)

def topology_sort():
    result = []
    q = deque()

    for i in range(1, v+1):
        if indegree[i] == 0:
            q.append(i)

    while q:
        now = q.popleft()
        result.append[now]
        for i in graph[now]:
            indegree[i] -= 1
            if indegree[i] == 0:
                q.append(i)

    for i in result:
        print(e, end=' ')

topology_sort()