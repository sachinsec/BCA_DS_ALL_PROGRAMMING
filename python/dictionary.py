dic = {
    "Name":"Arjun",
    "Branch":"BCA",
    "Mob":9832592388
}
#print(dic)
#print(dic.get("Mob"))  #get key
#print(dic.keys())   #print all key

#update dictionary
#dic["Class"] = 12
#print(dic.keys())

#values key 
#print(dic.values())

#items key
#print(dic.items())

##update dictionary
#dic["Name"]="Mohit"
#print(dic)

##update key
#dic.update({"Branch":"Class"})
#print(dic) #now print Class not BCA

#remove using pop key
#dic.pop("Name")
#print(dic)

##popitem key
#dic.popitem() #use for last items remove  #del key use specfic items
#print(dic)

##loop in dictionary
#for i in dic:
#    print(i) #print keys
#    print(dic[i]) #print values

##loop print item
#for i, h in dic.items():
#    print(i,h)

#
## create dictionary 2 emty dictionary  3 access data 4 add dcitionary values 5
#emp = {
#    "Name":"John",
#    "Age":29,
#    "salary":25000,
#    "Company":"Google"
#}
#for i,h in emp.items():
#    print(i,h)

##dictionary
#stud ={
#    "Arjun":{"Roll":44,"Class":12,"Mobile":983382938},
#    "Sachin":{"Roll":54,"Class":12,"Mobile":98338393}
#}
#for i,h in stud.items():
#    print(i,h)

##empty dictionary
#dic = {}
#print(dic)

#student data
n = int(input("Enter STudent number:"))
di={}
for i in range(1,n+1):
    dic={}
    dic["Name "]=input("Enter your name: ")
    dic["Roll no."] = int(input("Enter your roll number: "))
    dic["Branch "] = input("Enter your Branch: ")
    dic["Mob "]=int(input("Enter your contact no.:"))
    di[i]=dic
print(di)
for h,j in di.items():
    print(h,j)