#import pandas as pd
#df=pd.read_csv("Iris.csv")
#
#from sklearn.model_selection import train_test_split
#x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
#y=df["Species"]
#x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.3,random_state=50)
#
#from sklearn.neighbors import KNeighborsClassifier
#n=int(input("Enter number of K: "))
#knn = KNeighborsClassifier(n_neighbors=n)
#knn.fit(x_train,y_train)
#sc = knn.score(x_test,y_test)
#pre=knn.predict([[4.9,3.0,1.4,0.2]])
#print(pre)
#
#from sklearn.metrics import confusion_matrix
#y_pre=knn.predict(x_test)
#mat=confusion_matrix(y_test,y_pre)
#print(mat)
#
#from sklearn.metrics import classification_report
#re=classification_report(y_pre,y_test)
#print(re)
#
#import matplotlib.pyplot as plt
#import seaborn as sns
#sns.heatmap(mat,annot=True)
#plt.xlabel("Predict")
#plt.ylabel("Actual")
#plt.show()

import pandas as pd
df=pd.read_csv("student_exam_scores.csv")

from sklearn.linear_model import LinearRegression
model=LinearRegression()
x=df[["hours_studied","sleep_hours","attendance_percent""previous_scores"]]
y=df["exam_score"]

model.fit(x,y)
sc=model.score(x,y)