for k in range(100,10000):
    count = 0
    sum = 0
    temp = k
    while ( 0< k):
        d = k % 10
        count += 1
        k//=10
    k = temp
    while ( 0 < k):
        d = k % 10
        sum = sum + d **count
        k//=10
        
    if(sum ==temp):
        print(temp)