a = int(input("Enter digits"))

count = 0
# b = a
while(0<a):
    d = a % 10
    count += 1
    a//=10
print(count)