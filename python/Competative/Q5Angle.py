a = int(input("Enter the angle value"))

if(a == 90):
    print("Right")
elif(a > 90 and a < 180):
    print("Optious")
elif(a < 90 and a != 0):
    print("Acute")