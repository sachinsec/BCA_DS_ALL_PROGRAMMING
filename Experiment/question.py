a = int (input("Enter Number: "))
product = 1

while a>0:
 digit = a%10
 product *= digit
 a//=10
 
print(product)
