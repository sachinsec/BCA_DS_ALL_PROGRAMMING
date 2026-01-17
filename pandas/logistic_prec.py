import pandas as pd
data = {
    "Study_Hours": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
    "Attendance": [45, 50, 52, 60, 65, 70, 75, 80, 85, 90],
    "Pass_Fail": ["fail", "fail", "fail", "fail", "pass", "pass", "pass", "pass", "pass", "pass"]  # 0 = Fail, 1 = Pass
}
df=pd.DataFrame(data)

#split data testing and training
from sklearn.model_selection import train_test_split
x =df[["Study_Hours","Attendance"]]
y=df["Pass_Fail"]
x_train,x_test,y_train,y_test = train_test_split(x,y,test_size=0.4)

#Train model
from sklearn.linear_model import LogisticRegression
mod = LogisticRegression()
mod.fit(x_train,y_train)

#make prediction
pre =mod.predict(x_test)
score =mod.score(x_test,y_test)

#test form input
s = int(input("Enter Studey HOurs: "))
a = int(input("Enter Attendence: "))
res =mod.predict([[s,a]])

#output
print ("Predection: ",pre)
print (" prediction from input: ",res)
print ("Score: ",score)