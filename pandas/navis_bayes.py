import pandas as pd
df = pd.read_csv("Iris.csv")
print(df)

from sklearn.model_selection import train_test_split
# drop non-feature columns (Id if present) and ensure Species exists
if "Species" not in df.columns:
	raise KeyError("CSV must contain a 'Species' column")
x = df.drop(["Species", "Id"], axis=1, errors="ignore")
y = df["Species"]
# correct unpacking order and make the split reproducible
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42, stratify=y)

from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score
model = GaussianNB()
model.fit(x_train, y_train)
y_pred = model.predict(x_test)
pre=model.predict(x_test)
sc=model.score(x_test,y_test)
pr=model.predict([[5.0,3.6,1.4,0.2]])
print(pr)

from sklearn.metrics import confusion_matrix
y_pred=model.predict(x_test)
cm=confusion_matrix(y_test,y_pred)
print(cm)

import matplotlib.pyplot as plt
import seaborn as sns
s=sns.heatmap(cm,annot=True)
plt.xlabel("Predict")
plt.ylabel("Actual")
plt.show()

from sklearn.metrics import classification_report
print(classification_report(y_test, y_pred))
