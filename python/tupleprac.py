##tuple 5 fruite print 3rd number
#f =("Apple","Banana","Cherry","Orange","Papaya")
#print(f[2])

##access tuple
#num = (12,13,14,15,16)
#print(num)

##even number sum only from tuple
#num = (1,2,3,4,5,7,6,8,9,10)
#sum = 0
#for i in num:
#    if i % 2 == 0:
#        sum += i
#print(sum)

##Find Second Largest Element
#num = (2,3,8,9,22,83,32,55)
#l = list(num)
#for i in range(1,4):
#    l.remove(max(l))
#    n = max(l)
#print(n)

##tuple slicing
#num =(1,2,3,4,5,6)
#print(num[0:len(num):2])

n = tuple(input("Enter number: "))
print(n)