#read file handling
f = open("abc.txt","r")
c = f.read(12)
print(c)
f.close()
#
#f= open("abc.txt","r")
#c = f.readline()
#print(c)
#c=f.readlines()
#print(c)
#f.close()

##write file handling
#f= open("abc.txt","w")
#c=f.write("my name is sachin\nI am a student\n")
#f.close()

#f = open("abc.txt","w")
#l1=["abc,xyz,pqr,wxy\n1,2,3,4,5\nfile1,file2,file3"]
#f.writelines(l1)
#f.close()

##Appened file handling
#f =open("abc.txt","a")
#c=f.write("\ndjfaskfjdlkj\nsdkjf")
#f.close()