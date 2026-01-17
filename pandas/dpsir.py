import pandas as pd
df=pd.read_csv("Iris.csv")
print(df.head(5))

from sklearn.model_selection import train_test_split
x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y=df["Species"]
x_train,x_test,y_train,y_test=train_test_split(x,y, test_size=0.3,random_state=50)

from sklearn.svm import SVC
model = SVC()
model.fit(x_train,y_train)
ac=model.score(x_test,y_test)
print(ac)
pre=model.predict([[5.1,3.5,1.4,0.2]])
print(pre)


