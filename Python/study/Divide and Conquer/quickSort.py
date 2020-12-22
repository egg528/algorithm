list = [2,4,1,5,7,8,9,3]
n = 13



def quickSort(list):
    if len(list) < 2:
        return list

    pivot = partition(list)
    return quickSort(list[:pivot]) + [list[pivot]] + quickSort(list[pivot+1:])


def partition(list):
    pivot = list[0]
    j = 0

    for i in range(1, len(list)):
        if list[i] < pivot:
            j += 1
            list[j], list[i] = list[i], list[j]

    list[j], list[0] = list[0], list[j]
    return j

print(quickSort(list))