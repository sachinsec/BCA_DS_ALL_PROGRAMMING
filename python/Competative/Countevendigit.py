a = int(input("Enter a number"))

count = 0
d = 0
while(a>0):
    d = a%10
    if(d % 2 == 0):
        count += 1

    a//= 10

print(count)