#create user define dictionary
a =int(input("Enter number: "))
b={}
for i in range(1,a+1):
    key=input("Enter key: ")
    value=input("Enter value: ")
    b[key]=value
print(b)

