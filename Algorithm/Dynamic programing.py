N, M = map(int, input().split())
list = []
for i in range(N):
    list.append(int(input()))
list = list.sort(reverse=True)

coin = [0]*10001


for i in range(M+1):

    for money in list:
        print(3)