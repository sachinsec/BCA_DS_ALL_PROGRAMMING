# n = "Sachin"
# l = len(n)-1
# for i in range(l,-1,-1):
#     print(n[i],end="")

##Q2.
# n = "Sachin"
# a = n.lower()
# rev = (a[::-1])

# if(rev==a):
#     print("Palindrom")
# else:
#     print("Not palindrom")

##3 non repeating first print
# #karan
# n  = input("Enter string: ")
# count=0

# for i in range(0,len(n)):
#     count = 0
#     for j in range(0,len(n)):
#         if(i!=j):
#             if(n[i]==n[j]):
#                 count+=1
        
#     if(count==0):
#         print(n[i])
#         break

#4 anagram
# a = "tab"
# b = "bat"

# count = 0

# if(len(a)==len(b)):
#     for i in range(0,len(a)):
#         for j in range(0,len(a)):
#             if a[i] == b[j]:
#                 count+=1
#     print(count == len(a))

a = input("Enter word: ")
b = input("Enter word: ")

count = 0

if(len(a)==len(b)):
    for i in range(0,len(a)):
            if a[i] in b:
                count+=1
    if(count == len(a)):
         print("Anagram")
    else:
         print("Not Anagram")
else:
     print("Not Anagram")
     