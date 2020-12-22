from itertools import permutations
import sys
input = sys.stdin.readline

N = int(input())

steel = list(map(int,input().split()))
steel.sort()




combination = set()
sum = 0

for i in range(1, N+1):
    for j in list(permutations(steel, i)):
        if sum != 0:
            combination.add(sum)
        sum = 0
        for k in range(i):
            sum += j[k]

sum = 0
for i in steel:
    sum += i

def K(combination, sum):
    for i in range(1, sum+1):
        if i not in combination:
            print(i)
            return


K(combination, sum)

## 메모리 초과
