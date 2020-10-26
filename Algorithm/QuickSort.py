import random

N = int(input())

list = random.sample(range(1,10000), N)
comparison = 0
exchange = 0


def quickSort(list, low, high, pivot):
    global comparison
    global exchange


    if high <= low:
        comparison += 1
        return

    pivotItem = list[pivot]
    j = low

    for i in range(low+1, high+1):
        if list[i] < pivotItem:
            exchange += 1
            j+=1
            list[i], list[j] = list[j], list[i]
        comparison += 1

    pivotpoint = j
    exchange += 1
    list[low], list[pivotpoint] = list[pivotpoint], list[low]

    quickSort(list, low, j-1, pivot)
    quickSort(list, j+1, high, pivot)
    return


quickSort(list, 0, N-1, 0)
print(list)
print(comparison)
print(exchange)

