n = input("Enter word: ")
count = 0
for i in range(1,len(n)):
    if(n[i]== 'a','e','i','o','u'):
        count += 1
print("Vowels: ",count)