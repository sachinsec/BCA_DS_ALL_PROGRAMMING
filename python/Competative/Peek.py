l = [4,3,2,7,6]
c = 0

for i in range(1,len(l)-1):
    if(l[i-1]<l[i] and l[i]>l[i+1]):
        c += 1
    if(i==1 or i==len(l)-2):
        if(l[0]>l[1] or l[i]>len(l)-1):
            c+=1

print(c)