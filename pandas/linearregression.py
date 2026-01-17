import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import seaborn as sns
from sklearn import linear_model
df = pd.read_csv("Itemprice.csv")
#print(df)

sns.lmplot(x = "Number of items",y = "Prices",data=df)
reg = linear_model.LinearRegression()
reg.fit(df[["Number of items"]],df["Prices"])
plt.show()
predication=reg.predict([[11]])
print(predication)