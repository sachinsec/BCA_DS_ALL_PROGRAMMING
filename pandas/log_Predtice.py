import pandas as pd
df = pd.read_csv("Iris.csv")

#data divide
from sklearn.model_selection import train_test_split
x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y=df["Species"]
x_test,x_train,y_test,y_train = train_test_split(x,y,test_size=0.3,random_state=50,stratify=y)

from sklearn.linear_model import LogisticRegression
model=LogisticRegression()
model.fit(x_train,y_train)
c=model.coef_
i=model.intercept_
sc=model.score(x_test,y_test)
pr=model.predict([[5.9,3.0,5.1,1.8]])
print(pr)