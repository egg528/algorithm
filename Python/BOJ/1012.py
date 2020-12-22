import sys
sys.setrecursionlimit(10**6)

Test = int(input())


dm = [0,0,-1,1]
dn = [1,-1,0,0]


def DFS(graph, a, b):
    graph[a][b] = 0

    for i in range(4):
        am = a + dm[i]
        an = b + dn[i]

        if 0 <= am < n and 0 <= an < m and graph[am][an] == 1:
            DFS(graph, am, an)


for _ in range(Test):
    count = 0
    m, n, vege = map(int, input().split())
    graph = [[0]*m for i in range(n)]

    for i in range(vege):
        a, b = map(int, input().split())
        graph[b][a] = 1



    for i in range(m):
        for j in range(n):
            if graph[j][i] == 1:
                DFS(graph, j, i)
                count += 1

    print(count)
