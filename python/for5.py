##average of even number from 2 to 100
#sum =0
#for i in range(2,1001,2):
#    sum = sum+i
#average = sum/500
#print(average)

#second method

sum = 0
count = 0
for i in range(2,1001):
    if i%2==0:
        sum +=i
        count = count+1
print("Average: ",sum/count)