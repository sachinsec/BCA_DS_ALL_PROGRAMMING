n = "aeiou"
count = 0

for i in range(0,len(n)):
    if(n[i] in 'aeiou'):
        count += 1
print(count)