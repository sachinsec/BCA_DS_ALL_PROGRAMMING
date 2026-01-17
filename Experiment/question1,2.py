a = int(input("Enter Digit: "))
sum = 0
n = a
sq =0
cu = 0
#sum of digits
for i in range(1,a+1):
    digit = n%10
    sum += digit
    n//=10

#square sum
n =a
for i in range(1,a+1):
    digit = n%10
    sq += digit**2
    n//=10

#Cube sum
n = a
for i in range(1,a+1):
    digit = n%10
    cu += digit**3
    n//=10

print(sum)
print(sq)
print(cu)