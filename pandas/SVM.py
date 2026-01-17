import pandas as pd
df = pd.read_csv("iris.csv")

from sklearn.model_selection import train_test_split 
x_train,x_test,y_train,y_test = train_test_split(df[["SepalLengthCm","SepalWidthCm","PetalLengthCm","PetalWidthCm"]],df["Species"],test_size=0.3,random_state=50)

from sklearn.svm import SVC
model = SVC(kernel='linear')
model.fit(x_train,y_train)
sc =model.score(x_test,y_test) #for check accuracy 
print(sc)
pe = model.predict([[5.1,3.8,3.9,0.4]])
print(pe)
