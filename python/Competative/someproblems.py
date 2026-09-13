def arm():
    a = int(input("Enter a number"))

    count  = 0
    sum = 0
    
    b = a
    while(a>0):
        d = a%10
        count += 1
        a//=10
    
    a = b
    while(a>0):
        d = a%10
        sum += d**count
        a//=10
        
    if(sum == b):
        print("Armstrong")
    else:
        print("Not Armstrong")


def fact():
    a = int(input("Enter a number: "))

    fact = 1
    
    for i in range(1,a+1):
        fact *= i 
    print(fact)

def fibo():
    n = int(input("Enter number"))
    b = 1
    a,s = 0,0
    
    for i in range(0,n):
        print(s,end=" ")
        a = b
        b = s
        s = a+b


cond = True

while cond:
    print("\n1. Armstrong: ")
    print("2. fact: ")
    print("3. fibonacci: ")
    print("4. exit: ")
    op = int(input("Enter option: "))

    if (op == 1):
        arm()

    elif(op == 2):
        fact()
    elif(op == 3):
        fibo()
    elif(op == 4):
        cond = False
    else:
        print("Invalid")

    