from array import array

arr = array('i',[50,20,40,10,30])
target = 4
found = False

for i in range(len(arr)):
    if arr[i]==target:
        print("Inx = ",i)
        found = True
        break
if found == False:
    print("Not Found")