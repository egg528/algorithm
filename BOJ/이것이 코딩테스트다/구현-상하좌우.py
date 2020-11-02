N = int(input())

list1 = ["L", "R", "U", "D"]
list2 = [(0,-1),(0,1),(-1,0),(1,0)]

start = [1,1]

list3 = list(input().split())

for i in list3:
    index = list1.index(i)
    movement = list2[index]

    if start[0]+movement[0]<1 or start[0]+movement[0] > N or start[1]+movement[1] < 1 or start[0]+movement[0] > N:
        pass
    else:
        start[0] = start[0]+movement[0]
        start[1] = start[1]+movement[1]

print(start[0], start[1])