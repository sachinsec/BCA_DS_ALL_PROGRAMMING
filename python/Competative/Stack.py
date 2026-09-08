stack=[]
cond = True
while cond:
    print("1. Push")
    print("2. Pop")
    print("3. Peek")
    print("4. Exit")
    
    op = int(input("Enter Option:  "))
    
    if(op>4):
        print("Invalid option. ")
    
    if(op == 1):
        ele = int(input("Enter elements: "))
        stack.append(ele)
        print("Element inserted")
    
    elif(op == 2):
        if(len(stack)==0):
            print("Stack is Underflow.")
        else:
            print(stack.pop())
            print("Removed succesfully")
    
    elif(op == 3):
        print(stack[len(stack)-1])

    elif(op == 4):
        cond = False
