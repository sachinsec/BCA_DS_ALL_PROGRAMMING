import pandas as pd
import numpy as nm
from sklearn.preprocessing import OneHotEncoder

df=pd.read_csv("cars.csv")
# print(df.head(10))

uni =df["brand"].unique()
# print(uni)

uni=df["owner"].unique()
# print(uni)
ohe = OneHotEncoder()
feature_array = ohe.fit_transform(df[["brand"]]).toarray()
feature_label = ohe.categories_
print(feature_array)