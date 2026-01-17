# WAP a program to check prime number or not prime
#a = int(input("Enter Value: "))
#count = 0
#for i in range(1,a+1):
#    if a%i == 0:
#        count = count +1
#if count == 2:
#    print(a," is prime number")
#else:
#    print( a," is not prime number")

# REverse number:
rev = 0
a = int(input("Enter numbers: "))
for i in range(1,a+1):
    d = a%10
    rev = rev*10+d
    a=a//10
    
print(rev)
