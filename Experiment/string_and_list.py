##reverse of the string
#a = "Soham"
#print(a[::-1])

##palindrome check
#a = "naman"
#b = a[::-1]
#if a==b:
#    print("This is palindrome ")
#else:
#    print("Not palindrom")

##Split the string
#a = "He is a boy"
#b = a.split()
#print(b)

##length of the string
#a = "Sachin"
#print(len(a))

#User define dictionary
dic = {}
a = int(input("Enter value: "))
for i in range(1, a+1):
    b = input("Enter Key: ")
    c = input("Enter value: ")
    dic[b] = c
#print(dic,end="")
for h in dic:
    print(h)
