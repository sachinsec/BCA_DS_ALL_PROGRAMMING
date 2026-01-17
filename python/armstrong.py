n = int(input("Enter number : "))
count = 0
rev = 0
num = n
while num>0:
    count = count+1
    num//=10

arm = 0
num =n
#while num>0:
#    digit = num%10
#    rev=rev*10+digit
#    arm +=digit**count
#    num//=10
#print(arm)
for i in range(1,count+1):
    digit = num%10
    rev=rev*10+digit
    arm +=digit**count
    num//=10
print(arm)