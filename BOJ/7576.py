from collections import deque
import copy

#입력
N, M = map(int, input().split())

graph = []

for _ in range(M):
    graph.append(list(map(int, input().split())))

#구현
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


#출력
graphcopy = copy.deepcopy(graph)
BFS()
print(graph)
print(graphcopy)


max = 0
fail = False
for i in range(M):
    for j in range(N):
        if graph[i][j] >= max:
            max = graph[i][j]
        if graph[i][j] == 0:
            fail = True

if graph == graphcopy:
    print(0)
elif fail == True:
    print(-1)
else:
    print(max-1)






# 한번 더

N, M = map(int, input().split())

graph = []

for _ in range():
    graph.append(list(map(int, input().split())))


dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]



queue = deque()

for i in range(M):
    for j in range(N):
        if graph[i][j] == 1:
            queue.append((i, j))

def BFS():

    while queue:
        a, b = queue.popleft()

        for i in range(4):
            x = a + dx[i]
            y = b + dy[i]

            if 0 <= x < M and 0<= y < N and graph[x][y] == 0:
                graph[x][y] = graph[a][b] + 1





