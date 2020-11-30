#input
list = [2,5,6,8,3,6,5,3,1]
n = 9

def mergeSort(list):
    if len(list) < 2:
        return list

    mid = len(list)//2
    left_arr = mergeSort(list[:mid])
    right_arr = mergeSort(list[mid:])
    return merge(left_arr, right_arr)

def merge(left_arr, right_arr):
    merged_list = []

    l = h = 0
    while l < len(left_arr) and h < len(right_arr):
        if left_arr[l] < right_arr[h]:
            merged_list.append(left_arr[l])
            l+=1
        else:
            merged_list.append(right_arr[h])
            h += 1

    merged_list += left_arr[l:]
    merged_list += right_arr[h:]
    return merged_list

print(mergeSort(list))