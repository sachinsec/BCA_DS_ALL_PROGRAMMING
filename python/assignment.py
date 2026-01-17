##print a table of any number formate 2 X 1 = 2
#a = int(input("Table: "))
#for i in range(1,11):
#    print(f"{a} X {i} = {a*i}")

##Factorial
#a = int(input('Enter value: '))
#fact = 1
#for i in range(1,a+1):
#    fact *= i
#print(fact)

##Prime number
#a = int(input("Enter number: "))
#count = 0
#for i in range(1,a+1):
#    if a%i==0:
#        count +=1
#if count == 2:
#    print("This is Prime number.")
#elif a ==1:
#    print("This is Prime number")
#else:
#    print("This is non-prime.")

##Fibonnaci series
#a = int(input("Enter number: "))
#c = 0
#d = 1
#print(c)
#print(d)
#while a-2>0:
#    b = c+d
#    c = d
#    d = b
#    print(b)
#    a-=1

##sum of the digit of entered numbera
#a = int(input("Enter digit: "))
#sum = 0
#for i in range(1,a):
#    d= a%10
#    sum += d
#    a//=10
#print(sum)

##reverse of the number
#a = int(input("Enter digit: "))
#rev = 0
#n = a
#while n > 0:
#    d = n % 10
#    rev = rev * 10 + d
#    n //= 10
#print(rev)

##Palindrone number check
#a = int(input("Enter digit: "))
#n = a
#rev = 0
#while n>0:
#    d = n%10
#    rev =rev*10+d
#    n//=10
#if rev == a:
#    print("Palindron.")
#else:
#    print("Not palindron.")

##armstrong number
#a = int(input("Enter nubmer: "))
#n = a
#count = 0
#arm = 0
#while n>0:
#    count +=1
#    n//=10
#n = a
#for i in range(1,count+1):
#    d = n%10
#    arm += d**count
#    n//=10
#print(arm)

#####@#@#@#  String and List #######!#@@#

##Reverse of the string
#name ="Sachin"
#print(name[::-1])

##Palindrone number
#name = input("Enter name ")
#a = name[::-1]
#if a == name:
#    print("Palindrone")
#else:
#    print("NO Palindrone")

##split the string
#sent = "He is a boy"
#print(sent.split())

##length of string
#name = "Sachin"
#print(len(name))

##replace substring
#sent = "Are you crazt"
#print(sent.replace("crazt","Sec"))

##Find first and last position of the substring
#name = "Dharmendra is a good boy"
#print(name.find("Dharmendra"),name.rfind("boy"))

##create a user define list
#a = []
#for i in range(0,5):
#    b =input("Enter list item: ")
#    a.append(b)
#print(a)

##sum of all elemennt in this list 
#a = [1,2,3,4,5]
#sum = 0
#for i in a:
#    sum += i
#print(sum)

##reverse list 
#a = ["sachin","arjun","kri","mohit"]
#print(a[::-1])

##duplicat remove
#a = [1,2,3,5,1,3,2,3,5,2,4]
#b = []
#for i in a:
#    if i not in b:
#        b.append(i)
#print(b)

##find duplicates from two list
#a = [1,2,3,4,5]
#b = [0,2,3,4,6]
#
#for i in a:
#    for j in b:
#        if i==j:
#            print(i)

##add two differents lists
#a = [2,3]
#b = [4,5]
#print(a+b)

##Implement python script first n natural number
#a = int(input("Enter till: "))
#for i in range(1,a+1):
#    print(i)

###Implement a python scrpt to gnerte prime number series
#a = int(input("Last number: "))
#count = 0
#for i in range(2,a+1):
#    for h in range(2,i):
#        if i % h == 0:
#            break
#    else:
#        print(i)

### various string 
###next
#a = 'sachin'
#print(a.upper())
#
####position
#
#a = "Krishnveer"
#print(a[1])
#
###using for loop string print

#a = "Krishnveer"
#for i in a:
#    print(i)

