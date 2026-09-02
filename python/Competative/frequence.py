n = [10,20,10,20,30,10]
t=[]

for i in range(0,len(n)):
    c = 0
    for j in range(0,len(n)):
        if(n[i]==n[j]):
            c += 1
    print(n[i])
