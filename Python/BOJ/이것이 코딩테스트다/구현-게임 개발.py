N, M = map(int, input().split())

x,y,direction = map(int,input().split())



dx = [-1,0,1,-1]
dy = [0,1,0,-1]

array = []
for i in range(N):
    array.append(list(map(int, input().split())))


visited = [[0] * M for _ in range(N)]
visited[x][y] = 1


def switch():
    global direction
    direction -= 1
    if direction == -1:
        direction = 3


count = 1
turn_time = 0

while True:
    switch()
    nx = x+dx[direction]
    ny = y+dy[direction]
    if visited[nx][ny] == 0 and array[nx][ny] == 0:
        visited[nx][ny] = 1
        x = nx
        y = ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time+=1
    if turn_time == 4:
        nx = x - dx[direction]
        ny = y - dy[direction]
        if array[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0
print(count)

