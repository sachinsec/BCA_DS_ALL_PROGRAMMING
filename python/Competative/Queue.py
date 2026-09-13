q = [0]*3
rear = -1
front = -1
def enque(data):
    global front, rear
    if (front == -1):
        front=0
    rear += 1
    q[rear] = data

# dqueue
def deque():
    global front, rear
    if(front>rear or front<0):
        print("Queue is underflow")
    else:
        print(q[front])
        front += 1

#Peek
def peek():
    global front, rear
    if(front == -1 or front>rear):
        print("Underflow")
    else:
        print(q[front])

#display
def display():
    global front, rear
    if (front == -1):
        print("Queue is Empty")
    else:
        print("Queue elements: ")
        for i in range(front,rear+1):
            print(q[i])
    

    

co = True
while co:
    print("1.Enque")
    print("2.Deque")
    print("3.Peek")
    print("4.Display")
    print("5.Exit")
    ch = int(input("Enter choice: "))

    if(ch == 1):
        value = int(input("Enter data: "))
        enque(value)

    if(ch == 2):
        deque()

    if(ch == 3):
        peek()

    if(ch == 4):
        display()
    if(ch == 5):
        co = False
