a = int(input("Enter number: "))
s = 0

temp = a
while(0<a):
    d = a%10
    s = s*10 +d
    a//=10

if(s == temp):
    print("True")
else:
    print("False")
