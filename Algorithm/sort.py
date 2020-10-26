N, K = map(int, input().split())

A = input().split()
B = input().split()

for i in range(N):
    A[i] = int(A[i])
    B[i] = int(B[i])

for i in range(K):
    Min_A = 10000001
    Min_A_index = 0
    Max_B = 0
    Max_B_index = 0
    for n in range(N):
        if A[n] < Min_A:
            Min_A = A[n]
            Min_A_index = n
        if B[n] > Max_B:
            Max_B = B[n]
            Max_B_index = n
    A[Min_A_index], B[Max_B_index] = B[Max_B_index], A[Min_A_index]

sum = 0
for i in A:
    sum += i

print(sum)

