# n = int(input("Enter the number: "))
# sum = 0
# for i in range(1,n+1):
#     sum = 0
#     while(0<n):
#         d = n%10
#         sum += d**2
#         n//=10
#     n = sum
#     if(sum == 1):
#         break
# if(sum == 1):
#     print("Happy Number")
# else:
#     print("Not Happy number")



for k in range(1,100):
    temp = k
    sum = 0
    for i in range(1,k+1):
        sum = 0
        while(0<k):
            d = k%10
            sum += d**2
            k//=10
        k = sum
        if(sum == 1):
            break
    if(sum == 1):
        print(temp,end=" ")
    
    