n = 0
for i in range(5,0,-1):
    print(" "*n,end="")
    n += 1
    print("* "*i)
for i in range(1,6):
    n -= 1
    print(" "*n,end="")
    print("* "*i)
print()
