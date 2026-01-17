a = int(input("Enter number:"))
count = 0
sim = 0
sq = 0
cu = 0
num =a
while num>0:
    count +=1
    num//=10
#simple addition
num = a
for i in range(1,count+1):
    digit = num%10
    sim = sim+digit**1
    num//= 10
print("One power sum is ",sim)

#squre addition
num = a
for i in range(1,count+1):
    digit = num%10
    sq = sq+digit**2
    num//= 10
print("Square is ",sq)

#cube addition

num = a
for i in range(1,count+1):
    digit = num%10
    cu = cu+digit**3
    num//= 10
print("Cube is ",cu)