import pandas as pd
df = pd.read_csv("creditcard.csv")
print(df)

from sklearn.model_selection import train_test_split #data ko training and testing mei divide karta hai 
x_train,x_test,y_train,y_test = train_test_split(df[["Credit_score"]],df["Credit_card"],test_size=0.3) #test_size =0.3 30% data testing ke liye aur 70% data training ke liye use hoga
#x_train training input | y_train training output |x_test input y_test output

from sklearn.linear_model import LogisticRegression #classisfication algorithm ke liye logisitregresion
model = LogisticRegression()
model.fit(x_train,y_train) #model ko fit karega training data par (model seekhata hai ki credit score aur approval ke beech kya relation hai )

pre = model.predict(x_test)
pe = model.predict([[654]])
sco = model.score(x_test,y_test)
print(sco)
print(pre)