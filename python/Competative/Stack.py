stack=[]
cond = True
while cond:
    print("1. Push")
    print("2. Pop")
    print("3. Peek")
    print("4. Exit")
    print("5. Display")
    
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
            print(stack.pop(0))
            print("Removed succesfully")
    
    elif(op == 3):
        if(len(stack)==0):
            print("Stack is empty")
        else:
            print(stack[-1])

    elif(op == 4):
        cond = False

    elif(op == 5):
        print(stack[::-1])
