for i in range(1,6):
    for j in range(1,6):
        if((i==1 and (j==1 or j>3))or j==3 or i==3 or(i==5 and (j<3 or j== 5)) or (i==4 and j==5) or (i==2 and j==1)):
            print("*",end=" ")
        else:
            print(" ",end=" ")
    print()