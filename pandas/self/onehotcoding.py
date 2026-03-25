import numpy as np
import pandas as pd
from sklearn.preprocessing import OneHotEncoder

df=pd.DataFrame({
    'Color':['Red','Blue','Green','Blue','Blue'],
    'Country':['USA','UK','CANADA','USA','USA'],
    'Id':[1,2,3,4,5]
})
uni=df["Color"].unique()  # for unique
country_uni=df["Country"].unique()

ohe = OneHotEncoder() # creating onehotencoder object
feature_array=ohe.fit_transform(df[["Color","Country"]]).toarray()

feature_labels = ohe.categories_
fea_ou = np.concatenate(feature_array).ravel()
print(feature_labels)
