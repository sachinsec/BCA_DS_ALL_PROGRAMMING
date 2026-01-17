import pandas as pd
df=pd.read_csv("Iris.csv")
print(df)

from sklearn.model_selection import train_test_split
x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y=df["Species"]
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.3, random_state=42, stratify=y)

from sklearn.tree import DecisionTreeClassifier
model=DecisionTreeClassifier()
model.fit(x_train,y_train)
sc=model.score(x_test,y_test)
pre=model.predict([[5.1,3.5,1.4,0.2]])

from sklearn.metrics import confusion_matrix
y_pre = model.predict(x_test)
mat=confusion_matrix(y_pre,y_test)
print(mat)

import matplotlib as plt
import seaborn as sns
sns.heatmap(mat,annot=True)
plt.xlabel("Predict")
plt.ylabel("Actual")
plt.show()