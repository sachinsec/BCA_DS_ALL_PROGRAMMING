import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns   # data visulation (charts,graphs aur pattern ke form mein understand karne ke liye)
from sklearn import linear_model

#for graph
df =pd.read_csv("Jeans and price.csv")
sns.lmplot(x ="Jeans Qu.",y="Price",data=df) #lmplot() linear regression line dekhata hai 
plt.show()

#prediction
reg=linear_model.LinearRegression()  #create linear regresion model 
reg.fit(df[["Jeans Qu."]],df["Price"])  #model train | (df["price"]) target jise predict karna hai
pred =reg.predict([[11]])
print(pred)