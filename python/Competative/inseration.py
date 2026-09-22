from array import array

arr = array('i',[50,20,40,10,30,2,0,8])

for i in range(len(arr)-1):
    for j in range(i+1,0,-1):
        if(arr[j]<arr[j-1]):
            temp = arr[j-1]
            arr[j-1] = arr[j]
            arr[j] = temp
        else:
            break

print(arr)