n = int(input("Enter number"))
b = 1
a,s = 0,0

for i in range(0,n):
    print(s,end=" ")
    a = b
    b = s
    s = a+b


# n = int(input("Enter number"))
# b = 1
# a,s = 0,0

# while(s <= n):
#     print(s,end=" ")
#     a = b
#     b = s
#     s = a+b
    