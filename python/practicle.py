##palindrome
#n = int(input("Enter digit: "))
#count=0
#rev=0
#
#a=n
#while a>0:
#    count += 1
#    a//=10
#
#a=n
#for i in range(1,count+1):
#    d=a%10
#    rev = rev*10+d
#    a//=10
#if rev==n:
#    print("Palindrome")
#else:
#    print("Not palindrome")

#common  value find
a = [1,2,3,4,5]
b = [6,7,8,1,2]
c = []

for i in a:
    if i in b:
        c.append(i)
print(c)