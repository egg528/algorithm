from collections import deque
import copy
N, M = map(int, input().split())

graph = []

for _ in range(M):
    graph.append(list(map(int, input().split())))




dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]


queue = deque()

def BFS():
    while queue:
        a,b = queue.popleft()

        for i in range(4):
            x = a + dx[i]
            y = b + dy[i]
            if 0 <= x < M and 0 <= y < N and graph[x][y] == 0:
                graph[x][y] = graph[a][b] + 1
                queue.append([x, y])

for i in range(M):
    for j in range(N):
        if graph[i][j] == 1:
            queue.append((i,j))


BFS()
isTrue = False
result = -2
for i in graph:
    for j in i:
        if j == 0:
            isTrue = True
        result = max(result, j)

if isTrue == True:
    print(-1)
elif result == -1:
    print(0)
else:
    print(result - 1)