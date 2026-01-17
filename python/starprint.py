#a = int(input("Enter number: "))
#
#for i in range(1,a+1):
#    for b in range(1,i+1):
#        print("*", end="")
#    print()

##reverse printing 
a = int(input("Enter Value: "))
for i in range(a,0,-1):
    for b in range(i,0,-1):
        print("*",end="")
    print()

