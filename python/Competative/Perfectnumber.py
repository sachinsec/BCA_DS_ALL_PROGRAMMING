for k in range(2,1000):
    temp = k
    sum = 0
    for i in range(1,k):
        if(k%i==0):
            sum += i
    if(temp==sum):
        print(k)
