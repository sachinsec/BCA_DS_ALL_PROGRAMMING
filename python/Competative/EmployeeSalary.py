salary = 30000
for i in range(1,6):
   name = input("Enter name: ")
   workingday = int(input("Enter working days: "))
   if(workingday >= 25):
      print("Salary = ",salary)
   elif(workingday>= 22 and workingday<25):
     print("Salary = ",(salary*90)/100)
   elif(workingday>=18 and workingday <=21):
      print("Salary = ",(salary*75)/100)
   else:
      print("Salary = ",30000/2)

