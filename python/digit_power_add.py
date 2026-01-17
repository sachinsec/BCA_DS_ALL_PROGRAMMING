#a = int(input("Enter Digit: "))
#j =str(a)
#n= len(j)
#sum =0
#p=n
#for i in range(1,p+1):
#    digit = a%10
#    sum =digit**p
#    p-=1
#print(sum)

#using while disarium
n = int(input("Enter no"))
j =len(str(n))
sum= 0
n1=n
while(n>0):
    p = n%10
    sum = sum+p**j
    n =n//10
    j=j-1
if(n1==sum):
    print("yes")
else:
    print("no")