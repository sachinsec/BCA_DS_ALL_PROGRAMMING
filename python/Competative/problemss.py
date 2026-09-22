#Q1.
from array import array
# arr = array('i',[23,83,8,94,2])

# for i in range(len(arr)-1):
#     for j in range(i+1,0,-1):

#         if(arr[j]<arr[j-1]):
#             temp = arr[j]
#             arr[j]=arr[j-1]
#             arr[j-1] = temp

# print(arr)

# print("Second largest number is = ",arr[len(arr)-2])


# #Q2.
# arr = array('i',[23,83,8,94,2])
# t = int(input("Enter target: "))
# for i in range(len(arr)-1):
#     if(arr[i]==t):
#         print("Indexing value is ",i)


# #Q3.
# arr = array('i',[1,2,3,4,5,6,7])
# t = int(input("Enter target: "))
# l = len(arr)-1
# s = 0
# mid = 0
# c = 0

# while (mid<l):
#     mid = s + (l-s)//2
#     if(arr[mid]==t):
#         print(mid)
#         c = 1
#         break
#     if(arr[mid]>t):
#         l = mid-1

#     if(arr[mid]<t):
#         s = mid+1

# if(c==0):
#     print("Not found")

#Q7.
# #inseration
# arr = array('i',[23,83,8,94,2])

# for i in range(len(arr)-1):
#     for j in range(i+1,0,-1):

#         if(arr[j]<arr[j-1]):
#             temp = arr[j]
#             arr[j]=arr[j-1]
#             arr[j-1] = temp

# print(arr)

#Selection

arr = array('i',[23,83,8,94,2])
min = 0
for i in range(len(arr)):
    min = i
    for j in range(i+1,len(arr)):
        if(arr[min]>arr[j]):
            min = j
    temp = arr[i]
    arr[i] = arr[min]
    arr[min] = temp
print(arr)

