import pandas as pd
df =pd.read_csv("Iris.csv")
print(df)

from sklearn.model_selection import train_test_split
x = df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y = df["Species"]
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.3, random_state=42)

from sklearn.neighbors import KNeighborsClassifier   #KNN model create
knn=KNeighborsClassifier(n_neighbors=10)   #model 10 nearest neighbours dekakar decide karega
knn.fit(x_train,y_train)    #Model ko training data se patterns sikha diye
a=knn.score(x_test,y_test)  #accuracy
pre=knn.predict([[6.4,2.9,5.1,1.9]])
print(pre)

#Ye function actual vs predicted values ka comparison table banata hai
#Matrix me pata chalta hai model ne kitna sahi aur kitna galat predict kiya
from sklearn.metrics import confusion_matrix   #import confusion_matrix function form sklearn
y_pre=knn.predict(x_test) #model ko test data ke features diye, Model ne uske corresponding class predict ki
cm=confusion_matrix(y_test,y_pre) #y_test → True labels (actual answer),y_pre → Predicted labels (model ka jawab)
print(cm)

import matplotlib.pyplot as plt
import seaborn as sn
sn.heatmap(cm,annot=True) #sn.heatmap() confusion matrix ko color map (heatmap) ke form me show karta hai,annot=True → har cell ke andar number show hota hai
plt.xlabel("Predicted")
plt.ylabel("Truth")
plt.show()

from sklearn.metrics import classification_report  #Ye function model ki performance ka detailed report banata hai
print(classification_report(y_test,y_pre))
