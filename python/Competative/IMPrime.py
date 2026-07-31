a = int(input("Enter a number: "))

count = 0

for i in range(2,a):
    if(a%i == 0):
        print(" Not Prime")
        count += 1
        break
if(count == 0):
    print("Prime")