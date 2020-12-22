N = int(input())
line =[-1] + list(map(int, input().split()))
result = [-1]*(N+1)

for i in range(1, N+1):
    for j in range(line[i]+1, N+1):
        if result[j]==-1:
            result[j] = i
            break

for i in result[1:]:
    print(i, end=" ")


