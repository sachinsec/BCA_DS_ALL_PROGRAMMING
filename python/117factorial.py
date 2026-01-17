#a = int(input("Enter number : "))
#fact = 1
#for i in range(1,a+1):
#    fact *=i
#print(fact)

## Table Print program
#a = int(input("Enter table: "))
#for i in range(1,11):
#    print(a,"X",i,"=",a*i)

## Fibonacci Series
#n = int(input("Enter NUmber "))
#a = 0 
#b = 1 
#print(a)
#print(b)
#count = 2
#while(count<=n):
#    c = a+b
#    print(c)
#    count +=1
#    a = b
#    b = c


##Prime Numbers Check
#a = int(input("Enter any number: "))
#count = 0
#
#for i in range(1,a+1):
#    if a%i == 0:
#        count +=1
#if count == 2:
#    print("This is prime number")
#else:
##    print("this is not Prime number")
#
#a = int(input("Enter Number: "))
#for i in range(1,a+1):
#    count = 0
#    for b in range(1,i+1):
#        if i%b == 0:
#            count +=1
#    if count == 2:
#        print(i)


##Perfecct NUmber 6 and 1+2+3 = 6 
#
#a = int(input("Enter number "))
#sum =0
#for i in range(1,a):
#    if a%i==0:
#        sum +=i
#if sum==a:
#    print(sum,"is Perfect number")
#else:
#    print(a,"is not perfect number")

##Check perfect number using while loop
#a = int(input("Enter value: "))
#sum = 0
#i = 1
#while(i<a):
#    if(a%i==0):
#        sum+=i
#    i+=1
#if sum==a:
#    print("This is perfect number")
#else:
#    print("This is not perfect number")

#Fibonacci Series
n = int(input("Enter number: "))
a=0
b=1
print(a)
print(b)
for i in range(2,n+1):
   
    c=a+b
    a=b
    b=c
print(c)




##sum of digit
#a = int(input("Enter digit: "))
#sum = 0
#n=a
#
#while 0<n:
#    digit = n%10
#    sum +=digit
#    n//=10
#print(sum)

##sum of digit using for loop
#a = int(input("Enter digit: "))
#sum = 0
#for i in range(1,a):
#    digit=a%10
#    sum +=digit
#    a//=10
#print(sum)

#reverse
a = int(input("Enter digit: "))
rev = 0

for i in range(1,a):
    digit = a%10
    rev = rev*10+digit
    a//=10
print(rev)