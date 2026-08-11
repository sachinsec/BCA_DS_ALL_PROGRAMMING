# for i in range(1,6):
#     for j in range(5-i,0,-1):
#         print(" ",end=" ")
#     for k in range(1,i+1):
#         print("*",end=" ")
#     print()


#shape

# b=10
# c=0

# for i in range(6,1,-1):
#         print("*"*i,end="")
#         print(" "*c,end="")
#         c =c+2
#         print("*"*i)

# for a in range(1,7):
#         print("*"*a,end="")
#         print(" "*b,end="")
#         b =b-2
#         print("*"*a)



#butterfly
b=10
c=0

for a in range(1,6):
        print("*"*a,end="")
        print(" "*b,end="")
        b =b-2
        print("*"*a)

for i in range(6,0,-1):
        print("*"*i,end="")
        print(" "*c,end="")
        c =c+2
        print("*"*i)