#linear regression
import pandas as pd
df =pd.read_csv("student_exam_scores.csv")
print(df)

from sklearn import linear_model
mod =linear_model.LinearRegression()
x = df[["hours_studied","sleep_hours","attendance_percent","previous_scores"]]
y = df["exam_score"]
mod.fit(x,y)
h = float(input("Studi hours: "))
s = float(input("Enter Sleep hours: "))
a = float(input("attendance percent: "))
p = float(input("Previous scores: "))
pre = mod.predict([[h,s,a,p]])
print(pre,"\n",mod.coef_,"\n",mod.intercept_)