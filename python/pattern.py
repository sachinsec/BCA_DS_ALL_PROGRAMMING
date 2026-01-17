#a = int(input("Enter value: "))
#for i in range(a,0,-1):
#    for h in range(1,i+1,):
#        print(""*h,"*",end="")
#    print("")

a = int(input("Enter value: "))
for i in range(1,a+1):
    for h in range(1,i+1):
        print(""*h,"*",end="")
    print("")