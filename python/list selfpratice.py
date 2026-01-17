#a = (input("Enter your name: "))
#print(type(a))
#


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








##list access list
#name =["Sachin","Arjun","Krishnveer","Mohit"]
#print(name[1])
#if "Sachin" in name:
#    print("Yes")

##change list item
#name = ["Sachin","Arjun","Ram"]
#name[0] = "mohit"
#print(name)

##To add an item to the end of the list
#name =["Sachin","Arjun","krishnveer"]
#name.append("Mohit")
#print(name)

##To insert a list item at a specified index
#name = ["Sachin","Arjun","krishnveer"]
#name.insert(0,"Mohit")
#print(name)

##To append elements from another list to the current list
#name =["Sachin","Arjun"]
#name1 = ["Krishnveer","Mohit"]
#name.extend(name1)
#print(name)

##removing list item
#name =["Sachin","arjun","krishnveer"]
#name.remove("krishnveer")
#print(name)

##specific index use pop
#name = ["apple","Banana","papaya"]
#name.pop(0)     #f you do not specify the index, the pop() method removes the last item.
#print(name)    #The clear() method empties the list.


