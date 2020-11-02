where = input()
index = (int(where[1]), ord(where[0])-96)


list = [(-2,1),(-2,-1),(2,1),(2,-1),(1,2),(-1,2),(1, -2),(-1,-2)]
count = 0

for i in list:
    x = i[1]+index[1]
    y = i[0]+index[0]

    if x < 1 or x > 8 or y < 1 or y > 8:
        pass
    else:
        count+=1


print(count)