import pandas as pd
data ={
    "area":[2100,1600,2400,1416,3000]
    ,"bedroom":[3,2,4,2,4],
    "age":[20,15,25,20,30]
    ,"price(lakh)":[400,330,369,232,540]

}
df =pd.DataFrame(data)
print(df)

#multi regression concept
from sklearn import linear_model
mult =linear_model.LinearRegression()
mult.fit(df[["area","bedroom","age"]],df["price(lakh)"])
co = mult.coef_
inter = mult.intercept_
#user input
a = int(input("Enter Area: "))
b=int(input("Enter Bedrooms: "))
ag = int(input("Enter Age: "))

pre = mult.predict([[a,b,ag]])
print("Your Price(Lakh): ",pre)