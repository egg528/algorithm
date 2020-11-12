N = int(input())

graph = []

for _ in range(N):
    graph.append(list(map(int,input())))




count = 0

def DFS(x, y):

    global count

    if x < 0 or y < 0 or N <= x or N <= y:
        return

    if graph[x][y] == 1:
        count += 1
        graph[x][y] = 0
        DFS(x - 1,y)
        DFS(x + 1, y)
        DFS(x, y - 1)
        DFS(x, y + 1)

result = []

for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            DFS(i,j)
            result.append(count)
            count = 0

print(len(result))

result.sort()

for i in range(len(result)):
    print(result[i])