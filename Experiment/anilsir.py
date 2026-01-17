##Q1 
#a = int(input("Enter number: "))
#for i in range(1,a+1):
#    print(i)
##Q4
#a = int(input("Enter number: "))
#sum =0
#for i in range(1,a+1):
#    sum+=i
#
#print(sum)

##Q2 Check Palindrome or not
#a = int(input("Enter number: "))
#rev = 0
#i = a
#while a>0:
#    d = a%10
#    rev = rev*10+d
#    a//=10
#if i==rev:
#    print("Palindrome number")
#else:
#    print("Not Palindrome number")
#print(rev)

## Q3 sum of the natural number
#a = int (input("Enter number: "))
#sum =0
#for i in range(1,a+1):
#    sum = sum+i
#print(sum)

## Q5 check armstrong number 
#a = int(input("Enter number: "))
#rev,arm =0,0
#count =0
#digit =0
#b=a
#while b>0:
#    count+=1
#    b//=10
#b=a
#while b>0:
#    digit = b%10
#    rev = rev*10+digit
#    arm = arm+ digit**count
#    b//=10
#if a==arm:
#    print("armstrong number")
#else:
#    print("Not armstrong number")

#Q6 generate prime number till n
#a = int (input("Enter number: "))
#prime = 0
#for i in range(1,a+1):
#    count= 0
#    for b in range(1,i+1):
#       if i%b==0:
#           count += 1
#    if count == 2:
#        print(i)

##Q9 print using for loop 1/2,1/3,1/4...............
#a = int(input("Enter number :"))
#for i in range(2,a+1):
#    num = 1/i
#    print(num)

#Q13 Fibonacci Series
n = int(input("Enter number of terms: "))
if n <= 0:
    print("Please enter a positive integer")
else:
    a, b = 0, 1
    for _ in range(n):
        print(a)
        a, b = b, a + b
