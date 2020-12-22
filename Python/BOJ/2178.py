N, M = map(int, input().split())
from collections import deque

graph = [[0]*(M+1)]

for i in range(N):
    graph.append([0]+list(map(int,input())))

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def BFS(a, b):

    queue = deque()
    #(x-1, y) (x+1, y) (x, y-1) (x, y+1)

    queue.append((a,b))


    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 1 or ny < 1 or nx > N or ny > M:
                continue
            if graph[nx][ny] == 0:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

    return graph[N][M]


print(BFS(1,1))