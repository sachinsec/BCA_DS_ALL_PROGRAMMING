a = int (input("Enter Number: "))
count = 0
n =a
arm = 0
while n>0:
 digit = n%10
 count +=1
 n//=10

n = a
for i in range(1,count+1):
 digit = n%10
 arm += digit**count
 n//=10
 
if arm == a:
 print("This is armstrong number")
else:
 print("This is not armstrong number")
