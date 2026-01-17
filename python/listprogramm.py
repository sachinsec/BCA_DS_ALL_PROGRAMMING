##even number print from list
#number = [10,11,12,16,18,19,17,15]
#
#for i in number:
#    if i % 2 == 0:
#        print(i)
    
##print sum of list
#num = [1,2,3,4,5]
#sum  = 0
#for i in num:
#    sum +=i
#print(sum)

##product of list 
#num = [1,2,3,4,5]
#pro=1
#for i in num:
#    pro*=i
#print(pro)

##mximum element of the list
#num = [12,4,26,5]
#max = 0
#for i in range(0,len(num)):
#    if (max<num[i]):
#        max = num[i]
#print(max)

##minimum element of thsi list
#num= [12,25,15,3]


##average of the list
#num = [1,2,3,4,5]
#sum  = 0
#for i in num:
#    sum +=i
#print(sum/len(num))

##swap first elements with last
#num = [1,2,3,4]
#num[0], num[-1] = num[-1], num[0]
#print(num)

##print the multiple of 10 in list
#num =[22,10,20,25]
#for i in num:
#    if i % 10 ==0:
#        print(i)

##print the reverse of the list 
#num = [1,2,3,4]
#for i in range(3,-1,-1):
#    print(num[i])

## sum even number and count of odd number
#num = [1,2,3,4,5]
#sum = 0
#count = 0
#for i in num:
#    if i%2==0:
#        sum +=i
#    if i % 2 != 0:
#        count +=1
#print(sum)
#print(count)

## linear search
#list = [4,14,19,36,7,1,12]
#x = int(input("Enter element to be searched: "))
#p = len(list)
#h = 0
#for i in range(0,p):
#    if (list[i] == x):
#        h = 1
#        print("Value found at index",i)
#if h == 0:
#    print("Value not found")

#binary search
l = [1,4,9,17,36,51]
x = int(input("Enter element to be searched: "))
start = 0
last = len(l) - 1
found = 0
while start <= last:
    mid = (start + last) // 2
    if l[mid] == x:
        print("Value found at index", mid)
        found = 1
        break
    elif x > l[mid]:
        start = mid + 1
    else:
        last = mid - 1
if found == 0:
    print("Value not found")
        