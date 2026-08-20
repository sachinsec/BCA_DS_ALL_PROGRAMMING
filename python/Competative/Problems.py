#Q1.
# n = int(input("Enter digits"))

# sum = 0

# while(0<n):
#     d = n%10
#     sum = sum + d
#     n//=10
# print(sum)

#Q2.
# n = int(input("Enter number"))
# temp = n
# pro = 1
# while(0<n):
#     d = n%10
#     print("Square: ",d**2)
#     print("Cube: ",d**3)

#     pro = pro*d
#     n//=10

# print("Product: ",pro)


#Q3

# a = int(input("Enter number: "))
# b = int(input("Enter number: "))
# c = int(input("Enter number: "))

# if(a>b and a>c):
#     print(a)
# elif(b>c):
#     print(b)
# else:
#     print(c)


#Q4.

# a = int(input("Enter a number: "))

# count = 0

# for i in range(2,a):
#     if(a%i == 0):
#         print(" Not Prime")
#         count += 1
#         break
# if(count == 0):
#     print("Prime")

#Q5
# n = int(input("Enter number: "))
# sum = 0
# for i in range(1,n+1):
#     sum += i 
# print(sum)

#Q6
# n = int(input("Enter number: "))
# fact = 1
# for i in range(1,n+1):
#     fact *= i 
# print(fact)


#Q7
# n = int(input("Enter number: "))
# b = 1
# a,s = 0,0

# for i in range(0,n):
#     print(s,end=" ")
#     a = b
#     b = s
#     s = a+b

#Q8
# n = int(input("Enter number: "))
# rev =0

# while(0<n):
#     d = n%10
#     rev  = rev * 10 +d
#     n//=10

# print("Reverse: ",rev)


#Q9
# n = int(input("Enter number: "))
# rev =0
# temp = n
# while(0<n):
#     d = n%10
#     rev  = rev * 10 +d
#     n//=10

# if(temp==rev):
#     print("Palindron")
# else:
#     print("Not Palindron")

#10
# n = int(input("Enter number: "))
# arm = 0
# count=0
# temp=n
# while(0<n):
#     d = n%10
#     count += 1
#     n//=10
# n=temp
# while(0<n):
#     d = n%10
#     arm = arm + d**count
#     n//=10

# if(temp==arm):
#     print("Armstrong")
# else:
#     print("Not amrstrong")


#Q11
# n = int(input("Enter year: "))
# if(n%400==0 and n%100==0):
#     print("Leap Year")
# elif(n%4==0 and n%100 != 0):
#     print("Leap Year")
# else:
#     print("Not leap Year")


#Q12
# n = int(input("Enter the number: "))
# sum = 0
# prod =1

# for i in range(1,n+1):
#     if(i%2==0):
#         sum = sum + i
#     elif(i%2!=0):
#         prod = prod * i
# print("Sum of Even: ",sum)
# print("Product of odd: ",prod)


#Q13
# n = int(input("Enter number: "))
# count = 0
# for i in range(1,n+1):
#     if(n%i==0):
#         count = count+1
# print("Factors number: ",count)


#Q14
#1
# for i in range(1,6):
#     print("* "*5)
# print()

# #4
# for i in range(1,6):
#     print("* "*9)
# print()

# #2
# for i in range(1,6):
#     print("* "*i)
# print()

# #3
# for i in range(5,0,-1):
#     print("* "*i)
# print()


# #5
# for i in range(1,5):
#     print("* "*i)
# for i in range(5,0,-1):
#     print("* "*i)
# print()

# #6
# n = 4
# for i in range(1,5):
#     print(" "*n,end="")
#     n -= 1
#     print("*"*i)
# for i in range(5,0,-1):
#     print(" "*n,end="")
#     n += 1
#     print("*"*i)
# print()

# #7
# n = 4
# for i in range(1,5):
#     print(" "*n,end="")
#     n -= 1
#     print("* "*i)
# for i in range(5,0,-1):
#     print(" "*n,end="")
#     n += 1
#     print("* "*i)
# print()


# # #8
# n = 0
# for i in range(5,0,-1):
#     print(" "*n,end="")
#     n += 1
#     print("* "*i)
# for i in range(1,6):
#     n -= 1
#     print(" "*n,end="")
#     print("* "*i)
# print()

# #9
# for i in range(1,6):
#     for j in range(1,6):
#         if((i==1 and (j==1 or j>3))or j==3 or i==3 or(i==5 and (j<3 or j==5)) or (i==4 and j==5) or (i==2 and j==1)):
#             print("*",end=" ")
#         else:
#             print(" ",end=" ")
#     print()

# #10
# b=10
# c=0

# for a in range(1,6):
#         print("*"*a,end="")
#         print(" "*b,end="")
#         b =b-2
#         print("*"*a)

# for i in range(6,0,-1):
#         print("*"*i,end="")
#         print(" "*c,end="")
#         c =c+2
#         print("*"*i)

#11
# c=0
# for i in range(6,0,-1):
#         print("*"*i,end="")
#         print(" "*c,end="")
#         c =c+2
#         print("*"*i)

# #12
# b= 10
# for a in range(1,6):
#         print("*"*a,end="")
#         print(" "*b,end="")
#         b =b-2
#         print("*"*a)


# #13
# c=0
# for i in range(6,0,-1):
#         print("*"*i,end="")
#         print(" "*c,end="")
#         c =c+2
#         print("*"*i)

# b= 8
# for a in range(2,7):
#         print("*"*a,end="")
#         print(" "*b,end="")
#         b =b-2
#         print("*"*a)


# #14
# for i in range(1,6):
#     for j in range(1,6):
#         if(i==1 or i == 5):
#             print("*",end=" ")
#         elif(j==1 or j== 5):
#             print("*",end=" ")
#         else:
#             print(" ",end=" ")
#     print()

# #15
# n = 5
# for i in range(1, n + 1):
#     print(" " * (n - i),end="")
#     print("*"*5)


# #16
# for i in range(1, 6):
#     for j in range(1, i + 1):
#         print(j, end=" ")
#     print()


# #17
# for i in range(1, 6):
#     for j in range(1, i + 1):
#         print(i, end=" ")
#     print()


# #18
# num = 1
# for i in range(1, 5):
#     for j in range(1, i + 1):
#         print(num, end=" ")
#         num += 1
#     print()