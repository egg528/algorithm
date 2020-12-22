from math import factorial as fac

Test = int(input())

for _ in range(Test):
    N, M = map(int, input().split())
    a = fac(M)
    b = fac(M-N)
    c = fac(N)
    print(a//b//c)