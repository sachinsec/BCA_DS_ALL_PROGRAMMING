#a = int(input("Enter number: "))
#if a==1:
#    print("Monday")
#elif a==2:
#    print("Tuesday")
#elif a==3:
#    print("Wednesday")
#elif a==4:
#    print("Thursday")
#elif a==5:
#    print("Friday")
#elif a==6:
#    print("Saturday")
#elif a==7:
#    print("Sunday")
#else:
#    print("default")

#student marks:
a = int(input("Enter value of Soham: "))
b = int(input("Enter value of Krishna: "))
c = int(input("Enter value of Tarun: "))

if a>b and a>c:
    print("Soham has selected\nMarks =  ",a)
elif b>c:
    print("Krishna has selected\n Marks = ",b)
else:
    print("Tarun has selected\n Marks = ",c)