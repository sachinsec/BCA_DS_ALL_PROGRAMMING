a = int(input("Enter a number"))

count  = 0
sum = 0

b = a
while(a>0):
    d = a%10
    count += 1
    a//=10

a = b
while(a>0):
    d = a%10
    sum += d**count
    a//=10
    
if(sum == b):
    print("Armstrong")
else:
    print("Not Armstrong")