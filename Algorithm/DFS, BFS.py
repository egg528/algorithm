## stack
stack = []
stack.append(5)
stack.pop()

#Queue
from collections import deque

queue = deque()
queue.append(5)
queue.popleft()

#인접 노드 표현법 (2가지)
#         0
#        / \
#       7   5
#      /     \
#     1       2

# (1) 인접 행렬
INF = 9999999999
graph = [[0, 7, 5],
         [7, 0, INF],
         [INF, 5, 0]]

# (2) 인접 리스트
graph = [[(1,7), (2,5)],
         [(0,7)],
         [(0,5)]]



#DFS(Depth-First-Search)
graph = [[],
         [2, 3, 8],
         [1, 7],
         [1, 4, 5],
         [3, 5],
         [3, 4],
         [7],
         [2, 6, 8],
         [1, 7]]

visited = [False] * 9

def dfs(graph, start, visted):
    visited[start] = True
    print(start, end=" ")
    for i in graph[start]:
        if not visited[i]:
            dfs(graph, i, visited)


#BFS(Breath-First-Search)
graph = [[],
         [2, 3, 8],
         [1, 7],
         [1, 4, 5],
         [3, 5],
         [3, 4],
         [7],
         [2, 6, 8],
         [1, 7]]

visited = [False] * 9

def bfs(graph, start, visited):
    queue = deque()
    queue.qppend(start)
    # ==>이 과정을 한번에 queue = deque(start)
    visited[start] = True

    while queue:
        v = queue.popleft()
        print(v, end=" ")

        for i in graph[v]:
            if visited[i] == False:
                queue.append(i)
                visited[i] = True


dfs(graph, 1, visited)