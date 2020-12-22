count = 0


while True:
    L, P, V = map(int, input().split())
    if P == 0:
        break


    loop = V//P
    rest = V%P

    result = loop*L

    if rest <= L:
        result += rest
    else:
        result += L

    count += 1

    print("Case",f"{count}:", result)

