#import pandas as pd
#import numpy as np
#from sklearn import linear_model
#
#data= {
#    "wind": [12,8,15,11,9],
#    "tmp": [32,34,29,31,30],
#    "rain":[5,0,17,3,0],
#    "humdity":[60,50,68,63,55]
#    }
#df =pd.DataFrame(data)
#print(df)
#
##model train
#reg = linear_model.LinearRegression()
#reg.fit(df[["wind","tmp","rain"]],df["humdity"])
#coe=reg.coef_   ### for find coefficient (weight) yaani output par kitna effect hai sabhi values ka 
#print(coe)        
#inter = reg.intercept_   ## for find intercept ( jab sabhi features 0 ho to humidity)
#print(inter)
#pre = reg.predict([[25,10,15]])
#print(pre)

##Problem: Predict Car Mileage (Fuel Efficiency)
#import pandas as pd
#data = {
#    "Engine_Size": [1.3, 1.5, 1.8, 2.0, 2.2],
#    "Horsepower": [90, 110, 140, 160, 180],
#    "Weight": [1100, 1200, 1300, 1500, 1600],
#    "Mileage": [18, 16, 14, 12, 11]
#}
#
#df =pd.DataFrame(data)
#print(df)
#
##model 
#from sklearn import linear_model
#mod =linear_model.LinearRegression()
#x = df[["Engine_Size","Horsepower","Weight"]]
#y = df["Mileage"]
#mod.fit(x,y)
#e = float(input("Enter Engine_size: "))
#h = float(input("Enter Hosrepower: "))
#w = float(input("Enter Weight: "))
#pre =mod.predict([[e,h,w]])
#print("Mileage is : ",pre)


#Problem: Predict Employee Salary Based on Multiple Factors
import pandas as pd
data = {
    "Experience": [1, 3, 5, 7, 9, 11, 13],
    "Age": [22, 25, 29, 32, 36, 40, 44],
    "Hours_per_Week": [40, 45, 50, 55, 60, 60, 65],
    "Education_Level": [1, 2, 2, 3, 3, 3, 3],
    "Salary": [250000, 420000, 580000, 720000, 850000, 970000, 1050000]
}
df =pd.DataFrame(data)

#model training
from sklearn import linear_model
mod = linear_model.LinearRegression()
x = df[["Experience","Age","Hours_per_Week","Education_Level"]]
y =df["Salary"]
mod.fit(x,y)
e =int(input("Experience: "))
a =int(input("AGe: "))
h =int(input("housr: "))
ed =int(input("Education 1 = High School, 2 = Graduate, 3 = Post Graduate: "))
print(mod.coef_)
pre = mod.predict([[e,a,h,ed]])
print(pre)