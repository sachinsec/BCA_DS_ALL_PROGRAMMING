from array import array

arr = array('i',[10,20,30,40,50,60,70])

t = 50
s = 0
l = len(arr)
m=0
c=False

while s<=l:
    m = l +(s-l)//2
    print(m)
    if arr[m]==t:
        print("Indexing value is : ",m)
        c = True
        break
    elif arr[m]>t:
        l = m-1
    elif arr[m]<t:
        s = m+1

if(c==False):
    print("NUmber not found")