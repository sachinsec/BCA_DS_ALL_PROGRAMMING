for i in range(1,6):
    for j in range(5-i,0,-1):
        print("* "*i)
        print(" ",end=" ")
    for k in range(1,i+1):
        print("*",end=" ")
    print()

# for i in range(1,6):
#     print("* "*i)