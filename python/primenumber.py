a = int(input("Enter number to check prime or not prime: "))
count = 0

for i in range(1,a+1):
    if a%i==0:
        count = count+1
if count ==2:
    print("This is prime number")
else:
    print("This is not prime number")