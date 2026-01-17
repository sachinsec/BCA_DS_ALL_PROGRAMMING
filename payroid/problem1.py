import matplotlib.pyplot as plt
student = [ 40 ,55 ,100 ,80 ,25]
grade = ['A','B','C', 'D', 'E']
exp= [0,0,.1,0,0]  #explode word for highlight 
plt.title("Pie chart of students")
plt.pie(student, labels= grade, explode=exp ,autopct='%1.1f%%') # autopct = '%1.1f$$'   use for percentage
plt.show()