import pandas as pd
df = pd.read_csv("Iris.csv")
print(df)

from sklearn.model_selection import train_test_split
x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y=df["Species"]
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.3, random_state=42, stratify=y)

from sklearn.tree import DecisionTreeClassifier
model=DecisionTreeClassifier()
model.fit(x_train,y_train)
a=model.score(x_test,y_test)
pre=model.predict([[6.7,3.0,5.2,2.3]])
print(pre)
 