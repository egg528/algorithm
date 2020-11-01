N, L = map(int,input().split())

broken = list(map(int, input().split()))
broken.sort()

count = 0
finish = 0

for i in broken:
    if i + 0.5 <= finish:
        pass
    else:
        finish = i + L - 0.5
        count += 1
print(count)