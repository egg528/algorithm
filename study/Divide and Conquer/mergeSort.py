#input
list = [2,5,6,8,3,6,5,3,1]
n = 9

def merge_sort(arr):
    if len(arr) < 2:
        return arr

    mid = len(arr) // 2
    low_arr = merge_sort(arr[:mid])

    high_arr = merge_sort(arr[mid:])

    return merge(low_arr, high_arr)

def merge(low_arr, high_arr):


    merged_arr =[]
    l = h = 0
    while l < len(low_arr) and h < len(high_arr):
        if low_arr[l] < high_arr[h]:
            merged_arr.append(low_arr[l])
            l += 1
        else:
            merged_arr.append(high_arr[h])
            h += 1
    merged_arr += low_arr[l:]
    merged_arr += high_arr[h:]



    return merged_arr

print(merge_sort(list))