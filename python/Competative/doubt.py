from array import array
arr = array('i',[23,83,98,28,23,2])
sum = 0
for i in arr:
    sum += i
print(sum)
print(min(arr))
print(sum/len(arr))