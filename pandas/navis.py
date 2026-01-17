import pandas as pd
df=pd.read_csv("Iris.csv")

from sklearn.model_selection import train_test_split
x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y=df["Species"]
x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.3,random_state=50)

from sklearn.naive_bayes import GaussianNB
model = GaussianNB()
model.fit(x_train,y_train)
sc =model.score(x_test,y_test)
pre=model.predict([[5.9,3.0,5.1,1.8]])
print(pre)