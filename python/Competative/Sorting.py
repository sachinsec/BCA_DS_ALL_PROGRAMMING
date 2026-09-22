from array import array
arr = array('i',[1,9,3,5,4])

n = len(arr)-1

for i in range(n):
    for j in range(n-i):
        if(arr[j]>arr[j+1]):
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
print(arr)