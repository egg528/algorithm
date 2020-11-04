N, M = map(int, input().split())

array = []

for _ in range(N):
    array.append(list(map(int, input())))

def dfs(x,y):
    if x < 0 or x >= M or y < 0 or y >= N:
        return False
    if array[y][x] == 0:
        array[y][x] = 1
        dfs(x-1, y)
        dfs(x+1, y)
        dfs(x, y-1)
        dfs(x, y+1)
        return True
    return False

result = 0
for i in range(N):
    for j in range(M):
        if dfs(j,i) == True:
            result+=1

print(result)






