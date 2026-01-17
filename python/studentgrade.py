a =int(input("Enter marks of Subject 1: "))
b =int(input("Enter marks of Subject 2: "))
c =int(input("Enter marks of Subject 3: "))
d = a+b+c
aver=d/3
if aver>=90:
    print("A Grade")
elif aver>=80:
    print(" B Grade")
elif aver>=70:
    print(" C Grade")
elif aver>=60:
    print(" D Grade")
elif aver>=0:
    print("E Grade")