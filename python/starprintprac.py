##star print 
#a = int(input("Enter value: "))
#for i in range(0,a+1):
#    for b in range(0,i+1):
#        print("*",end="")
#    print()

##star printing reverse
#a = int(input("Enter value: "))
#for i in range(a,0,-1):
#    for b in range(i,0,-1):
#        print("*",end="")
#    print()

# reverse space
a = int(input("Enter value: "))
for i in range(a, 0, -1):
    
    print(' ' * (a - i) + '*' * i)
