import pandas as pd
data ={
    "Mobile":[2,4,6,8,10],
    "Ad":[1000,1500,2000,2500,3000],
    "Profit":[4000,8500,12500,16500,21000]
}
df = pd.DataFrame(data)
print(df)

#model train
from sklearn import linear_model
reg = linear_model.LinearRegression()
reg.fit(df[["Mobile","Ad"]],df["Profit"])

n = int(input("Enter number Mobile: "))
m = int(input("Enter Ad: "))
pred = reg.predict([[n,m]])
print(pred)

#Graph
import seaborn as sks
import matplotlib.pyplot as plt
sks.lmplot(x ="Mobile",y="Profit",data=df)
plt.show()