import itertools
import sys
import copy
from collections import deque
input = sys.stdin.readline

# 입력
N, M = map(int, input().split())

room = []
for _ in range(N):
    room.append(list(map(int, input().split())))

empty = 0
wallAbale = []
virus = deque()
for i in range(N):
    for j in range(M):
        if room[i][j] == 0:
            empty+=1
            wallAbale.append((i, j))
        elif room[i][j] == 2:
            virus.append((i, j))

# 구현
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def DFS(graph):
    queue = copy.deepcopy(virus)
    count = 0

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            a = x + dx[i]
            b = y + dy[i]

            if 0 <= a < N and 0 <= b < M and graph[a][b] == 0:
                count += 1
                graph[a][b] = 2
                queue.append((a,b))


    return empty - count - 3

def constructWall():
    Max = 0


    for i in list(itertools.combinations(wallAbale, 3)):
        graph = copy.deepcopy(room)
        for j in i:
            graph[j[0]][j[1]] = 1

        Max = max(Max, DFS(graph))

    print(Max)


constructWall()

