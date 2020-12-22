N, M = map(int, input().split())

weaknessKnight = (M-1, 0)

def case(N, M):
    if N == 1 or M == 1:
        print(1)
        return

    elif N == 2:
        if M == 2:
            print(1)
            return
        elif 3 <= M < 5:
            print(2)
            return
        elif 5<= M < 7:
            print(3)
            return
        elif 7 <= M:
            print(4)
            return

    elif N >= 3:
        if M == 2:
            print(2)
            return
        elif M == 3:
            print(3)
            return
        elif 4<= M < 7:
            print(4)
            return
        else:
            print(M-2)
            return

case(N,M)

