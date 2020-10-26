count, length = map(int, input().split())
list = list(map(int, input().split()))

list = sorted(list)

m = len(list) -1

target = list[m]

for i in range(target, 1, -1):
    sum = 0
    for n in list:
        if n-i > 0:
            sum += (n-i)
    if sum == length:
        print(i)