### check free in given pragraph
#a = """The new mobile application was completely free to download and use, which was a huge draw for new users. The developer's strategy was to attract a large audience first, then offer optional, premium features for a small fee later. This approach, offering the core product for free, helped the app quickly become one of the most popular downloads in the app store."""
#print("free" in a)

### statement use 
#a = """The new mobile application was completely free to download and use, which was a huge draw for new users. The developer's strategy was to attract a large audience first, then offer optional, premium features for a small fee later. This approach, offering the core product for free, helped the app quickly become one of the most popular downloads in the app store."""
#if "free"in a:
#    print("Yes , free is present")

### Not present chekc
#a = """The new mobile application was completely free to download and use, which was a huge draw for new users. The developer's strategy was to attract a large audience first, then offer optional, premium features for a small fee later. This approach, offering the core product for free, helped the app quickly become one of the most popular downloads in the app store."""
#print("Sahcin"not in a)

##statement use 
#a = """The new mobile application was completely free to download and use, which was a huge draw for new users. The developer's strategy was to attract a large audience first, then offer optional, premium features for a small fee later. This approach, offering the core product for free, helped the app quickly become one of the most popular downloads in the app store."""
#if "sachin"not in a:
#    print("Yes not present")

##reverse string
#name = "Arjun"
#print(name[::-1])

##test 
#name = "Krishnveer"
#print(name[-5:10])  #print output = nveer

##captilization
#name = "mohit"
#print(name.capitalize())

##in or not
#para = "consistency is king because potential is a flirt."
#print("flirt" in para) #second ("flirt" not in para)

##count fuction
#name = "Sachin"
#print(name.count("a"))

##find function
#para = "Java is a powerfull language. is"
#print(para.find("is",6,31))  # para.find("is",skipvalues,skipvalues)

##isalnum function
#h="Sachin45"
#print(h.isalnum()) #if we shall add @#$ then answer false

##isalpha function
#na = "dfas"
#print(na.isalpha()) #only alphabets true otherwise flase

##isdecimal function
#n = "45645"
#print(n.isdecimal()) # you will enter 4232.3 then answer false

##digit function
#n = "974"
#print(n.isdigit())

##isnumeric function
#n = "Ⅱ"
#print(n.isnumeric()) 
## String with Roman numerals
#s6 = "Ⅴ"
#print(s6.isnumeric())

##title function
#title = "how to learn hacking"
#print(title.title()) #outpu How To Learn Hacking

##one skip
#name = "abcdefgh"
#print(name[::2])

##palindron
#name = "naman"
##a = name[::-1]
#if name ==name[::-1]:
#    print("Yes")
#else:
#    print("No")

##g
#x = input("Enter the string ")
#print(x)
#for i in range(0,len(x)):
#    print(i,end="")

##comprasion
#x = "Tarun" 
#y = "Soham"
#if x ==y:
#    print("yes")
#else:
#    print("No")

##Check vowels yes or no
#x = input("Enter Char: ")
#if len(x) == 1 and x.lower() in "aeiou":
#    print("This is a vowel")
#else:
#    print("This is a consonant")

#s#counts vowels and consonants
#sx = input("Enter String: ").lower()
#scount = 0
#sc = 0
#sv = "aeiou"
#sfor i in x:
#s    if i.isalpha():
#s        if i in v:
#s            count +=1
#s        else:
#s            c+=1
#sprint(c," = conso",count," = vowels ")

##replace function
#name = "he is a boy"
#print(name.replace("is","was"))

##find of characters number of vowels blank space
#a = "He is a boy"
#count = 0
#blank = 0
#b = a.lower()
#vo ="aeiou"
#for i in a:
#    if i in vo:
#        count+=1
#    elif i in " ":
#        blank+=1
#print(count)
#print(blank)
#print(len(a))

##find minimize and maximum
#a =[1,2,3,4,5]
#print(max(a))
#print(min(a))