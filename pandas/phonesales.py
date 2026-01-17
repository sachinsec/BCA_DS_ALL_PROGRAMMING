import pandas as pd
data =  {
"Mobile":[2,4,6,8,10],
"Profit":[4000,8000,12000,16000,20000]
}
df =pd.DataFrame(data)
print(df)

from sklearn import linear_model
reg = linear_model.LinearRegression()
reg.fit(df[["Mobile"]],df["Profit"])

n =int(input("Enter Mobiles NO: "))
pred =reg.predict([[n]])
print(pred)

import matplotlib.pyplot as plt
import seaborn as sns
sns.lmplot(x="Mobile",y="Profit",data=df)
plt.show()