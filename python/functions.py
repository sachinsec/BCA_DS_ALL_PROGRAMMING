#def fun():
#    print("Hello",Name)
#
#def fun1():
#    print("") 
#
#Name = input("Enter your name ")
#l = Name.lower()
#if Name == "tarun":
#    fun1()
#else:
#    fun()

###even odd using function
#def evenodd(b):
#    if b%2==0:
#        print("This is even number.")
#    else:
#        print("This is odd number. ")
#
#a = int(input("Enter value: "))
#evenodd(a)

##factorial in fuction
#def fun(a):
#    fact = 1
#    for i in range(1,a+1):
#        fact *=i
#    print(fact)
#
#a = int(input("Enter numbere: "))
#fun(a)

##factorial in fuction return value
#def fun(a):
#    fact = 1
#    for i in range(1,a+1):
#        fact *=i
#    return fact
#
#a = int(input("Enter numbere: "))
#c = fun(a)
#print(c)

###to find a number is armstrong or not using functino with return with positional argument
#def arm(x):
#    count = 0
#    n =x
#    arm = 0
#    while x>0:
#        count +=1
#        x//=10
#
#    for i in range(1,count+1):
#        d = n%10
#        arm += d**count
#        n//=10
#    return arm
#
#a = int(input("Enter digit: "))
#b =arm(a)
#if b == a:
#    print("This is armstrong")
#else:
#    print("This is not armstrong")

###keyword arguement
#def info(name,age):
#    print("My name is ",name)
#    print("I am ",age," years old")
#
#info(age = 5,name="abc")
#info(name="por",age=4)


#find length of list using function
#a = [2,3,4,5,6]
#def le(x):
#    print(len(x))
#
#le(a)

##sum and average using function
#a = [2,3,4,5,6]
#def sumav(x):
#    sum = 0
#    for i in x:
#        sum += i
#    print(f"Sum of the total elements: {sum}\nAverage {sum/len(x)}")
#
#sumav(a)

##check prime or not prime 
#a = int(input("Enter number: "))
#def prime(x):
#    count = 0
#    for i in range(1,x+1):
#        if x%i == 0:
#            count+=1
#    if count == 2:
#        print("This is prime number")
#    else:
#        print("Not Prime")
#
#prime(a)

##even odd using function
#a = int(input('Enter number: '))
#def even(x):
#    if x % 2 == 0:
#        print("This is Even number")
#    else:
#        print("This is odd number.")
#
#even(a)

##factorial using function
#a = int(input("Enter value: "))
#def fact(x):
#    f  = 1
#    for i in range(1,x+1):
#        f *= i
#    print(f)
#fact(a)

##palindrone number using function 
#a = int(input("Enter value: "))
#def pali(n):
#    rev = 0
#    count = 0
#    x = n
#    while x > 0:
#        count += 1
#        x //= 10
#    x = n
#    for i in range(1,count+1):
#        d = x%10
#        rev = rev*10+d
#        x //= 10
#    return rev
#
#p=pali(a)
#if p == a:
#    print("This is palindrone.")
#else:
#    print("This is not palindrone.")