import sys
input = sys.stdin.readline

N, M = map(int, input().split())

before = [[0]*M for _ in range(N)]
after = [[0]*M for _ in range(N)]

for i in range(N):
    a = input()
    for j in range(M):
        if a[j] == '1':
            before[i][j] = 1

for i in range(N):
    a = input()
    for j in range(M):
        if a[j] == '1':
            after[i][j] = 1
# 여기까지 입력


def find(N, M, before, after):
    count = 0

    for i in range(N-2):
        for j in range(M-2):

            if before[i][j] != after[i][j]:
                for row in range(i, i+3):
                    for column in range(j, j+3):
                        if before[row][column] == 1:
                            before[row][column] = 0
                        else:
                            before[row][column] = 1
                count += 1

    if before == after:
        print(count)
    else:
        print(-1)





def Count(N, M, before, after):

    #두 행렬이 같다면
   if before == after:
       print(0)
       return

   # 바꿀 수 없다면
   if M < 3 or N < 3:
       print(-1)
       return

   find(N, M, before, after)


Count(N, M, before, after)





