# input
order_list = [1,2,3,4,5,6,7,8,9]
key = 6

def binarySearch(oL, key, low, high):
    if low>high:
        return False

    mid = (low+high)//2
    if key == oL[mid]:
        return mid
    elif key < oL[mid]:
        return binarySearch(oL, key, low, mid-1)
    else:
        return binarySearch(oL, key, mid+1, high)


print(binarySearch(order_list, key, 0, len(order_list)))
