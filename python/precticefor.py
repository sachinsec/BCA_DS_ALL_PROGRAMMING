# factorial number 
num = int(input("Enter a number : "))
fact = 1
if num<0:
    print("Factorial does not exist for negative number")
elif num==0:
    print("Factorial is Zero ")
else :
    for i in range(1,num+1):
        fact = fact*i
    print("Factorial of ",num, "is",fact)