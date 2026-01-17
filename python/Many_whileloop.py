#1. print numbers 1 to 10 //
#a = int(input("Enter Start number: "))
#b = int (input("Enter End number: "))\
#
#while a<=b:
#    print(a)
#    a += 1

#2. Print even numbers up to 20 //
#count =0
#a = int (input("Enter start number: "))
#b = int(input("Enter end number: "))
#while a<=b:
#    print(a)
#    a += 2
    
#3 sum of first n natural numbers //
#n = int(input("Enter n: "))
#i,total = 1,0
#
#while i<=n:
#    total +=i
#    i += 1
#print("Sum = ",total)

#4. Factorial of a number //
n = int(input("Enter Fact value :"))
fact = 1
while n>0:
    fact *= n
    n -= 1
print(fact)

#REverse a Number

#n = int(input("Enter number : "))
#rev =0
#while n>0:
#    d = n%10
#    rev = rev*10 +d  #formola
#    n//=10
#print("Reversed = ",rev)

#n = int(input("Enter number : "))
#rev =0
#count = 0
#for i in range(1,n+1):
#    if n//10:
#        count = count+1
#for i in range(1,count+1):
#    d = n%10
#    rev = rev*10 +d 
#print(rev)