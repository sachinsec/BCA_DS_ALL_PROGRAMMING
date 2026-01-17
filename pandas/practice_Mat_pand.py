#import pandas as pd
#df=pd.read_csv("Iris.csv")
#print(df)
#
#from sklearn.model_selection import train_test_split
#x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
#y=df["Species"]
#x_test,x_train,y_test,y_train=train_test_split(x,y,test_size=0.3,random_state=50)
#
#from sklearn.svm import SVC
#model=SVC()
#model.fit(x_train,y_train)
#sc=model.score(x_test,y_test)
#pre=model.predict([[5.0,3.6,1.4,0.2]])
#print(sc)
#print(pre)

##decisiont tree
#import pandas as pd
#df=pd.read_csv("Iris.csv")
#
#from sklearn.model_selection import train_test_split
#x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
#y=df["Species"]
#x_test,x_train,y_test,y_train=train_test_split(x,y,test_size=0.3,random_state=50)
#
#from sklearn.tree import DecisionTreeClassifier
#model=DecisionTreeClassifier()
#model.fit(x_train,y_train)
#sc=model.score(x_test,y_test)
#pre=model.predict([[5.0,3.0,0.1,1.8]])
#print(pre)

#KNN 
import pandas as pd
df=pd.read_csv("Iris.csv")

from sklearn.model_selection import train_test_split
x=df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]]
y=df["Species"]
x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.3,random_state=50)

from sklearn.neighbors import KNeighborsClassifier
value=int(input("Give value for k: "))
knn=KNeighborsClassifier(n_neighbors=value)
knn.fit(x_train,y_train)
sc=knn.score(x_test,y_test)
pre=knn.predict([[5.1,3.8,1.5,0.3]])
print(pre)

from sklearn.metrics import confusion_matrix
y_pre=knn.predict(x_test)
mat=confusion_matrix(y_test,y_pre)
print(mat)

from sklearn.metrics import classification_report
re=classification_report(y_pre,y_test)
print(re)

import matplotlib.pyplot as plt
import seaborn as sns
sns.heatmap(mat,annot=True)
plt.xlabel("Predicate")
plt.ylabel("Actual")
plt.show()

