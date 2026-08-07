a = int(input("Enter digits"))
target = int(input("Target"))
count = 0

while(0<a):
    d = a%10
    if(d == target):
        count += 1
    a//=10
print(count)