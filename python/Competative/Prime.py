a = int(input("Enter a number: "))

count = 0

for i in range(1,a+2):
    if(a%i == 0):
        count += 1
if(count == 2):
    print("Prime")
else:
    print("NOt prime")